package com.inner.MethodLocal;

public class MethodLocal {
	
	private String x = "Outer2";

	public void doStuff(int y ) {
		
					class MyInner {
						
						public void seeOuter(int y) {
							System.out.println("Outer x is " + x);
							System.out.println("MethodLocal argument y is " + y);
							
						} 
					
					} 
		
		MyInner mi = new MyInner(); // This line must come after the class
		mi.seeOuter(y);
	} 	
	
	public static void main(String ...a){
		
		MethodLocal o = new MethodLocal();
		o.doStuff(3);
		
	}
	
}
