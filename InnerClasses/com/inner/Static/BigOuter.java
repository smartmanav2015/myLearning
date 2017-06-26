package com.inner.Static;

public class BigOuter {	
	
				static class BigOuterStatic {
					void go() {
						System.out.println("Nest Static");
					}
				}
	
}

class Inner {
	
				static class InnerStatic {
					void goB2() {
						System.out.println("Broom Static");
					}
				}
				
				class Testinner{
					InnerStatic inn = new InnerStatic();
				
				}


				public static void main(String[] args) {
					
					BigOuter.BigOuterStatic o1 = new BigOuter.BigOuterStatic(); // both class names
					o1.go();
					
					InnerStatic b2 = new InnerStatic(); // access the enclosed class
					b2.goB2();
				}

}