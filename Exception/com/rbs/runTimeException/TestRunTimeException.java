package com.rbs.runTimeException;

public class TestRunTimeException {
	
	public static void main (String args []){
		
		try{
			test();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public static void test(){
		try{
		int i = 5/0;
		}catch(RuntimeException e){
			throw new CustomRunTimeException(e);
		}
	}

}
