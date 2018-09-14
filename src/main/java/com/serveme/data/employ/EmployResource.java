package com.serveme.data.employ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/employ")
public class EmployResource {

	@Autowired
	private EmployRepo er;
	
	@GetMapping("/all")
    public List<Employ> getAll() {
        return er.findAll();
    }
    @PostMapping("/save")
    public Employ entersug() {
   	 return er.save(new Employ(1,"Ayush",'M',new Date(),new Date(),"hi my name is ayush",3.4));    	 
    }
}
