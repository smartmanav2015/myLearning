package com.rbs.exception;

public class CheckedException extends Exception {
	
	private static final long serialVersionUID = 1L;

	private long errorCode;
	
	private String message;
	
	public CheckedException(String message, long errorCode){
		this.errorCode = errorCode;
		this.message = message;		
	}
	
	public CheckedException(String message, long errorCode, Throwable t){
		super(message,t);
		this.errorCode = errorCode;
		this.message = message;		
	}

}
