package com.example.demo.service;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PersonService 
{
	//@Autowired dependency injection either through setters or constructor
	@Autowired
	private PersonRepository repo;
	public void save(Person p)
	{
		repo.save(p);//save method used for both insertion and updation
	}
	public Person getPerson(int pid) 
	{
		return repo.findById(pid).get();
	}
	public List<Person> getAllPersons()
	{
		return repo.findAll();
	}
	public void delete(int pid) 
	{
		repo.deleteById(pid);
	}
	
	
	

}
