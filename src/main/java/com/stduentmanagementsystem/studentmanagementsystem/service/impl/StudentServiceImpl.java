package com.stduentmanagementsystem.studentmanagementsystem.service.impl;

import com.stduentmanagementsystem.studentmanagementsystem.entity.Student;
import com.stduentmanagementsystem.studentmanagementsystem.exception.ResourceNotFoundException;
import com.stduentmanagementsystem.studentmanagementsystem.repository.StudentRepository;
import com.stduentmanagementsystem.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository ;

    public StudentServiceImpl( StudentRepository studentRepository ){
        super();
        this.studentRepository = studentRepository ;
    }
    @Override
    public Student saveStudent(Student student) {

        return studentRepository.save( student ) ;

    }

    @Override
    public Student updateStudent(Student student ) {
        /*Student existingStudent = studentRepository.findById( id ).orElseThrow( () -> new ResourceNotFoundException("Student" , "Id" , id ) ) ;
        existingStudent.setFirstName( student.getFirstName() );
        existingStudent.setLastName( student.getLastName() );
        existingStudent.setEmail( student.getEmail() );

         */


        return studentRepository.save( student ) ;
    }



    @Override
    public void deleteStudent(Long id ) {

        studentRepository.deleteById( id ) ;

    }

    @Override
    public List<Student> getAllStudents() {

        return  studentRepository.findAll()  ;

    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById( id ).get() ;
    }
}
