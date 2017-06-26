package com.concurrency.semaphores;

import java.util.concurrent.Semaphore;

public class HRManager {
	 
	 public static void main(String args[]){
	  Semaphore questionPaperPool = new Semaphore(2);
	  
	  Employee emp1 = new Employee(questionPaperPool,"Arch");
	  Employee emp2 = new Employee(questionPaperPool,"TL");
	  Employee emp3 = new Employee(questionPaperPool,"SD");
	  Employee emp4 = new Employee(questionPaperPool,"SE");
	  
	  
	  emp1.start();
	  emp2.start();
	  emp3.start();
	  emp4.start();
	  
	  System.out.println("No work for HR manager");
	  
	 }

	}
