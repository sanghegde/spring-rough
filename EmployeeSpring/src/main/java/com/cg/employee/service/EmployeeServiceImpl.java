package com.cg.employee.service;

import java.util.List;
import java.util.Optional;

import javax.swing.text.html.Option;

import org.springframework.stereotype.Service;


import com.cg.employee.dao.EmpoyeeDao;
import com.cg.employee.pojo.Customer;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	 EmpoyeeDao dao;

	public List<Customer> viewAll() {
		
		return dao.findAll();
	}

	public void addTopic(Customer customer) {
	dao.save(customer);
		
	}

	public void deleteEmployee(Customer customer) {
	dao.save(customer);
		
	}

	/*public void updateEmployee(String id, Customer customer1) {
		dao.
		
	}*/

	public Optional<Customer> getEmployee(String id) {
		return dao.findById(Integer.parseInt(id));
		 
	}

	

}
