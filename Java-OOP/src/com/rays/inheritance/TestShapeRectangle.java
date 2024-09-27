
package com.rays.inheritance;

public class TestShapeRectangle {

	public static void main(String[] args) {
		
		Rectangle r =new Rectangle();
		
		r.setColor("blue");
		r.setLength(5);
		r.setWidth(4);
		
		System.out.println("  color ="+r.getColor());
		System.out.println("length ="+r.getLength());
		System.out.println("getwith ="+r.getWidth());
		
		System.out.println("area ="+r.area());
				
			
	}
}