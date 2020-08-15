package com.stark1307.day01hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * SpringIoC
 *
 * @author stark1307
 * @data 20/8/11
 */

public class SpringIoC {
    public static void main(String[] args) {
        ApplicationContext a = new ClassPathXmlApplicationContext("com/stark1307/day01hellospring/config.xml");
        UserDao userDao = (UserDao)a.getBean("UserDao");
        userDao.login();

        System.out.println("------------------");
        UserService userService = (UserService)a.getBean("UserService");
        userService.service();
    }
}
