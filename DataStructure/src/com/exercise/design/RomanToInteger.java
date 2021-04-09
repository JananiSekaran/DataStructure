package com.exercise.design;

public class RomanToInteger {

	public static void main(String[] args) {

		String s = "MCMXCIV";
		System.out.println("Roman to Integer: " + romanToInteger(s));
		System.out.println("value "+romanToIntegerNew(s));
	}

	private static int romanToInteger(String s) {
		int result = 0;
		for (int i = 0; i < s.length()-1; i++) {
			char c = s.charAt(i);
			System.out.println("symbolToInt(c) "+symbolToInt(c));
			System.out.println("symbolToInt(s.charAt(i + 1)) "+symbolToInt(s.charAt(i + 1)));
			if (i != s.length() - 1 && symbolToInt(c) < symbolToInt(s.charAt(i + 1))) {
				result = result - symbolToInt(c);
			} else {
				result = result + symbolToInt(c);
			}

		}

		return result;
	}
	

	private static int romanToIntegerNew(String s) {
		
		int result=0;
		char[] charArray=s.toCharArray();
		
		for(int i=0;i<charArray.length-1;i++)
		{
			if(symbolToInt(charArray[i])<symbolToInt(charArray[i+1]))
			{
				result=result-symbolToInt(charArray[i]);
			}
			else
			{
				result=result+symbolToInt(charArray[i]);
			}
		}
		return result;
	}

	private static int symbolToInt(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		}
		return 0;
	}

}
