/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m2.s4;

/**
 * Data member access modifier - a sample class
 */
public class Pet {
    /** prefer private data member */
    private String name;
    protected double weight;
    static int count;
    // usually public field should be avoided
    // public long doNotDoThis;

    // a static initializer (not very common)
    static {
        System.out.println("First time class Pet is seen by the JVM");
        count = 12;
    }

    // an instance initializer (rarely used)
    {
        System.out.println("First block of statements called on this pet");
    }

    /**
     * Canonical constructor
     */
    public Pet(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    private void increaseWeight() {
        weight += weight / 50;
    }

    void eat() {
        increaseWeight();
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
