package org.example.Beans;

public class Person {
    public Person(){
        System.out.println("person created by spring");
    }
    private String name;
    private Vehicle v;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getV() {
        return v;
    }

    public void setV(Vehicle v) {
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
