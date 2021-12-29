package org.example.ch2.defining_beans;

import java.util.function.Supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Use of @Bean annotation
        Horse h = context.getBean(Horse.class);
        System.out.println(h.getName());

        // Beans of type Integer and String
        String s = context.getBean(String.class);
        System.out.println(s);

        Integer i = context.getBean(Integer.class);
        System.out.println(i);

        // Multiple beans of the same type
        Cat c1 = context.getBean("cat1", Cat.class);
        System.out.println(c1.getName());
        Cat c2 = context.getBean("cat2", Cat.class);
        System.out.println(c2.getName());

        // Use of @Primary
        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());

        // Using stereotype: @Component
        Dog d = context.getBean(Dog.class);
        System.out.println(d.getName());

        // Adding bean programmatically: registerBean()
        Rabbit r = new Rabbit();
        r.setName("Bugs");
        Supplier<Rabbit> parrotSupplier = () -> r;
        context.registerBean("dog2", Rabbit.class, parrotSupplier);
        // context.registerBean("dog2", Rabbit.class, () -> r, bc ->
        // bc.setPrimary(true));
        Rabbit r2 = context.getBean(Rabbit.class);
        System.out.println(r2.getName());

        context.close();
    }
}
