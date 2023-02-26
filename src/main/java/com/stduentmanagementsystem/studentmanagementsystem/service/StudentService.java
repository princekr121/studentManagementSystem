package com.stduentmanagementsystem.studentmanagementsystem.service;

import com.stduentmanagementsystem.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student ) ;
    public Student updateStudent( Student student , Long id ) ;
    public void deleteStudent( Long id ) ;

    public List<Student> getAllStudents() ;

    public Student getStudentById(Long id) ;


}
