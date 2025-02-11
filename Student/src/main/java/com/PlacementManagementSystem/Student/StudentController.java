package com.PlacementManagementSystem.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	private Student stud;
	@GetMapping("/Student")
	public List<Student> list()
	{
		return stud.listAll();
	}
}
