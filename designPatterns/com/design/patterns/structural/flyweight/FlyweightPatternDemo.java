package com.design.patterns.structural.flyweight;

/**
 * Flyweight pattern is primarily used to reduce the number of objects created,
 * to decrease memory footprint and increase performance
 * 
 * @author asax22
 * 
 */
public class FlyweightPatternDemo {



	public static void main(String[] args) {

		for (long i = 0; i < 3; i++) {
			for (long j = 0; j < 3; j++) {
				Product p = ProductFactory.getProduct(j, j);

				p.updateDM();
			}
		}
	}
}