/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m4.s7.ex1;

/**
 * Exercise: create a hierarchy of classes
 * <p>
 * Abstract base class
 */
public abstract class Actor {
	protected String name;
	protected int forza;
    /**
     * Canonical constructor
     * 
     * @param name the actor name
     */
    protected Actor(String name, int forza) {
    	this.name=name;
    	this.forza=forza;
        // TODO
    }
protected Actor(String name) {
}

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getForza() {
		return forza;
	}

	public void setForza(int forza) {
		this.forza = forza;
	}

	/**
     * Fight against an enemy
     * 
     * @param enemy another actor
     * @return true if the current actor wins
     */
    public abstract boolean fight(Actor enemy); //ogni attore combatte in modo diverso
}
