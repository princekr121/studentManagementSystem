package com.stduentmanagementsystem.studentmanagementsystem.service;

import com.stduentmanagementsystem.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {

    Student saveStudent(Student student ) ;
    Student updateStudent( Student student ) ;
    void deleteStudent( Long id ) ;

    List<Student> getAllStudents() ;

    Student getStudentById(Long id) ;


}
