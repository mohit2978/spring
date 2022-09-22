package org.example.Config;
import org.example.Beans.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.Beans")
public class config {
    @Bean
    Vehicle v1(){
        Vehicle v1=new Vehicle("Mercedes");
        return v1;
    }

    @Bean
    Vehicle v2(){
        Vehicle v2=new Vehicle("Audi");
        return v2;
    }

    @Bean
    Vehicle v3(){
        Vehicle v3=new Vehicle("Alto");
        return v3;
    }
}
