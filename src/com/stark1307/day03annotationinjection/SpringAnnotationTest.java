package com.stark1307.day03annotationinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/stark1307/day03annotationinjection/applicationContext.xml");
        System.out.println(context.getBean("user"));
        UserController userController = (UserController) context.getBean("userController");
        userController.execute();

    }
}
