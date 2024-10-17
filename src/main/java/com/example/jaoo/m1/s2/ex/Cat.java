/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s2.ex;

/**
 * Exercise: Complete the Cat class definition
 */
public class Cat {
	private int happiness;

	// TODO: define the method meow() that prints "meow!" to standard output
	Cat() {
		this.happiness = 0;
	}

	void pet() {
		System.out.println("*carezza*");
		happiness += 1;
	}

	public int gethappiness() {
		return happiness;
	}
}
