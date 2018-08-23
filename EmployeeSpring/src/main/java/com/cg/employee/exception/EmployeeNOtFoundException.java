package com.cg.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeNOtFoundException extends RuntimeException{
	public EmployeeNOtFoundException(String exception)
	{
		super(exception);
	}

}
