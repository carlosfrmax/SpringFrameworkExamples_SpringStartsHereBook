package org.example.ch3.wiring_beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonUsingAutowired {
    private String name = "Ella";
    
    // class field injection
    // Doing the dependency injection through a class field is not recommended
    // because is not possible to make the field final 
    // to avoid someone changing its value after the initialization
//    @Autowired
//    private Parrot parrot;
    
    // constructor injection
    private final Parrot parrot;
    

    public PersonUsingAutowired(Parrot parrot) {
        this.parrot = parrot;
    }
    
    // setter injection
//    private Parrot parrot;
//    @Autowired
//    public void setParrot(Parrot parrot) {
//        this.parrot = parrot;
//    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }
}
