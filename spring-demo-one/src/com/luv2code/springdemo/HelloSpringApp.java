package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach theCoach2 = context.getBean("myCoach2", Coach.class);
		//call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		//lets call the method for fortune
		System.out.println(theCoach.getDailyFortune());

		//call method on the bean
		System.out.println(theCoach2.getDailyWorkout());
		//lets call the method for fortune
		System.out.println(theCoach2.getDailyFortune());
		//close context
		context.close();
	}
}
