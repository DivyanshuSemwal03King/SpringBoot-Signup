package com.Signup.UserSignUp.controller;

import com.Signup.UserSignUp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/")
    public String home(){
        return "Welcome to Student Hub";
    }

    @RequestMapping(value = "/students")
    public List<Student> getStudents(){ return studentService.getAllStudents();}

    @RequestMapping(value = "/students/{id}")
    public Student getStudent(@PathVariable String id){return studentService.getStudentById(id);}

    @RequestMapping(value = "/students",method = RequestMethod.POST)
    public Student save(@RequestBody Student student){ return studentService.save(student);}




}
