package com.stark1307.day03xmlinjection;

import java.util.List;

public class User {
    private String name;
    private String password;
    private List<String> list;

    public User(String name, String password, List<String> list) {
        this.name = name;
        this.password = password;
        this.list = list;
    }
    public User() {
        super();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", list=" + list +
                '}';
    }
}
