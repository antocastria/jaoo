/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m4.s3.ex;

import java.util.logging.Logger;

/**
 * TODO: Flat is-a Conditioning
 */
public class Flat implements Conditioning {
	private static final Logger log = Logger.getGlobal();
	private int temperature;

	/**
	 * No-arg constructor
	 */
	public Flat(int temperature) {
		log.info("Flat created");
		this.temperature = temperature;
	}

	public Flat() {
		log.info("Flat created");
	}

	@Override
	public void conditioning(int temperature) {
		// TODO Auto-generated method stub
		log.info("Temperature= " + temperature);
	}

	@Override
	public String toString() {
		return "Flat [temperature=" + temperature + "]";
	}

}
