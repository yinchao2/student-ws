package com.javaguest.studentws.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.javaguest.studentws.dao.StudentMapper;
import com.javaguest.studentws.domain.StudentDO;
import com.javaguest.studentws.response.StudentResponse;
import com.javaguest.studentws.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private final static Logger log = LoggerFactory.getLogger(StudentServiceImpl.class);
	
	@Autowired
	private StudentMapper studentMapper;
	
	@Transactional(readOnly = true)
	public StudentResponse findByPage(int page, int size) {
		
		PageHelper.startPage(page, size);
		
		Page<StudentDO> studentPage = studentMapper.findByPage();
		
		int pageNum = studentPage.getPageNum();
		int pageSize = studentPage.getPageSize();
		int pages = studentPage.getPages();
		int startRow = studentPage.getStartRow();
		int endRow = studentPage.getEndRow();
		
		List<StudentDO> students = studentPage.getResult();
		
		StudentResponse response = new StudentResponse();	
		response.setEndRow(endRow);
		response.setStartRow(startRow);
		response.setPageNum(pageNum);
		response.setPageSize(pageSize);
		response.setPages(pages);		
		response.setStudents(students);
		
		return response;
	}
	
	public void addStudent(StudentDO student) {
		studentMapper.saveStudent(student);
	}

	@Override
	@Cacheable("allStudents")
	public List<StudentDO> getAllStudents() {
		
		long startTime = System.nanoTime();
		
		List<StudentDO> students = studentMapper.findAllStudents();
		
		long endTime   = System.nanoTime();
		
		log.debug("The number of student is {}" + students.size());
		log.debug("executed time is {}" + (endTime - startTime)); 
		
		return students;
	}
	
}
