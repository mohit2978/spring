package org.example.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Person {
    public Person(){
        System.out.println("person created by spring");
    }
    private String name;
    @Autowired
    private Vehicle v;

    @PostConstruct
    public void setValues() {
        this.name = "Mohit";
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", v=" + v +
                '}';
    }
}
