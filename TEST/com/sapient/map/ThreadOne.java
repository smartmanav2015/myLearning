package com.sapient.map;

import java.util.Map;

public class ThreadOne implements Runnable {
	
	
	private Map map;
	
	

	public ThreadOne(Map map) {
		super();
		this.map = map;
	}



	@Override
	public void run() {
		
		for(int i=0;i<1000;i++){
			map.put(i,i);
			System.out.println(" THREAD ONE --> "+map.entrySet());
		}
		
		

	}

}
