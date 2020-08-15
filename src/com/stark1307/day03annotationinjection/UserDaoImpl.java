package com.stark1307.day03annotationinjection;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println(new User("张三", 12));
    }
}
