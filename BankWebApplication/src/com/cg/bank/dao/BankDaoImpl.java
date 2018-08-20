package com.cg.bank.dao;



import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import cpm.cg.book.pojo.Customer;

public  class BankDaoImpl implements BankDao{
	
	static Customer customer=new Customer();
	 
	   static Customer customer1=new Customer(123, "abc", 423565, "abc", "abc", "abc", 100);
	   static Customer customer2=new Customer(123, "abc", 423565, "abc", "abc", "abc", 100);
	   static Customer customer3=new Customer(125, "abc", 423565, "abc", "abc", "abc", 100);
	   static Customer customer4=new Customer(126, "abc", 423565, "abc", "abc", "abc", 100);
	   
	   List<Customer>list=new ArrayList<>();
	   
	   public Customer searchById(int id)
	   {
		   Customer c=null;
		   for(Customer customer:list) {
			   if(customer.getCustomerId()==id)
			   {
				   c=customer;
			   }
		   }
		   return c;
	   }

	@Override
	public long withDraw(int id, int ammount) {
		viewALL();
		Customer c=searchById(id);
		c.setBalance(c.getBalance()-ammount);
		return c.getBalance();
	}

	@Override
	public long deposit(int id1, int ammount) {
		Customer c=searchById(id1);
		c.setBalance(c.getBalance()+ammount);
		return c.getBalance();
		
		
		
	}

	@Override
	public List<Customer> viewALL() {
		list.add(customer1);
		list.add(customer2);
		list.add(customer3);
		list.add(customer4);
		return list;
		
	}
	
  

	

	
    
   
    
 
    

	}

