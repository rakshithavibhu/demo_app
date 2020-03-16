package com.practice.demo_app.Controllers;

//import org.springframework.stereotype.Controller;
import com.practice.demo_app.Models.Student;
import com.practice.demo_app.Repository.MyRepo;
import com.practice.demo_app.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/welcomepage")
    public String helloWorld(){
        return "Hello World";
    }

    @PostMapping("/welcomepage/edit/student")
    public Student editStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @PostMapping("/welcomepage/student")
    public Student saveStudent(@RequestBody Student student){
      return studentService.saveStudent(student);
    }

    @GetMapping("/welcomepage/student/{id}")
    public Optional<Student> getById(@PathVariable int id){
        return studentService.getStudentById(id);
    }

    @GetMapping("/welcomepage/students")
    public Iterable<Student> getAllsutdents(){
        return studentService.getAllStudent();
    }


    @DeleteMapping("/welcomepage/delete/{id}")
        public void myDelete(@PathVariable int id){
        studentService.deleteStudent(id);
        }



}
