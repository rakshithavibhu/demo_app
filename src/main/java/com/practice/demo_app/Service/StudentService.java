package com.practice.demo_app.Service;

import com.practice.demo_app.Models.Student;
import com.practice.demo_app.Repository.MyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    MyRepo myRepo;

    public Student saveStudent(Student student){
        return myRepo.save(student);
    }

    public Optional<Student> getStudentById(int id){
        return myRepo.findById(id);
    }

    public List<Student> getAllStudent(){
        return (List<Student>)myRepo.findAll();
    }

    public void deleteStudent(int id){
        myRepo.deleteById(id);
    }

    public Student updateStudent(Student student){
        int i=student.getRollno();
        Student temp=myRepo.findById(i).get();
        temp.setExam(student.getExam());
        temp.setName(student.getName());

        return myRepo.save(temp);
    }
}
