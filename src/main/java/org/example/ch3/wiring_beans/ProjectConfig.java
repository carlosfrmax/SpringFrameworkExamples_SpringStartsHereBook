package org.example.ch3.wiring_beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.ch3.wiring_beans")
public class ProjectConfig {

    @Bean
    Parrot parrot() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }

    // Wiring the beans using a direct method call between the @Bean methods
    @Bean
    Person person() {
        var p = new Person();
        p.setName("Ella");
        p.setParrot(parrot());
        return p;
    }
    
    // Wiring the beans using the @Bean annotated method’s parameters
    @Bean
    Person person2(Parrot parrot) {
        var p = new Person();
        p.setName("Ella");
        p.setParrot(parrot);
        return p;
    }
}
