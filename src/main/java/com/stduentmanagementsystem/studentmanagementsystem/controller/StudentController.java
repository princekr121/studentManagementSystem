package com.stduentmanagementsystem.studentmanagementsystem.controller;

import com.stduentmanagementsystem.studentmanagementsystem.entity.Student;
import com.stduentmanagementsystem.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
public class StudentController {
    private StudentService studentService ;

    public StudentController( StudentService studentService ){
        super();
        this.studentService = studentService ;
    }
    @GetMapping("/students")
    public String listStudent( Model model ){
        model.addAttribute("students" , studentService.getAllStudents() ) ;
        return "students" ;

    }
    @GetMapping("/students/new")
    public String createStudentForm(Model model ){
        Student student  = new Student() ;
        model.addAttribute("student" , student ) ;
        return "create_student" ;

    }
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student ){
        studentService.saveStudent( student ) ;
        //this redirect method calls with get request
        return "redirect:/students" ;
    }

    @GetMapping("/students/edit/{id}")
    public String editStudentForm( @PathVariable("id")  Long id , Model model  ){
        model.addAttribute("student" , studentService.getStudentById( id ) ) ;
        return "edit_student" ;
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable("id") Long id , @ModelAttribute("student") Student student , Model model ){
        // first get student from id
        Student existingStudent = studentService.getStudentById( id) ;
        existingStudent.setId( id );
        existingStudent.setFirstName( student.getFirstName() );
        existingStudent.setLastName( student.getLastName());
        existingStudent.setEmail( student.getEmail());

        studentService.updateStudent( existingStudent ) ;

        return "redirect:/students" ;

    }


}
