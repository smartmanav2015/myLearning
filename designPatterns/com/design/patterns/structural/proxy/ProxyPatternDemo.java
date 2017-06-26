package com.design.patterns.structural.proxy;

//In Proxy pattern, a class represents functionality of another class
public class ProxyPatternDemo {
	
	   public static void main(String[] args) {
	      Transaction txn = new SpringTransaction("ADD");

	      //image will be loaded from disk
	      txn.doTransaction(); 
	      
	      //image will not be loaded from disk
	      txn.doTransaction(); 	
	   }
	}
