package com.cg.book.service;

import java.util.List;

import com.cg.bank.dao.BankDaoImpl;

import cpm.cg.book.pojo.Customer;



public class BankServiceImpl implements BankService {
	
	 BankDaoImpl dao=new BankDaoImpl();

	@Override
	public long withdraw(int id, int ammount) {
		
		return dao.withDraw(id, ammount);
	}

	@Override
	public long deposit(int id1, int ammount) {
		
		return dao.deposit(id1, ammount);
	}

	@Override
	public List<Customer> viewALL() {
		
		return dao.viewALL();
	}
	 
	
	
	
}

	