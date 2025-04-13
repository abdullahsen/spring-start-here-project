package com.sena;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Human {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    private void init() {
        this.name = "human being";
    }


}
