package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.entity;
import com.example.demo.service.service;

@RestController
@CrossOrigin
public class controller {
	
	@Autowired
	service s;
	
	@PostMapping("/post")
	public boolean addEmployee(@RequestBody entity employee)
	{
	return s.addEmployee(employee);
	}
	
	@GetMapping("/get")
	public List <entity> getAllEmployees()
	{
	return s.getAllEmployees();
	}
	
	@GetMapping("/{id}")
	public entity getEmployeeById(@PathVariable int id)
	{
	return s.getEmployeeById(id);
	}
	
	@PutMapping("/update")
	public entity updateInfo(@RequestBody entity st) {
		return s.updateDetails(st);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteInfo(@PathVariable int id) {
		s.deleteDetails(id);
		return "Deleted Details";
	}

}
