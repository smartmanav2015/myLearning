package com.TreeSet;

import java.util.Collection;
import java.util.TreeSet;

import com.entity.Payment;

public class TreeSetTest {
	
	public void te(){
		synchronized ("as") {
			
		}
	}
	
	private  int num;

	public static void main(String[] args) {
		Payment p1 = new Payment(1, "sbi", 11000);
		Payment p2 = new Payment(2, "pnb", 2000);
		
		TreeSet<Payment> set = new TreeSet<Payment>();
		set.add(p1);
		set.add(p2);
		print(set);
	}
	
	public static void print(Collection<Payment> coll){
		
		for(Payment p : coll){
			System.out.println(p.getAmount());
		}
	}

}
