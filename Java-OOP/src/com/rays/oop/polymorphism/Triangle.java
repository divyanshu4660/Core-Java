package com.rays.oop.polymorphism;

public class Triangle extends Shape{
	private int base;
	private int hieght;
	

public Triangle() {
	
}
public Triangle(int base, int hight) {
	this.base = base;
	this.hieght = hight;
}

public int getBase() {
	return base;
}

public void setBase(int base) {
	this.base = base;
}

public int getHieght() {
	return hieght;
}

public void setHight(int hight) {
	this.hieght = hieght;
}
}
