package com.sapient;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;

public class TestMRef {

	public static void main(String[] args) {
		/*test();
		for(int i =0; i>=0;i=i+10000){
			System.out.println(i);
		}*/
		Map<Emp, String> map = new HashMap<Emp, String>();
		Emp e1 = new Emp("aakash");
		Emp e2 = new Emp("aakash");
		map.put(e1, "saxena");
		System.out.println(map.get(e2));

		
	}

	public static void test(){
		Emp e = new Emp("aakash");
		ReferenceQueue<Object> q = new ReferenceQueue<Object>();
		PhantomReference<Emp> ref = new PhantomReference<Emp>(e, q);
	}
}
