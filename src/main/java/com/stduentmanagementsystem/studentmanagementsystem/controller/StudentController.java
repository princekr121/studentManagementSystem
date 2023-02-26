package com.stduentmanagementsystem.studentmanagementsystem.controller;

import com.stduentmanagementsystem.studentmanagementsystem.entity.Student;
import com.stduentmanagementsystem.studentmanagementsystem.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.model.IStandaloneElementTag;

import java.util.List;

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




}
