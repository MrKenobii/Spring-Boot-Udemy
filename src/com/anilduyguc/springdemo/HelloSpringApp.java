package com.anilduyguc.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach trackCoach = context.getBean("trackCoach", Coach.class);
        Coach baseballCoach = context.getBean("baseballCoach", Coach.class);

        System.out.println(trackCoach.getDailyWorkout());
        System.out.println(baseballCoach.getDailyWorkout());

        System.out.println(baseballCoach.getDailyFortune());
        System.out.println(trackCoach.getDailyFortune());
        context.close();

    }
}
