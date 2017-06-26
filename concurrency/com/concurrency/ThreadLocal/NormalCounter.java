package com.concurrency.ThreadLocal;

public class NormalCounter {
	
	 Long count = 0L; 

	      
	    
	    public void incrementCount(){
	    	count++;
	    }
	    
	    public Long getCount(){
	    	return count;
	    }

}
