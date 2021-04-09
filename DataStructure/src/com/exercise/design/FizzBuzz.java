package com.exercise.design;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {

		int n = 20;
		System.out.println(fizzBuzz(n).toString());
	}

	private static List<String> fizzBuzz(int n) {
		List<String> output = new ArrayList<String>();

		for (int i = 1; i <= n; i++) {
			if (i % 15 == 0)
				output.add("FizzBuzz");
			else if (i % 5 == 0)
				output.add("Buzz");
			else if (i % 3 == 0)
				output.add("Fizz");
			else
				output.add(String.valueOf(i));
		}

		return output;
	}

}
