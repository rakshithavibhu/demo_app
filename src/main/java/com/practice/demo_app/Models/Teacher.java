package com.practice.demo_app.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {
    @Id
    private int tid;
    private String name;
    private String subject;

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher() {
    }

    public Teacher(int tid, String name, String subject) {
        this.tid = tid;
        this.name = name;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}

