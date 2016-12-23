package com.cleancode;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
	
	@Test
	public void shouldReturnNumberForOne(){
		Assert.assertThat(FizzBuzz.getAnswerFor(1), is("1"));
	}

}
