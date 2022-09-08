package org.example.config;
import org.example.Beans.Animal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    @Bean(name = "LionObject")
    Animal createAnimal1(){
        var lion=new Animal("Lion",4);
        return lion;
    }
    @Bean(name = "TigerObject")
    Animal createAnimal2(){
        var tiger=new Animal("Tiger",4);
        return tiger;
    }
    @Bean(name = "ZebraObject")
    Animal createAnimal3(){
        var zebra=new Animal("Zebra",4);
        return zebra;
    }

}
