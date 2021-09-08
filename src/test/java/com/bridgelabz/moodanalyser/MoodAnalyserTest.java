package com.bridgelabz.moodanalyser;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() throws Exception {
		
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyzer.analyzeMood("This is a sad message");
		Assert.assertThat(mood, CoreMatchers.is("MOOD IS SAD"));
	}
	
	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() throws Exception {
		
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyzer.analyzeMood("This is a happy message");
		Assert.assertThat(mood, CoreMatchers.is("MOOD IS HAPPY"));
	}
}