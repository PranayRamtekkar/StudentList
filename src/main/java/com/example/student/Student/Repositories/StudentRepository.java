package com.example.student.Student.Repositories;

import com.example.student.Student.Models.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentModel,Integer> {
}
