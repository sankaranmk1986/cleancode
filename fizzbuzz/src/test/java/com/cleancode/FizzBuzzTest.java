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
		assertThat(fizzBuzz.determineFizzBuzz(1), is("1"));
		assertThat(fizzBuzz.determineFizzBuzz(2), is("2"));
		assertThat(fizzBuzz.determineFizzBuzz(4), is("4"));
		assertThat(fizzBuzz.determineFizzBuzz(7), is("7"));
	}

	@Test
	public void shouldReturnFizzForNumbersDivisibleByThree() {
		assertThat(fizzBuzz.determineFizzBuzz(3), is("Fizz"));
		assertThat(fizzBuzz.determineFizzBuzz(6), is("Fizz"));
		assertThat(fizzBuzz.determineFizzBuzz(9), is("Fizz"));
	}

	@Test
	public void shouldReturnBizzForNumbersDivisibleByFive() {
		assertThat(fizzBuzz.determineFizzBuzz(5), is("Buzz"));
		assertThat(fizzBuzz.determineFizzBuzz(10), is("Buzz"));
		assertThat(fizzBuzz.determineFizzBuzz(20), is("Buzz"));
	}

	@Test
	public void shouldReturnFizzBizzForNumbersDivisbleByFifteen() {
		assertThat(fizzBuzz.determineFizzBuzz(15), is("FizzBuzz"));
		assertThat(fizzBuzz.determineFizzBuzz(30), is("FizzBuzz"));
		assertThat(fizzBuzz.determineFizzBuzz(45), is("FizzBuzz"));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void shouldThrowErrorForZero() {
		fizzBuzz.determineFizzBuzz(0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void shouldThrowErrorForNegativeNumber() {
		fizzBuzz.determineFizzBuzz(-1);
	}

}
