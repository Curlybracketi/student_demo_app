package com.example.demo.controller;

import com.example.demo.dto.StudentDto;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.xpath.XPathVariableResolver;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping("/student")
    public Student createStudent(@RequestBody StudentDto studentDto) {
        return studentService.createStudent(studentDto);

    }

    @PostMapping("/student/{studentId}")
    public Student updateStudent(@RequestBody StudentDto studentDto, @PathVariable String studentId) {
        return studentService.updateStudent(studentDto, studentId);
    }
}