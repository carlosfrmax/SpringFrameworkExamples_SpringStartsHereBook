package org.example.ch2.defining_beans;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init() {
        this.name = "Rocky";
    }
}
