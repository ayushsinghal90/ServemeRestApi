package com.serveme.data.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Arrays;

@RestController
@RequestMapping("/custom")
public class CustomResource {

	@Autowired
	private CustomRepo cr;
	
	@GetMapping("/all")
    public List<Custom> getAll() {
        return cr.findAll();
    }
    @PostMapping("/save")
    public Custom entersug() {
      Integer[] s= {1,22,34,5};
   	  return cr.save(new Custom(1,"Ayush",(Arrays.asList(s)),1));    	 
    }
}
