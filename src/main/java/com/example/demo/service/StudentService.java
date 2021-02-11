package com.example.demo.service;


import com.example.demo.dto.StudentDto;
import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class StudentService {

    private static List<Student>  students = new ArrayList<>();

    public List<Student>  getStudents(){
        return students;
    }

    public Student updateStudent(StudentDto studentDto, String studentId){

        Student student = getStudentByStudentId(studentId);
        student.setName(studentDto.getName());
        student.setAge(studentDto.getAge());
        student.setClassName(studentDto.getClassName());
        student.setEmail(studentDto.getEmail());


        return student;

    }
    private Student getStudentByStudentId(String studentId) {
        for (Student sc : students) {
            if (sc.getName().equals(studentId));

        }
        Student sc = new Student();
            return sc;


    }
    public Student createStudent(StudentDto studentDto){

        Student student = new Student();
        student.setName(studentDto.getName());
        student.setAge(studentDto.getAge());
        student.setClassName(studentDto.getClassName());
        student.setEmail(studentDto.getEmail());
        student.setCreateTime(new Date());
        student.setStudentId(getRandomId());

        students.add(student);

        return student;

    }

    private String getRandomId() {
        // create a string of all characters
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // create random string builder
        StringBuilder sb = new StringBuilder();

        // create an object of Random class
        Random random = new Random();

        // specify length of random string
        int length = 7;

        for (int i = 0; i < length; i++) {

            // generate random index number
            int index = random.nextInt(alphabet.length());

            // get character specified by index
            // from the string
            char randomChar = alphabet.charAt(index);

            // append the character to string builder
            sb.append(randomChar);
        }

        String randomString = sb.toString();

        return randomString;
    }
}


