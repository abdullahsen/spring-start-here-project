package com.sena.config;

import com.sena.Parrot;
import com.sena.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sena")
public class ProjectConfig {

    /*    Section 2 - Defining context and beans
    @Bean
    public Parrot parrot() {
        var parrot = new Parrot();
        parrot.setName("Sena");
        return parrot;
    }

    @Bean
    public String hello() {
        return "hello";
    }

    @Bean
    public int age() {
        return 33;
    }

    @Bean(value = "abdullah")
    public Parrot newParrot() {
        var parrot = new Parrot();
        parrot.setName("Abdullah");
        return parrot;
    }

    @Bean(name = "ilkay")
    public Parrot coolParrot() {
        var parrot = new Parrot();
        parrot.setName("Ilkay");
        return parrot;
    }*/


    //Section 3 - Spring context - wiring beans

    @Bean
    public Parrot parrot() {
        Parrot parrot = new Parrot();
        parrot.setName("Koko");
        return parrot;
    }

    @Bean
    public Person person() {
        Person person = new Person();
        person.setName("Abdullah");
        person.setParrot(parrot());
        return person;
    }


}
