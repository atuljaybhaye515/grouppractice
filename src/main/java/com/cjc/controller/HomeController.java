package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Student;
import com.cjc.service.Service;

@RestController
@RequestMapping("/student")
@CrossOrigin("*")
public class HomeController {
	@Autowired
	private Service service;
	
	
	Service s;
	@PostMapping("/add")
	public int register(@RequestBody Student student) {
		service.register(student);
		return 0;
	}

	@GetMapping("/display")
	public List<Student> display() {
		List<Student> list=service.display();
		return list;
	}

	@PostMapping("/update")
	public int update(@RequestBody Student student) {
		service.update(student);
		return 0;
	}

	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		service.delete(id);
		return 0;
	}
	
	

}
