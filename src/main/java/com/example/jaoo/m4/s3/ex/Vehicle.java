/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m4.s3.ex;

import java.util.logging.Logger;

/**
 * Base of a class hierarchy
 * <P>
 * TODO: it should steer left/right, it should brake
 */
public class Vehicle {
	private static final Logger log = Logger.getGlobal();

	public void steerLeft() {
		log.info("steerLeft");
	}

	public void steerRight() {
		log.info("steerRight");
	}

	public void brake() {
		log.info("brake");
	}

	/**
	 * No-arg constructor
	 */
	public Vehicle() {
		log.info("Vehicle created");
	}
}
