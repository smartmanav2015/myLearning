package com.design.patterns.structural.adapter;

/**
 * 
 * Adapter pattern works as a bridge 
 * between two incompatible interfaces.
 * 
 * @author Akki
 * 
 */
public class RectangularPlugTest {
	
	private int rectaStem1;
	private int rectaStem2;

	public void getPower() {
		RectangularAdapterInherit adapter = new RectangularAdapterInherit();
		int power = adapter.adapt(rectaStem1, rectaStem2);
		System.out.println(power);
	}
}
