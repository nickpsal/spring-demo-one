package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	//private field for the depedency
	private FortuneService fortuneService;
	
	//constructor for depedency injection
	public TrackCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService; 
	}
	
	@Override
	public String getDailyWorkout() {
		return "Rum 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it " + fortuneService.getDailyFortune();
	}
}
