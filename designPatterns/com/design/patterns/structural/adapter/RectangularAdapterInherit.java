package com.design.patterns.structural.adapter;

public class RectangularAdapterInherit extends CylindricalSocket {
	
	public int adapt(int rectaStem1, int rectaStem2) {
		// some conversion logic		
		return supplyCylinder(rectaStem1, rectaStem2);
	}
	
	
	public int supplyRect(int recStem1, int recStem2) {
		System.out.println("Power power power...");
		return recStem1 + recStem2 + 10;
	}
}
