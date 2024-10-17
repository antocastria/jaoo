/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s8.exercise;

/**
 * Exercise
 */
public class Main {
    /**
     * TODO: let this code work correctly
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Square square = new Square(3.0);

        System.out.println("Area is: " + square.area());
        System.out.println("Perimeter is: " + square.perimeter());

        Circle circle = new Circle(4.0);
        System.out.println("Area is: " + circle.area());
        System.out.println("Perimeter is: " + circle.perimeter());
        
        Triangle triangolo = new Triangle(3, 4, 5.5);
        System.out.println(triangolo.getArea());
        System.out.println(triangolo.getPerimetro());
        
        String s = "10000";  //da stringa a intero
        int x;
        x = Integer.parseInt(s + "23");
        System.out.println(x + s);
        
        String t= triangolo.toString();
        System.out.println(t);
        
       
    }
}
