package com.Employee;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeImplementation implements IEmployee{
    HashSet<Employee> setEmployees = new HashSet<>();

    Employee emp1 = new Employee(101,"Marin",24,"Developer",34223);
    Employee emp2 = new Employee(102,"Joshua",21,"Tester",12439);
    Employee emp3 = new Employee(103,"Angle",33,"DevOps Eng",23432);
    Employee emp4 = new Employee(104,"John",34,"System Eng",92342);


    Scanner in = new Scanner(System.in);
    boolean found = false;
    int id;
    String name;
    int age;
    String department;
    double salary;




    public EmployeeImplementation(){
        setEmployees.add(emp1);
        setEmployees.add(emp2);
        setEmployees.add(emp3);
        setEmployees.add(emp4);
    }

    @Override
    public void viewAllEmployees() {
        for(Employee emp:setEmployees){
            System.out.println(emp);
        }
    }

    @Override
    public void viewEmp() {
        System.out.println("Enter id: ");
        id= in.nextInt();
        for(Employee emp:setEmployees){
            if(emp.getId() == id){
                System.out.println(emp);
                found = true;
            }
        }
        if(!found){
            System.out.println("Employee with this id is not present");
        }
    }

    @Override
    public void deleteEmployee() {
        System.out.println("Enter id: ");
        id = in.nextInt();
        boolean found = false;
        Employee empDelete = null;
        for(Employee emp: setEmployees){
            if(emp.getId() == id){
                empDelete = emp;
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee is not present");
        } else {
            setEmployees.remove(empDelete);
            System.out.println("Employee deleted successfully!!");
        }
    }

    @Override
    public void addEmployee() {
        System.out.println("Enter id:");
        id = in.nextInt();
        System.out.println("Enter name");
        name = in.next();
        System.out.println("Enter age");
        age = in.nextInt();
        System.out.println("Enter Department");
        department = in.next();
        System.out.println("Enter salary");
        salary = in.nextDouble();

        Employee emp = new Employee(id, name, age, department, salary);
        setEmployees.add(emp);
        System.out.println("Employee added successfully");
    }
}
