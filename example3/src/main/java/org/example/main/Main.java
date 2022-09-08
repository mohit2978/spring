package org.example.main;
import org.example.Beans.Animal;
import org.example.config.config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(config.class);
        var v1=context.getBean("LionObject",Animal.class);
        System.out.println(v1);
        var v2=context.getBean("TigerObject",Animal.class);
        System.out.println(v2);
        var v3=context.getBean("ZebraObject",Animal.class);
        System.out.println(v3);

    }
}