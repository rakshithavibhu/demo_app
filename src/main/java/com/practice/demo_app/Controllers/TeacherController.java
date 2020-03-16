package com.practice.demo_app.Controllers;

import com.practice.demo_app.Models.Student;
import com.practice.demo_app.Models.Teacher;
import com.practice.demo_app.Repository.MyRepo;
import com.practice.demo_app.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @PostMapping("/welcomepage/edit/teacher")
    public Teacher editTeacher(@RequestBody Teacher teacher){
        return teacherService.updateTeacher(teacher);
    }

    @PostMapping("/welcomepage/teacher")
    public Teacher saveTeacher(@RequestBody Teacher teacher){
        System.out.println("Request Data"+teacher);
        return teacherService.saveTeacher(teacher);
    }

    @GetMapping("/welcomepage/teacher/{id}")
    public Optional<Teacher> getTeacherById(@PathVariable int id){
        return teacherService.getTeacherById(id);
    }

    @GetMapping("/welcomepage/teachers")
    public Iterable<Teacher> getAllTeachers(){
        return teacherService.getAllTeacher();
    }


    @DeleteMapping("/welcomepage/deleteteacher/{id}")
    public void myDelete(@PathVariable int id){
        teacherService.deleteTeacher(id);
    }


}
