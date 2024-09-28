package com.rays.oop.methodoverloading;
//same method with different parameters and different data types is called method overloading
public class MethodOverloading {
	public void sum(int a, int b) {

		System.out.println("sum of two no = " + (a + b));

	}

	public void sum(int a, int b, int c) {

		System.out.println("sum of three no = " + (a + b + c));

	}

	public void sum(double a, double b) {

		System.out.println("sum of two double no = " + (a + b));

	}

}
