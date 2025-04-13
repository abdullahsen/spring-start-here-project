package com.sena;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.ObjectInputFilter;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext();
        Parrot parrot = new Parrot();

    }
}