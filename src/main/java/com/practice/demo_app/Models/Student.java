package com.practice.demo_app.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Student {
    @Id
    private int rollno;
    private String name;
    private String exam;

    @OneToMany(mappedBy = "student")
    private Set<Subject> subjectSet;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    public Student(int rollno) {
        this.rollno = rollno;
    }

    public Student(int rollno, String name, String exam, Set<Subject> subjectSet) {
        this.rollno = rollno;
        this.name = name;
        this.exam = exam;
        this.subjectSet = subjectSet;
    }

    public Student(int rollno, String name, String exam) {
        this.rollno = rollno;
        this.name = name;
        this.exam = exam;
    }

    public Student() {
    }

    public Set<Subject> getSubjectSet() {
        return subjectSet;
    }

    public void setSubjectSet(Set<Subject> subjectSet) {
        this.subjectSet = subjectSet;
    }
}
