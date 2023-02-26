package com.stduentmanagementsystem.studentmanagementsystem;

import com.stduentmanagementsystem.studentmanagementsystem.entity.Student;
import com.stduentmanagementsystem.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository ;
	@Override
	public void run( String ...args )throws Exception{

		// Method to insert data using command line arguments
		//Student student1 = new Student("Tony" , "Stark" , "tony..1@gmail.com" ) ;
		//studentRepository.save( student1 ) ;

	}

}
