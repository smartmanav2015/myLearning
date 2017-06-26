package com.inner.Anonymous;



/**
 * Anonymous Class
 * 
 *
 */
public class Popcorn {
	
	public void pop() {
		System.out.println("popcorn");
	}
	
}


class Food {
	
	Popcorn p = new Popcorn() {
				public void pop() {
					System.out.println("anonymous popcorn");
				}
	};
	
	public static void main(String args[]){
		Food f = new Food();
		Popcorn obj = f.p;
		obj.pop();
	}
}