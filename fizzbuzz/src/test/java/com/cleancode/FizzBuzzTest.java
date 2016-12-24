package com.cleancode;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	
	private FizzBuzz fizzBuzz;
	
	@Before
	public void init(){
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void shouldReturnNumberForNumbersNotDivisbleByThreeAndFive() {
		assertThat(fizzBuzz.getAnswerFor(1), is("1"));
		assertThat(fizzBuzz.getAnswerFor(2), is("2"));
		assertThat(fizzBuzz.getAnswerFor(4), is("4"));
		assertThat(fizzBuzz.getAnswerFor(7), is("7"));
	}

	@Test
	public void shouldReturnFizzForNumbersDivisibleByThree() {
		assertThat(fizzBuzz.getAnswerFor(3), is("Fizz"));
		assertThat(fizzBuzz.getAnswerFor(6), is("Fizz"));
		assertThat(fizzBuzz.getAnswerFor(9), is("Fizz"));
	}

	@Test
	public void shouldReturnBizzForNumbersDivisibleByFive() {
		assertThat(fizzBuzz.getAnswerFor(5), is("Buzz"));
		assertThat(fizzBuzz.getAnswerFor(10), is("Buzz"));
		assertThat(fizzBuzz.getAnswerFor(20), is("Buzz"));
	}

	@Test
	public void shouldReturnFizzBizzForNumbersDivisbleByFifteen() {
		assertThat(fizzBuzz.getAnswerFor(15), is("FizzBuzz"));
		assertThat(fizzBuzz.getAnswerFor(30), is("FizzBuzz"));
		assertThat(fizzBuzz.getAnswerFor(45), is("FizzBuzz"));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void shouldThrowErrorForZero() {
		fizzBuzz.getAnswerFor(0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void shouldThrowErrorForNegativeNumber() {
		fizzBuzz.getAnswerFor(-1);
	}

}
