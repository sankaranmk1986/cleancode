package com.cleancode;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void shouldReturnNumberForNumbersNotDivisbleByThreeAndFive() {
		assertThat(FizzBuzz.getAnswerFor(1), is("1"));
		assertThat(FizzBuzz.getAnswerFor(2), is("2"));
	}

	@Test
	public void shouldReturnFizzForNumbersDivisibleByThree() {
		assertThat(FizzBuzz.getAnswerFor(3), is("Fizz"));
		assertThat(FizzBuzz.getAnswerFor(6), is("Fizz"));
	}

	@Test
	public void shouldReturnBizzForNumbersDivisibleByFive() {
		assertThat(FizzBuzz.getAnswerFor(5), is("Buzz"));
		assertThat(FizzBuzz.getAnswerFor(10), is("Buzz"));
	}

	@Test
	public void shouldReturnFizzBizzForNumbersDivisbleByFifteen() {
		assertThat(FizzBuzz.getAnswerFor(15), is("FizzBuzz"));
		assertThat(FizzBuzz.getAnswerFor(30), is("FizzBuzz"));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void shouldThrowErrorForNumbersLessThanOne() {
		FizzBuzz.getAnswerFor(0);
	}

}
