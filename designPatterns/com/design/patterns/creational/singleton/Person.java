package com.design.patterns.creational.singleton;

public class Person {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		Person p = new Person("Sam");
		try {
			// Person class doesn't implement Cloneable but tries to get clone. It fails
			// with CloneNotSupportedException
			Person pClone = (Person) p.clone();
			System.out.println(pClone.getName());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}