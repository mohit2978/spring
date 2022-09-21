package org.example.Beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Vehicle {

    public Vehicle(){
        System.out.println("Vehicle created by spring");
    }
    private String name;

    @PostConstruct
    public void setName() {
        this.name = "Mercedes007";
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
