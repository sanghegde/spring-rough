package com.cg.book.cntroller;

import java.awt.print.Book;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.book.service.BankServiceImpl;


import cpm.cg.book.pojo.Customer;

@WebServlet("*.app")
public class BankServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	BankServiceImpl service=new BankServiceImpl();
	Customer customer=new Customer();
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session=request.getSession();
		String action = request.getServletPath();
		
		
		
		switch(action)
		{
		case "/withdraw.app":
			int id=Integer.parseInt(request.getParameter("custid"));
			int ammount=Integer.parseInt(request.getParameter("ammount"));
			System.out.println(ammount+id);
			long res=service.withdraw(id,ammount );
			
			
			session.setAttribute("Balance", res);
			RequestDispatcher dispatcher=request.getRequestDispatcher("balance.jsp");
			dispatcher.forward(request, response);
			break;
			
		case "/deposit.app":
			int id1=Integer.parseInt(request.getParameter("custid"));
			int ammount1=Integer.parseInt(request.getParameter("ammount"));
			long res1=service.deposit(id1, ammount1);
			session.setAttribute("Balance", res1);
			RequestDispatcher dispatcher1=request.getRequestDispatcher("balance.jsp");
			dispatcher1.forward(request, response);
			break;
			
		case "/view.app":
			List<Customer>list=service.viewALL();
			session.setAttribute("Balance", list);
			RequestDispatcher dispatcher2 = request.getRequestDispatcher("viewallcustomers.jsp");
			dispatcher2.forward(request, response);
			break;
			
			
			
			
			

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
