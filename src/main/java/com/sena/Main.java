package com.sena;

import com.sena.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var parrot = context.getBean(Parrot.class);

        System.out.println(parrot.getName());
    }
}