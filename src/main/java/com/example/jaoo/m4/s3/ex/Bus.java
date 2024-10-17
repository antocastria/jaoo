/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m4.s3.ex;

import java.util.logging.Logger;

/**
 * TODO: Bus is-a Vehicle and Conditioning
 */
public class Bus extends Vehicle implements Conditioning {
	private int temperature;
	private static final Logger log = Logger.getGlobal();

	/**
	 * No-arg constructor
	 */
	public Bus() {
		log.info("Bus created");
	}

	public Bus(int temperature) {
		this.temperature = temperature;
	}

	@Override
	public void conditioning(int temperature) {
		// TODO Auto-generated method stub
		log.info("Temperature= " + temperature);
	}

	@Override
	public String toString() {
		return "Bus [temperature=" + temperature + "]";
	}
}
