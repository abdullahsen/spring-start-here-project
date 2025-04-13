package com.sena.config;

import com.sena.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

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
}
