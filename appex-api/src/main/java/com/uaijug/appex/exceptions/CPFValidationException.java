package com.uaijug.appex.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.BAD_REQUEST, reason = "O CPF informado não é correto.")
public class CPFValidationException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public CPFValidationException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CPFValidationException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	public CPFValidationException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public CPFValidationException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public CPFValidationException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	
}
