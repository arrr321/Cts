package com.java.Springdemo;

public class TennisCoach implements Coach{
	
	private String email;
	private int age;
	
	
	private FortuneService fortuneservice;
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
		
	}
	

	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside setFortuneService() method");
		this.fortuneservice = theFortuneService;
	}

	
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneservice.getFortune();
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

}

	


