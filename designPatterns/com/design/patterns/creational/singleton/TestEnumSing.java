package com.design.patterns.creational.singleton;

public class TestEnumSing {

	public static void main(String[] args) throws CloneNotSupportedException {
		SingletonObjectEnum.INSTANCE.display();
		SingleObject s =SingleObject.getInstance();
		
	}

}
