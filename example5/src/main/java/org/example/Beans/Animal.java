package org.example.Beans;

import org.springframework.stereotype.Component;

@Component
public class Animal {
    private String name;
    private int legs;


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", legs=" + legs +
                '}';
    }
}
