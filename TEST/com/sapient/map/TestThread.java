package com.sapient.map;

import java.util.HashMap;

public class TestThread {

	public static void main(String[] args) throws InterruptedException {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(2000001, 2000001);
		map.put(2000002, 2000002);
		
		ThreadOne r = new ThreadOne(map);
		Thread t = new Thread(r);
		t.start();
		Thread.sleep(2000);
		map.get(1);
		System.out.println("MAIN THREAD --> "+map.entrySet());				

	}

}
