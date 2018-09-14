package com.serveme.data.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductResource {

	@Autowired
	private ProductRepo pr;
	
	@GetMapping("/all")
    public List<Product> getAll() {
        return pr.findAll();
    }
    @PostMapping("/save")
    public Product entersug() {
   	 return pr.save(new Product(1,"Chococ","snaks",30,50,40.05,5.5,new Date()));    	 
    }
}
