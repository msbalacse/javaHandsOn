package com.user;

import java.util.UUID;

public class User {
    UUID id;
    String userName;

    public User(String name){
        id = UUID.randomUUID();
        this.userName = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                '}';
    }
}
