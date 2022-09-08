package org.example1.config;
import org.example1.Beans.Animal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    @Bean
    Animal createAnimal(){
        var lion=new Animal("Lion",4);
        return lion;
    }

}
