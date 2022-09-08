package org.example1.main;
import org.example1.Beans.Animal;
import org.example1.config.config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(config.class);
        var v=context.getBean(Animal.class);
        System.out.println(v);

    }
}