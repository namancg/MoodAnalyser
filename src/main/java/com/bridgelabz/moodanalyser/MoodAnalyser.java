package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
	public String analyzeMood(String message) {
		
		if(message.contains("happy")) {
			return "MOOD IS HAPPY";
		}
		else {
			return "MOOD IS SAD";
		}
	}
}
