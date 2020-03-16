package com.practice.demo_app.Repository;

import com.practice.demo_app.Models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepo extends CrudRepository<Student,Integer> {
}
