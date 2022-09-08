package org.example1.Beans;

public class Animal {
    private String name;
    private int legs;
    public Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", legs=" + legs +
                '}';
    }
}
