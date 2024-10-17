/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m4.s5;

/**
 * A class extending Dog. Show the use of "super()" in constructor and "super."
 * in toString()
 */
public class Poodle extends Dog {
	private String owner;

	/**
	 * Canonical constructor
	 * 
	 * @param name  dog name
	 * @param owner dog owner
	 */
	public Poodle(String name, String owner) {
		super(name);

		this.owner = owner;
	}

	public void bark() {
		System.out.println("grr ...");
		super.bark();
		System.out.println("... grr ");
		// TODO Auto-generated method stub
	}

	@Override
	public String toString() {
		return "Poodle [owner=" + owner + ", toString()=" + super.toString() + "]";
	}

}
