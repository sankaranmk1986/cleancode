package com.cleancode;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FizzBuzzTest {
	
	@Test
	public void shouldReturnNumberForOne(){
		assertThat(FizzBuzz.getAnswerFor(1), is("1"));
	}	
	
	@Test
	public void shouldReturnNumberForTwo(){
		assertThat(FizzBuzz.getAnswerFor(2), is("2"));
	}	
	
	@Test
	public void shouldReturnNumberForThree(){
		assertThat(FizzBuzz.getAnswerFor(3), is("Fizz"));
	}	
}
