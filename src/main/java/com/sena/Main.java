package com.sena;

import com.sena.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        /*
        var parrot = context.getBean(Parrot.class);
        var hello = context.getBean(String.class);
        var age = context.getBean(Integer.class);
        */

        var parrot = context.getBean("parrot", Parrot.class);
        var hello = context.getBean("hello", String.class);
        var age = context.getBean("age",Integer.class);

        var abdullahParrot = context.getBean("abdullah", Parrot.class);
        var ilkayParrot = context.getBean("ilkay", Parrot.class);

        var human = context.getBean(Human.class);

        var manager = new Manager();
        manager.setName("Necati");
        manager.setDepartment("Engineering");

        Supplier<Manager> supplier = () -> manager;

        context.registerBean(
                "manager",
                Manager.class,
                supplier
        );

        var createdManager = context.getBean(Manager.class);

        System.out.println(parrot.getName());
        System.out.println(hello);
        System.out.println(age);
        System.out.println(abdullahParrot.getName());
        System.out.println(ilkayParrot.getName());
        System.out.println(human);
        System.out.println(human.getName());
        System.out.println(manager);
        System.out.println(manager.getName() + " " + manager.getDepartment());
    }
}