package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
	String message;
	public void MoodAnalyzer(String message){
		this.message = message;
	} 
	public String analyzeMood(String message) {
		
	try {
		if(message.contains("happy")) {
			return "MOOD IS HAPPY";
		}
		else {
			return "MOOD IS SAD";
		}
	}
	catch (NullPointerException e)
	
	{
		return "HAPPY";
	}
	}
}
