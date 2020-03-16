package com.practice.demo_app.Service;

import com.practice.demo_app.Models.Teacher;
import com.practice.demo_app.Repository.MyRepo;
import com.practice.demo_app.Repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TeacherService {

        @Autowired
        TeacherRepo myRep;

        public Teacher saveTeacher(Teacher teacher){
            return myRep.save(teacher);
        }

        public Optional<Teacher> getTeacherById(int id){
            return myRep.findById(id);
        }

        public List<Teacher> getAllTeacher(){
            return (List<Teacher>)myRep.findAll();
        }

        public void deleteTeacher(int id){
            myRep.deleteById(id);
        }

        public Teacher updateTeacher(Teacher teacher){
            int i=teacher.getTid();
            Optional<Teacher> st=myRep.findById(i);
            Teacher temp=st.get();
            temp.setSubject(teacher.getSubject());
            temp.setName(teacher.getName());
            return myRep.save(temp);
        }
}
