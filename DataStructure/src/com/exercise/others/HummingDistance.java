package com.exercise.others;

public class HummingDistance {

	public static void main(String[] args) {

		int x = 1, y = 4;
		System.out.println(hummingDistance(x, y));
		System.out.println(hummingDistanceNew(x, y));

		/*String str1 = "ABED";
		String str2 = "ABED";
		System.out.println(humminDistanceForString(str1, str2));*/

	}

	/*private static int humminDistanceForString(String str1, String str2) {
		if(str1.isEmpty() || str2.isEmpty() || str1.length()!=str2.length())
			return 0;
		
		int count=0;
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)!=str2.charAt(i))
				count++;
		}
		return count;
	}*/

	private static int hummingDistance(int x, int y) {

		int xor = x ^ y;

		return Integer.bitCount(xor);
	}

	private static int hummingDistanceNew(int x, int y) {

		int xor = x ^ y;

		int count = 0;

		for (int i = 0; i < 32; i++)
			count += (xor >> i) & 1;

		return count;
	}
}
