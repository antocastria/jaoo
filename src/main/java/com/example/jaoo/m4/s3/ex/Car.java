/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m4.s3.ex;

import java.util.logging.Logger;

/**
 * TODO: is-a Vehicle and Conditioning
 */
public class Car extends Vehicle implements Conditioning {
	private int temperature;
	private static final Logger log = Logger.getGlobal();

	/**
	 * No-arg constructor
	 */
	public Car() {
		log.info("Car created");
	}

	public Car(int temperature) {
		this.temperature = temperature;
	}

	@Override
	public void conditioning(int temperature) {
		// TODO Auto-generated method stub
		log.info("Temperature= " + temperature);
	}

	@Override
	public String toString() {
		return "Car [temperature=" + temperature + "]";
	}
}
