package com.rays.test;

public class CircleOne extends ShapeOne {
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double area() {
		double area =Math.PI * radius * radius;
		return area;
	}
	

}
