package com.example.ch8.spring_boot_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainControllerUsingRequestParams {
    
    @RequestMapping("/home")
    public String home(
            @RequestParam(required = false) String color,
            @RequestParam(required = false) String name,
            Model model) {
        model.addAttribute("username",name);
        model.addAttribute("color",color);
        return "home.html";
    }
    
}
