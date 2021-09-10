package com.bridgelabz.moodanalyser;

import com.bridgelabz.moodanalyser.MoodAnalyserException.ExceptionType;

public class MoodAnalyser {
	String message;
	public void MoodAnalyzer(String message){
		this.message = message;
	} 
	public String analyzeMood(String message) throws MoodAnalyserException {
		
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
		throw new MoodAnalyserException(ExceptionType.ENTERED_NULL,"ADD A PROPER MESSAGE");
	}
	}
	public  MoodAnalyser() {
		this.message="sad";
	}
}
