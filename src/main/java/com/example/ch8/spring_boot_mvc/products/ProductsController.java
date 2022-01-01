package com.example.ch8.spring_boot_mvc.products;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductsController {

    private final ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }
    
    @RequestMapping("/products")
    public String viewProducts(Model model) {
        productService.addProduct(new Product());
        var products = productService.findAll();
        model.addAttribute("products", products);
        
        return "products.html";
    }
    
    @RequestMapping(path = "/products",
            method = RequestMethod.POST)
    public String addProduct(
            Product p,
            Model model
            ) {
        productService.addProduct(p);
        var products = productService.findAll();
        model.addAttribute("products",products);
        
        return "products.html";
    }
    
//    @RequestMapping(path = "/products",
//            method = RequestMethod.POST)
//    public String addProduct(
//            Product p,
//            Model model
//            ) {
//        Product p = new Product();
//        p.setName(name);
//        p.setPrice(price);
//        productService.addProduct(p);
//        
//        var products = productService.findAll();
//        model.addAttribute("products",products);
//        
//        return "products.html";
//    }
    
}
