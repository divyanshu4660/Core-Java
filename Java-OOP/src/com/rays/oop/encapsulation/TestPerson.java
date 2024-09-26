package com.rays.oop.encapsulation;

import java.util.Date;

public class TestPerson {

	public static void main(String[] args) {

		Date d = new Date(2002, 03, 26);

		Person p = new Person();

		p.setName("Divyanshu");
		System.out.println(p.getName());
		p.setAddress("Indore");
		System.out.println(p.getAddress());
		p.setDob(d);
		System.out.println(p.getDob());
	}

}
