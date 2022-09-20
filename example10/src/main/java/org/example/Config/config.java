package org.example.Config;

import org.example.Beans.Person;
import org.example.Beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {
    @Bean
    public Person pc(Vehicle vc){
        Person p1=new Person();
        p1.setName("Mohit");
        p1.setV(vc);
        return p1;
    }
    @Bean
    public Vehicle vc(){
        Vehicle v1=new Vehicle();
        v1.setName("Audi007");
        return v1;
    }

}
