package com.sapient.generic;

public class GenericClass2<T extends HREmployee> {
	
	private Employee e;
	
	private T t;
	
	public <V> GenericClass2(V v ){
		System.out.println(v);
	}
	
	public <V> V GenericClass2(V v ){
		System.out.println(v);
		return v;
	}

}
