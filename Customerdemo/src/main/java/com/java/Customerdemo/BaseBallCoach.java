package com.java.Customerdemo;

public class BaseBallCoach implements Coach {
	
	
	
	FortuneService fortuneservice = null;
	

	public BaseBallCoach(FortuneService fortuneservice) {
		super();
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getDailyworkout() {
		// TODO Auto-generated method stub
		return "Play basketball";
	}

	@Override
	public String getDailyfortune() {
		
		return fortuneservice.getLuckyFrotune();
	}

	
	
	
	
}
