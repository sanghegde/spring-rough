package com.cg.controller.sub;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {
	@RequestMapping(value="/hello" )
	public String sayHello(String name)
	{
		return "HELLO"  +name;
	}
	
	

}
