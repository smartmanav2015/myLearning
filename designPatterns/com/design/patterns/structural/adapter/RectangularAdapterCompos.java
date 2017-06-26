package com.design.patterns.structural.adapter;

public class RectangularAdapterCompos {
	
	CylindricalSocket c = new CylindricalSocket();
	
	public int adapt(int rectaStem1, int rectaStem2) {
		
		return c.supplyCylinder(rectaStem1, rectaStem2);
	}
	
	public int supplyRect(int recStem1, int recStem2) {
		System.out.println("Power power power...");
		return recStem1 + recStem2 + 10;
	}
}
