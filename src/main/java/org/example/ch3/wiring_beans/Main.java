package org.example.ch3.wiring_beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class Main {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		// Wiring the beans using a direct method call between the @Bean methods
		Person person = context.getBean("person", Person.class);
		System.out.println(person.getName());
	    Parrot parrot = context.getBean(Parrot.class);
	    System.out.println(parrot.getName());
	    System.out.println(person.getParrot());
	    
	    // Wiring the beans using the @Bean annotated method’s parameters
	    Person person2 = context.getBean("person2", Person.class);
        System.out.println(person2.getName());
        System.out.println(person2.getParrot());
        
        // Using the @Autowired annotation to inject beans
        PersonUsingAutowired personUsingAutowired = context.getBean(PersonUsingAutowired.class);
        System.out.println(personUsingAutowired.getName());
        System.out.println(personUsingAutowired.getParrot());
        
        
		context.close();
	}
}
