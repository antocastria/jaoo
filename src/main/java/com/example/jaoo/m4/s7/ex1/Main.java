/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m4.s7.ex1;

import java.util.Arrays;

//step 1: crea classi figlie guerriero e mago
/**
 * Exercise: create a hierarchy of classes based on Actor
 * <p>
 * Warrior: could fight, can't do any magic
 * <p>
 * Wizard: can't fight, could do magic
 */
public class Main {
	/**
	 * Create a bunch of actors
	 * <p>
	 * Let them fight against each others
	 * <p>
	 * Peer-to-peer fight, the most skilled one wins //livello più alto
	 * <p>
	 * Wizards always beat warriors
	 * <p>
	 * In the end, let the user knows who survived
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		// TODO: create actors, both warriors and wizards
		Actor[] actors = { new Warrior("Kim", 8), new Wizard("Gandalf", 27), new Wizard("Silente", 22),
				new Warrior("Gatsu", 30) }; // new di warrior e wizard

		for (Actor actor : actors) {
			System.out.println(actor);
		}

		System.out.println("Let's fight ...");
		for (Actor actor : actors) {
			System.out.println("Actor: " + actor);
		}

		for (int j = 0; j < actors.length - 1; j++) {
			for (int i = 0; i < actors.length - 1 - i; i++) {
				boolean fight = actors[i].fight(actors[i++]);
				if (fight = true) {
					Actor winner = actors[i];
					actors[i] = actors[i + 1];
					System.out.println("the winner is " + winner);
				}
			}
		}

	}
}
