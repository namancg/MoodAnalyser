package com.bridgelabz.moodanalyser;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.bridgelabz.moodanalyser.MoodAnalyserException.ExceptionType;

public class MoodAnalyserTest {
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() throws Exception {
		
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyzeMood("This is a sad message");
		Assert.assertThat(mood, CoreMatchers.is("MOOD IS SAD"));
	}
	
	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() throws Exception {
		
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyzeMood("This is a happy message");
		Assert.assertThat(mood, CoreMatchers.is("MOOD IS HAPPY"));
	}
	@Test
	public void givenMessage_WhenNull_ShouldReturnHappy() throws MoodAnalyserException {
		
		MoodAnalyser moodAnalyzer = new MoodAnalyser();
		String mood = moodAnalyzer.analyzeMood("");
		Assert.assertEquals("HAPPY",mood);

		
	}
	@Test
	public void givenMessage_NoMessage_shouldThrowException() throws MoodAnalyserException {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		try {
			String mood = moodAnalyser.analyzeMood("");
			Assert.assertThat(mood, CoreMatchers.is("MOOD IS SAD"));
		} catch (MoodAnalyserException e) {
			Assert.assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void givenmessage_NullMood_shouldReturnHappy() throws Exception {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		try {
			String mood = moodAnalyser.analyzeMood(null);
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodAnalyserException.class);
			Assert.assertThat(mood, CoreMatchers.is("MOOD IS HAPPY"));
		} catch (MoodAnalyserException e) {
			Assert.assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}

	}
	
}
