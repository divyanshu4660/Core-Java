package com.rays.oop.methodoverloading;

public class TestMethodOverloading {
	public static void main(String[] args) {

		MethodOverloading m = new MethodOverloading();

		m.sum(5, 10);
		m.sum(5, 45, 14);
		m.sum(5.2, 10.2);

	}
}
