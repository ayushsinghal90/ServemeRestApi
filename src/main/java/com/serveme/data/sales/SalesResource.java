package com.serveme.data.sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Arrays;

@RestController
@RequestMapping("/sales")
public class SalesResource {

	@Autowired
	private SalesRepo sr;
	
	@GetMapping("/all")
    public List<Sales> getAll() {
        return sr.findAll();
    }
    @PostMapping("/save")
    public Sales entersug() {
      Integer[] s= {1,22,34,5};
   	  return sr.save(new Sales(1,"Ayush",123,new Date(),(Arrays.asList(s)),140.0));    	 
    }
}
