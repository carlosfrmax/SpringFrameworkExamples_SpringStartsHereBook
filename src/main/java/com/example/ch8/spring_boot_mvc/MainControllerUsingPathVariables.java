package com.example.ch8.spring_boot_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainControllerUsingPathVariables {
    
    @RequestMapping("/home2/{color}")
    public String home(
            @PathVariable String color,
            Model model) {
        model.addAttribute("username","Katy");
        model.addAttribute("color",color);
        return "home.html";
    }
    
}
