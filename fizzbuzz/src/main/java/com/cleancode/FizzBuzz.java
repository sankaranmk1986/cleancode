package com.cleancode;

public class FizzBuzz {
	
	public static String getAnswerFor(int number){
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

	private static boolean isDivisibleByFive(int number) {
		return number%5 == 0;
	}

	private static boolean isDivisibleByThree(int number) {
		return number%3 == 0;
	}

}
