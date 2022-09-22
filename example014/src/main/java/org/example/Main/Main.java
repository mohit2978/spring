package org.example.Main;

import org.example.Beans.Person;
import org.example.Beans.Vehicle;
import org.example.Config.config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(config.class);
        var p=context.getBean(Person.class);
        var va=context.getBean("v1",Vehicle.class);
        System.out.println(va);
        var vb=context.getBean("v2",Vehicle.class);
        System.out.println(vb);
        var vc=context.getBean("v3",Vehicle.class);
        System.out.println(vc);
        System.out.println(p);

    }
}