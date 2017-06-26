package com.customException;

public class CustomCheckedException extends Exception {
	
	
	public CustomCheckedException(String message){
		super(message);
	}
	
	public CustomCheckedException(Throwable t){
		super(t);
	}
	
	public CustomCheckedException(String message, Throwable t){
		super(message, t);
	}

}
