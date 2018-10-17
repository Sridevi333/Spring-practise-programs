package com.springdemo;

public class BaseballCoach implements Coach {
	
	//define the private field for dependency
	
	private FortuneService fortuneService;
	
	//define the constructor for dependency injection
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 min on practising";
	}

	@Override
	public String getDailyFortune() {
		
		// using the dependency service
		
		return fortuneService.getFortune();
	}
}
