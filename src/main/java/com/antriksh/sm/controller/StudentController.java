package com.antriksh.sm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.antriksh.sm.DAO.StudentDAO;
import com.antriksh.sm.api.Student;

@Controller
public class StudentController {
	@Autowired
	private StudentDAO repo;
	
	@GetMapping("/showStudent")
	public String showStudentList(Model map) {
		List<Student> loadStudent = repo.loadStudent();
		map.addAttribute("list",loadStudent);
		return "student-list";
	}
}
