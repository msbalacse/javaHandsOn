package com.msbala.classexercise;

import java.util.Date;
import java.util.Objects;

public class Student {
    private String name;
    private int rollNo;
    private String courseName;
    private Date dataOfBirth;

    public Student(String name, int rollNo, String courseName, Date dataOfBirth) {
        this.name = name;
        this.rollNo = rollNo;
        this.courseName = courseName;
        this.dataOfBirth = dataOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Date getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(Date dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && Objects.equals(name, student.name) && Objects.equals(courseName, student.courseName) && Objects.equals(dataOfBirth, student.dataOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNo, courseName, dataOfBirth);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", courseName='" + courseName + '\'' +
                ", dataOfBirth=" + dataOfBirth +
                '}';
    }
}
