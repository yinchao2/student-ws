package com.javaguest.studentws.controllers;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaguest.studentws.domain.StudentDO;
import com.javaguest.studentws.response.StudentResponse;
import com.javaguest.studentws.service.impl.StudentServiceImpl;

/**
 * http://localhost:8084/api/student/list
 * http://localhost:8084/api/student/list?page=1
 * http://localhost:8084/api/student/list?size=40
 * http://localhost:8084/api/student/list?page=3&size=50
 * 
 * @author Yin
 *
 */

@RestController
public class StudentController {

	@Autowired
	private StudentServiceImpl studentService; 
	
	@GetMapping("/api/student/list")
	public ResponseEntity<StudentResponse> retrieveEmployees(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "25") int size) {
		return new ResponseEntity<>(studentService.findByPage(page, size), HttpStatus.ACCEPTED);
	} 
	
	@GetMapping("/api/student/all")
	public ResponseEntity<List<StudentDO>> retrieveAllEmployees(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "25") int size) {
		return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.ACCEPTED);
	} 
}
