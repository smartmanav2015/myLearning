package com.journaldev.sort;

public class StringTest {

	public static void main(String[] args) {
		
		String s = "   aakash   ";
		trimString(s);

	}
	
	public static String trimString(String s){
		
		while(s.indexOf(" ") == 0){
			s = s.substring(1);
		}
		
		while(s.indexOf(" ")==s.length() - 1){
			s = s.substring(0, s.length()-2);
			
		}
		
		
		
		
		
		System.out.println("#"+s+"#");
		
		return s;
		
	}

}
