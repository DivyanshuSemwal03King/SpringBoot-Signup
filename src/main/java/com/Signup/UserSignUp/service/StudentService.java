package com.Signup.UserSignUp.service;

import com.Signup.UserSignUp.controller.Student;
import com.Signup.UserSignUp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student getStudentById(String id){
        Optional<Student> student = studentRepository.findById(id);

        if (student.isPresent()) {
            return student.get();
        } else {

            return new Student("N/A","N/A","N/A","N/A","N/A");
        }
    }

    public Student save(Student student){
        return studentRepository.save(student);
    }


}
