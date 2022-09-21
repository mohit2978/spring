package org.example.Beans;

public class Vehicle {

    public Vehicle(){
        System.out.println("Vehicle created by spring");
    }
    private String name;


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
