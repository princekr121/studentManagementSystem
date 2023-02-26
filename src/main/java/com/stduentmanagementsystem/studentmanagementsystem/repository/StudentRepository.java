package com.stduentmanagementsystem.studentmanagementsystem.repository;

import com.stduentmanagementsystem.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long > {
}
