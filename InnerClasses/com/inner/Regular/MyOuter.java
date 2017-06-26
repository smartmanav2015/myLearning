package com.inner.Regular;

public class MyOuter {
	
	private int x = 7;

	public void makeInner() {
		MyInner in = new MyInner();
		in.seeOuter();
	}

				class MyInner {
					
					int y = 10;
							
					public void seeOuter() {
						System.out.println("Outer x is " + x);
						System.out.println("Inner class ref is " + this);
						System.out.println("Outer class ref is " + MyOuter.this);
						makeInner();
					}
				}
						

	public static void main(String[] args) {
		MyOuter.MyInner inner = new MyOuter().new MyInner();
		inner.seeOuter();
	}
	
	public void accessIner(){
		System.out.println(new MyInner().y);
		
	}
	
	
}
