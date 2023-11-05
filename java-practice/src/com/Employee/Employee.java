package com.Employee;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private double salary;

    public Employee(int id,String name,int age,String department,double salary){
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public Employee(String name,int age, String department){
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
