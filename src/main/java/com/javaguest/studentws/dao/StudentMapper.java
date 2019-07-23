package com.javaguest.studentws.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.github.pagehelper.Page;
import com.javaguest.studentws.domain.StudentDO;

@Mapper
public interface StudentMapper {

	Page<StudentDO> findByPage();
	
	void saveStudent(StudentDO student);
	
	List<StudentDO> findAllStudents();
}
