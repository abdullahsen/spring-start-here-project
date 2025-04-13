package com.sena;

import com.sena.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var parrot = context.getBean(Parrot.class);
        var hello = context.getBean(String.class);
        var age = context.getBean(Integer.class);


        System.out.println(parrot.getName());
        System.out.println(hello);
        System.out.println(age);
    }
}