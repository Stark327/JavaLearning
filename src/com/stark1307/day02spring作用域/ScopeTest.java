package com.stark1307.day02spring作用域;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/stark1307/day02spring作用域/applicationContext.xml");
        System.out.println(context.getBean("User"));
        System.out.println(context.getBean("User"));
        System.out.println(context.getBean("UserProto"));
        System.out.println(context.getBean("UserProto"));
    }
}
