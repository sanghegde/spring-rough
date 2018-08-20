package com.cg.bank.dao;

import java.util.Collection;
import java.util.List;


import cpm.cg.book.pojo.Customer;

public interface BankDao {
	public long withDraw(int id, int ammount);
	public long deposit(int id, int  ammount);
	
public	List<Customer> viewALL();
	

}
