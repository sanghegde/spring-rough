package com.cg.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.employee.dao.EmployeeDaoImpl;
import com.cg.employee.pojo.Customer;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	 EmployeeDaoImpl empl=new EmployeeDaoImpl ();

	public List<Customer> viewAll() {
		
		return empl.viewAll();
	}

	public void addTopic(Customer customer) {
		empl.addTopic(customer);
		
	}

	public void deleteEmployee(String id) {
	empl.deleteEmployee(id);
		
	}

	public void updateEmployee(String id, Customer customer1) {
		empl.updateEmployee(id,customer1);
		
	}

}
