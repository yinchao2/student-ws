package com.javaguest.studentws.service;

import java.util.List;

import com.javaguest.studentws.domain.StudentDO;
import com.javaguest.studentws.response.StudentResponse;

public interface StudentService {
	
	public StudentResponse findByPage(int page, int size);

	public void addStudent(StudentDO student);
	
	public List<StudentDO> getAllStudents();
}
