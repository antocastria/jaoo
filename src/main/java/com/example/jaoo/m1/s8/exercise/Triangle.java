package com.example.jaoo.m1.s8.exercise;

public class Triangle {
	private double altezza;
	private double base;
	private double lato;

	public Triangle(double altezza, double base, double lato) {
		this.altezza = altezza;
		this.base = base;
		this.lato = lato;
	}

	@Override
	public String toString() {
		return "Triangle [altezza=" + altezza + ", base=" + base + ", lato=" + lato + "]";
	}

	public double getPerimetro() {
		return lato * 3;
		
	}

	public double getArea() {
		return altezza * base / 2;
	}

}