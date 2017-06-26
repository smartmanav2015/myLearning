package com.sapient.list;

import java.util.List;
import java.util.Map;

public class ThreadOne implements Runnable {
	
	
	private List<Integer> list;
	
	

	public ThreadOne(List<Integer> list) {
		super();
		this.list = list;
	}



	@Override
	public void run() {
		
		for(int i=0;i<1000;i++){
			list.add(i);
			System.out.println(" THREAD ONE --> "+list.toString());
		}
		
		

	}

}
