/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s3.ex;

import java.util.Arrays;

/**
 * Exercise: create a few cats and let them meow accordingly to requests
 */
public class Main {
	/**
	 * Follow the instructions in the "to do" comments.
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		String[] names = { "Tom", "Bob", "Kit", "Zip", "Kit" };
		String[] colors = { "blue", "green", "yellow", "black", "blue" };

		System.out.println("I gatti si chiamano: " + Arrays.toString(names));
		System.out.println("S: " + Arrays.toString(colors));

		// TODO 1: create an array of cats, same size of the arrays above
		Cat[] cats = new Cat[names.length];
		System.out.println("La lunghezza dell'array cats è " + cats.length);

		// TODO 2: initialize the cats array
		// each cat should have name and color from the arrays above
//		cats[0] = new Cat("Tom", "blue");
//		cats[1] = new Cat("Bob", "green");
//		cats[2] = new Cat("Kit", "yellow");
//		cats[3] = new Cat("Zip", "black");
//		cats[4] = new Cat("Kit", "blue");
		for (int i = 0; i < cats.length; i++) {
			cats[i] = new Cat(names[i], colors[i]);
		}
		// TODO 3: each cat should meow
		for (Cat cat : cats) {
			cat.meow();
		}

		// TODO 4: each cat named Kit should meow
		System.out.println("   ");
		System.out.println("Miagolano solo i gatti di nome Kit: ");
		for (int j = 0; j < names.length; j++) {
			if (names[j] == "Kit") {
				cats[j].meow();
			}
		}
//		for (Cat kit : cats) {
//			if (kit.name.equals("Kit")) {
//				kit.meow();
//			}
//		}
//		for (Cat kit : cats) {
//			if (kit.getName().equals("Kit")) {
//				kit.meow();
//			}
//		}
		// TODO 5: only the first cat named Kit should meow
		System.out.println("   ");
		System.out.println("Miagola solo il primo gatto di nome Kit: ");
		for (int j = 0; j < cats.length; j++) {
			if (names[j] == "Kit") {
				cats[j].meow();
				break;
			}
		}
		// TODO 6: only the cats in even position should meow
		System.out.println("   ");
		System.out.println("Miagolano solo i gatti in posizione pari: ");
		for (int i = 1; i < cats.length; i += 2) {
			cats[i].meow();
		}

	}
}
