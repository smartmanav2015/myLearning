package com.customException;

public class CustomUnCheckedException extends RuntimeException {
	
	
	public CustomUnCheckedException(String message){
		super(message);
	}
	
	public CustomUnCheckedException(Throwable t){
		super(t);
	}
	
	public CustomUnCheckedException(String message, Throwable t){
		super(message, t);
	}

}
