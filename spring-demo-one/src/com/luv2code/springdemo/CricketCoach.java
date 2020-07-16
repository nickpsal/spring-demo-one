package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("Inside the co-arg constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside the setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 min";
	}                             
                 
	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
}
