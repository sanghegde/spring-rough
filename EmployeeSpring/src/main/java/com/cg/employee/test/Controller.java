package com.cg.employee.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.cg.employee.pojo.Customer;
import com.cg.employee.service.EmployeeServiceImpl;

@RestController
public class Controller {
	@Autowired
private EmployeeServiceImpl em;
	@RequestMapping("/customer")
	public List<Customer> viewAll()
	{
		return em.viewAll();
	}
@RequestMapping(method=RequestMethod.POST,value="/customer")
	public void addEmployee(@RequestBody Customer customer)
	{
		em.addTopic(customer);
	}
/*@RequestMapping(method=RequestMethod.DELETE,value="/customer/{id}")
public void deleteEmployee(@PathVariable String id)
{
	em.deleteEmployee(id);
}
@RequestMapping(method=RequestMethod.PUT,value="/customer/{id}")
public void updateTopic(@RequestBody Customer customer,@PathVariable String id)
{
	em.updateEmployee(id,customer);
}*/
@RequestMapping("/customer/{id}")
public Optional<Customer> getTopic(@PathVariable String id)
{
	return em.getEmployee(id);

}
@RequestMapping(method=RequestMethod.GET,value="/customer/{start}/{count}")
public Resources getCustomerByPages(@PathVariable int start,@PathVariable int count) {
	List<Customer>tempcustomers=em.viewAll();
	List<Customer>customer=new ArrayList<>();
	for(int i=start;i<start+count;i++)
	{
		customer.add(tempcustomers.get(i));
	}
	Link nextLink=linkTo(methodOn(this.getClass()).getCustomerByPages(start+count,count)).withRel("nestLink");
	Link prevLink=linkTo(methodOn(this.getClass()).getCustomerByPages(start-count=0?start-count:1,count)).withRel("previousLink");
	return new Resources<>(customer,nextLink,prevLink);
}


}
