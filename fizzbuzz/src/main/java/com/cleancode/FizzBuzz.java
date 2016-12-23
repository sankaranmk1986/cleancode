package com.cleancode;

public class FizzBuzz {
	
	public static String getAnswerFor(int number){
		if(number == 3){
			return "Fizz";
		}
		return String.valueOf(number);
	}

}
