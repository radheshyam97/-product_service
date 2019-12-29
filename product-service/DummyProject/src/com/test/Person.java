package com.test;

public class Person {

	protected String name;

	public void printName() {

		System.out.println(this.getClass().getCanonicalName());
		System.out.println("name: " + name);
	}

}
