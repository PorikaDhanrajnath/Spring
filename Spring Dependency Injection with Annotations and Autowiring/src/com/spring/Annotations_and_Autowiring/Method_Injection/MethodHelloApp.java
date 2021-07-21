package com.spring.Annotations_and_Autowiring.Method_Injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MethodHelloApp {

    public static void main(String[] args){

        //load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com/spring/Annotations_and_Autowiring/Method_Injection/applicationContextMethod.xml");

        // retrieve from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        //let's call out method for fortunes
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
