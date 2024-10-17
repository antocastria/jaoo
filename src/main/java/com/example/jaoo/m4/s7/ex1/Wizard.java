package com.example.jaoo.m4.s7.ex1;

public class Wizard extends Actor {

	protected Wizard(String name, int forza) {
		super(name, forza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean fight(Actor enemy) {
		// TODO Auto-generated method stub
		if (enemy instanceof Warrior) {
			return true;
		}
//			
		return forza > enemy.forza;
	}

	@Override
	public String toString() {
		return "Wizard [name=" + name + ", forza=" + forza + "]";
	}

}
