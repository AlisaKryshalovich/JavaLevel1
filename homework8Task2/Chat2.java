package com.dmdev.lesson40homework.homework8Task2;

import java.util.List;

public class Chat2 {

    private String name;
    private List<User> users;

    public Chat2(String name, List<User> userList) {
        this.name = name;
        this.users = userList;
    }

    public String getName() {
        return name;
    }

    public List<User> getUsers() {
        return users;
    }
}
