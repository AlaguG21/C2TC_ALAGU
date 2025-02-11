package com.PlacementManagementSystem.Student;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentService
{
	@Autowired
	private StudentRepository repo;

	//Get all the records from the table
	public List<Student> listAll()
	{
		return repo.findAll();
	}
}