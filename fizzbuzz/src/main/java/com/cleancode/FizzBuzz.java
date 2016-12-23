package com.cleancode;

public class FizzBuzz {
	
	public static String getAnswerFor(int number){
		if(number%3 == 0){
			return "Fizz";
		}
		if(number%5 == 0){
			return "Buzz";
		}
		return String.valueOf(number);
	}

}
