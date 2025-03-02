package com.dmdev.lesson40homework.homework8Task1;

public class Chat {

    private String name;
    private int users;

    public Chat(String name, int users) {
        this.name = name;
        this.users = users;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "name='" + name + '\'' +
                ", users=" + users +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getUsers() {
        return users;
    }
}
