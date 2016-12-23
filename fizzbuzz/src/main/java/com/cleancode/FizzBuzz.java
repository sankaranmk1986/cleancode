package com.cleancode;

public class FizzBuzz {
	
	public static String getAnswerFor(int number){
		if(isDivisibleByThree(number)){
			return "Fizz";
		}
		if(isDivisibleByFive(number)){
			return "Buzz";
		}
		return String.valueOf(number);
	}

	private static boolean isDivisibleByFive(int number) {
		return number%5 == 0;
	}

	private static boolean isDivisibleByThree(int number) {
		return number%3 == 0;
	}

}
