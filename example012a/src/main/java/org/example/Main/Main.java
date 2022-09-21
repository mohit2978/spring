package org.example.Main;

import org.example.Beans.Person;
import org.example.Config.config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(config.class);
        var p=context.getBean(Person.class);
        System.out.println(p);
    }
}