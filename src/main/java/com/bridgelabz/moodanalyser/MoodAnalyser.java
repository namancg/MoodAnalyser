package com.bridgelabz.moodanalyser;

import com.bridgelabz.moodanalyser.MoodAnalyserException.ExceptionType;

public class MoodAnalyser {
	String message;
	public void MoodAnalyzer(String message){
		this.message = message;
	} 
	public  MoodAnalyser() {
		this.message="sad";
	}
	public String analyzeMood(String message)  {
		
	try {
		if(message.length()==0)
	{
		throw new MoodAnalyserException(ExceptionType.ENTERED_EMPTY, "ENTER A MESSAGE");
	}
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
	
}
