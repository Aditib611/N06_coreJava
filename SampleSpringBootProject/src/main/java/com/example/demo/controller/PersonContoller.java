package com.example.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;

@RestController
public class PersonContoller {
	@Autowired
	private PersonService service;
	@GetMapping("/hi")
	public String sayHello() {
		return "hello";
	}
	@GetMapping("/persons")
    public List<Person> getAllPersons()
	{
		return service.getAllPersons();
	
	}
	@GetMapping("/persons/{id}")
	public ResponseEntity<Person> getPerson(@PathVariable Integer id)
	{
		Person p = null;
		try {
			p = service.getPerson(id);
		return new ResponseEntity<Person>(p,HttpStatus.OK);	
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<Person>(p,HttpStatus.NOT_FOUND);	
		}
	}
	// RESTful API method for Create operation
	 @PostMapping("/persons")
	 public void add(@RequestBody Person p) 
	 {
	 service.save(p);
	 }
	 
	 // RESTful API method for Update operation
	 @PutMapping("/persons/{id}")
	 public ResponseEntity<?> update(@RequestBody Person p, @PathVariable Integer id) 
	 {
	 try {
		 Person existProduct = service.getPerson(id);
		 service.save(p);
		 return new ResponseEntity<>(HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) {
		 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 } 
	 }
	 // RESTful API method for Delete operation
	 @DeleteMapping("/persons/{id}")
	 public void delete(@PathVariable Integer id) 
	 {
	 service.delete(id);
	 }
}
