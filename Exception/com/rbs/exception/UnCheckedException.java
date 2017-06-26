package com.rbs.exception;

public class UnCheckedException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long errorCode;
	
	private String message;
	
	public UnCheckedException(String message, long errorCode){
		this.errorCode = errorCode;
		this.message = message;		
	}
	
	public UnCheckedException(String message, long errorCode, Throwable t){
		super(message,t);
		this.errorCode = errorCode;
		this.message = message;		
	}

	public UnCheckedException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UnCheckedException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public UnCheckedException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public UnCheckedException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	

}
