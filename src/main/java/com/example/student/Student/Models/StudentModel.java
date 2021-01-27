package com.example.student.Student.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class StudentModel {

    @Id
    private int id;
    private String name;
    private String course;
    private int fee;

    public StudentModel() {
    }

    public StudentModel(int id, String name, String course, int fee) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.fee = fee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
}
