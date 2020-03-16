package com.practice.demo_app.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Subject {
    @Id
    private int subjectid;
    private String name;
    @ManyToOne
    @JoinColumn (name = "rollno")
    private Student student;

    public int getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(int subjectid) {
        this.subjectid = subjectid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject(int subjectid, String name, Student student) {
        this.subjectid = subjectid;
        this.name = name;
        this.student = student;
    }

    public Subject() {
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectid=" + subjectid +
                ", name='" + name + '\'' +
                ", student=" + student +
                '}';
    }
}
