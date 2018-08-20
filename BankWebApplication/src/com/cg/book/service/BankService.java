package com.cg.book.service;

import java.util.List;

import cpm.cg.book.pojo.Customer;



public interface BankService {

public long withdraw(int id,int ammount);
public long deposit(int id,int  ammount);
 
 public List<Customer>viewALL();


}
