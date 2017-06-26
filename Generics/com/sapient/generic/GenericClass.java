package com.sapient.generic;

public class GenericClass<T extends HREmployee> {
	
	private Employee e;
	
	private T t;
	
	public <V> GenericClass(V v ){
		System.out.println(v);
	}

}
