package com.msbala;

import java.util.Arrays;
import java.util.Objects;

public class Person {
    private String name;

    private Gender gender;
    private int age;

    private Cat[] cats;

    public Person(String name, Gender gender, int age, Cat[] cats) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.cats = cats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat[] getCats() {
        return cats;
    }

    public void setCats(Cat[] cats) {
        this.cats = cats;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", cats=" + Arrays.toString(cats) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && gender == person.gender && Arrays.equals(cats, person.cats);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, gender, age);
        result = 31 * result + Arrays.hashCode(cats);
        return result;
    }
}
