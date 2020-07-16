package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	//private field for the depedency
	private FortuneService fortuneService;
	//constructor for depedency injection
	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 min in batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
}
