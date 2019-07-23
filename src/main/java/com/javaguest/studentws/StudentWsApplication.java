package com.javaguest.studentws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import com.javaguest.studentws.domain.StudentDO;
import com.javaguest.studentws.service.impl.StudentServiceImpl;

@SpringBootApplication
//@EnableCaching
//public class StudentWsApplication implements CommandLineRunner {
public class StudentWsApplication {

//	@Autowired
//	private StudentService studentService;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentWsApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {		
//		for (int i = 0; i < 500; i++) {
//			studentService.addStudent(new StudentDO("firstName-"+(i+1), "lastName-"+(i+1)));
//		}
//	}

}
