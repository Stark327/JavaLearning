package com.stark1307.day03annotationinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author stark1307
 */
@Component(value="user")
public class User {
    @Value("JJLin")
    private String name;
    @Value("12")
    private int age;
    @Autowired
    private Address address;

    public User(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public User() {
        super();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
