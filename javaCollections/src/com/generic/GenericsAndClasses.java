package com.generic;

import java.util.Date;

public class GenericsAndClasses {
    public static void main(String[] args) {
        Box<Phone> box = new Box<>();
        box.setT(new Phone("samsung"));
        System.out.println(box.getT());

        Box<Letter> box2 = new Box<>();
        box2.setT(new Letter("msbala"));
        System.out.println(box2.getT());

    }
}
