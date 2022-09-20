package org.example.main;

import org.example.Beans.Animal;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        //supplier functions defined as lambdas
        var context=new ClassPathXmlApplicationContext("beans.xml");
        Animal a=context.getBean(Animal.class);
        System.out.println(a);

    }
}