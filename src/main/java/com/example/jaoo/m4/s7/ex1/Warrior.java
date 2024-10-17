package com.example.jaoo.m4.s7.ex1;

public class Warrior extends Actor {

	protected Warrior(String name, int forza) {
		super(name, forza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean fight(Actor enemy) {
		// TODO Auto-generated method stub
		if (enemy instanceof Wizard) {
			return false;
		}
		Warrior other = (Warrior) enemy; // downcast
		if (this.forza > other.forza) {
		}
		return false;
	}

	@Override
	public String toString() {
		return "Warrior [name=" + name + ", forza=" + forza + "]";
	}

}
