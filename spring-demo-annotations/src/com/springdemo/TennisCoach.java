package com.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomService")
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println("Inside default constructor");
	}
	
	//define init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("Inside the doMyStartupStuff");
	}
	
	//define destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("Inside the destroy method");
	}

	/*
	 * define setter method
	 * 
	 * @Autowired public void methodFortuneService(FortuneService fortuneService) {
	 * System.out.println("Inside method"); this.fortuneService = fortuneService; }
	 */

	// define the constructor for dependency injection
	/*
	 * @Autowired public TennisCoach(FortuneService theFortuneService) {
	 * fortuneService = theFortuneService; }
	 */
	@Override
	public String getDailyWorkout() {
		return "Practise Daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
