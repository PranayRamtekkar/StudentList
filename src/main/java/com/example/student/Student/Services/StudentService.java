package com.example.student.Student.Services;

import com.example.student.Student.Models.StudentModel;
import com.example.student.Student.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<StudentModel> listAll() {
        return studentRepository.findAll();
    }

    public void save(StudentModel student) {
        studentRepository.save(student);
    }

    public StudentModel get(int id) {
        return studentRepository.findById(id).get();
    }

    public void delete(int id) {
        studentRepository.deleteById(id);
    }
}
