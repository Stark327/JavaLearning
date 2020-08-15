package com.stark1307.day03xmlinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author stark1307
 */
public class SpringXmlInjection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/stark1307/day03xmlinjection/applicationContext.xml");
        System.out.println(context.getBean("user1"));
        System.out.println(context.getBean("user2"));
    }
}
