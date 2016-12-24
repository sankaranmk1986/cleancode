package com.cleancode;

public class FizzBuzz {
	
	public String determineFizzBuzz(int number){
		validateNumber(number);
		String output=String.valueOf(number);
		if(isDivisibleByThree(number) && isDivisibleByFive(number)){
			output="FizzBuzz";
		}else if(isDivisibleByThree(number)){
			output="Fizz";
		}else if(isDivisibleByFive(number)){
			output="Buzz";
		}
		return output;
	}
	
	private void validateNumber(int number){
		if(number < 1){
			throw new IllegalArgumentException();
		}
	}

	private boolean isDivisibleByFive(int number) {
		return number%5 == 0;
	}

	private boolean isDivisibleByThree(int number) {
		return number%3 == 0;
	}

}
