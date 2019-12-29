package com.test;

public class Emp extends Person{

	protected double sal;
	public void printSal() {
		
		System.out.println("sal: "+sal);
		System.out.println(this.getClass().getCanonicalName());

	} 
}
