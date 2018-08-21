package com.cg.employee.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping(method=RequestMethod.DELETE,value="/customer/{id}")
public void deleteEmployee(@PathVariable String id)
{
	em.deleteEmployee(id);
}
@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
public void updateTopic(@RequestBody Customer customer,@PathVariable String id)
{
	em.updateEmployee(id,customer);
}
	
}
