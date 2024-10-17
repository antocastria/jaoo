/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s2.ex;

/**
 * Exercise: create a cat and let it meow
 */
public class Main {
	public static void main(String[] args) {
		// TODO 1: Define a reference variable Cat referring to a new Cat object
		Cat gatto = new Cat();

		// TODO 2: Invoke the method meow() on it
		System.out.println("la felicità del gatto è " + gatto.gethappiness());
		gatto.pet();

		int cathappiness = gatto.gethappiness();
		System.out.println("adesso la felicità del gatto è " + cathappiness);
	}
}
