package org.example.main;
import org.example.Beans.Animal;
import org.example.config.config;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.*;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //supplier functions defined as lambdas
        var context=new AnnotationConfigApplicationContext(config.class);
        Animal lion=new Animal();
        lion.setvalues("Lion",4);
        Supplier<Animal>lionSupplier=()->lion;

        Supplier<Animal>tigerSupplier=()->{
            Animal tiger=new Animal();
            tiger.setvalues("tiger",4);
            return tiger;
        };
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("randomNumber = " + randomNumber);

        if((randomNumber% 2) == 0){
            context.registerBean("LionBean",
                    Animal.class,lionSupplier);
        }else{
            context.registerBean("TigerBean",
                    Animal.class,tigerSupplier);
        }

        Animal lobj=null;
        Animal tobj=null;

        try{
            lobj=context.getBean("LionBean",Animal.class);
        }
        catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println("error creating lion object");
        }
        try{
            tobj=context.getBean("TigerBean",Animal.class);
        }
        catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println("error creating tiger object");
        }
        if(tobj!=null){
            System.out.println(tobj);
        }
        if(lobj!=null){
            System.out.println(lobj);
        }
    }
}