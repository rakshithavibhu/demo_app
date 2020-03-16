package com.practice.demo_app.Repository;

import com.practice.demo_app.Models.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface TeacherRepo extends CrudRepository<Teacher, Integer > {

}
