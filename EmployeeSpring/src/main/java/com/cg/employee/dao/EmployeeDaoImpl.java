package com.cg.employee.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;


import com.cg.employee.pojo.Customer;

@Repository
public class EmployeeDaoImpl implements EmpoyeeDao {
	private List<Customer> customer = new ArrayList<>(
			Arrays.asList(new Customer("123", "abc", "def", "pqr", "stu", "xts"),
					new Customer("124", "abc", "def", "pqr", "stu", "xts"),
					new Customer("125", "abc", "def", "pqr", "stu", "xts")));

	public List<Customer> viewAll() {

		return customer;
	}

	public void addTopic(Customer customer1) {
		customer.add(customer1);
		
	}

	public void deleteEmployee(String id) {
		customer.removeIf(t->t.getCustomerId().equals(id));
		
	}

	public void updateEmployee(String id, Customer customer1) {
		for(int i=0;i<customer .size();i++)
		{
			Customer t=customer .get(i);
			if(t.getCustomerId().equals(id)) {
				customer .set(i, customer1);
				return;
			}
		}
	
		
	}
	

	
}
