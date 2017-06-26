package com.sapient.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestThread {

	public static void main(String[] args) throws InterruptedException {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(200001);
		
		ThreadOne r = new ThreadOne(list);
		Thread t = new Thread(r);
		t.start();
		Thread.sleep(2000);
		System.out.println(list.get(0));
		System.out.println("MAIN THREAD --> "+list.toString());				

	}

}
