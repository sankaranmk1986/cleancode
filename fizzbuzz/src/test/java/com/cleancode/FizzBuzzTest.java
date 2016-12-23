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
	public void shouldReturnFizzForThree(){
		assertThat(FizzBuzz.getAnswerFor(3), is("Fizz"));
	}	
	
	@Test
	public void shouldReturnFizzForSix(){
		assertThat(FizzBuzz.getAnswerFor(6), is("Fizz"));
	}
	
	@Test
	public void shouldReturnBizzForFive(){
		assertThat(FizzBuzz.getAnswerFor(5), is("Buzz"));
	}	
}
