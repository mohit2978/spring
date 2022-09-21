package org.example.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class Person {
    public Person(){
        System.out.println("person created by spring");
    }
    private String name;
    private Vehicle v;
    @Autowired
    public Person( Vehicle v) {
        System.out.println("in person constructor");
        this.name = "Shyam";
        this.v = v;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", v=" + v +
                '}';
    }
}
