package org.example.ch2.defining_beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.example.ch2.defining_beans")
public class ProjectConfig {
	
	@Bean
	Horse horse() {
		var h = new Horse();
		h.setName("Sugar");
		return h;
	}
	
	@Bean
	String hello() {
		return "Hello";
	}
	
	@Bean
	Integer ten() {
		return 10;
	}
	
	@Bean
	Cat cat1() {
		var c = new Cat();
		c.setName("Tom");
		return c;
	}
	
	@Bean
	Cat cat2() {
		var c = new Cat();
		c.setName("Max");
		return c;
	}
	
	@Bean	
	Parrot parrot1() {
		var p = new Parrot();
		p.setName("Koko");
		return p;
	}
	
	@Bean
	@Primary
	Parrot parrot2() {
		var p = new Parrot();
		p.setName("Miki");
		return p;
	}
	
	@Bean	
	Parrot parrot3() {
		var p = new Parrot();
		p.setName("Riki");
		return p;
	}
}
