package com.test;

public class RotationalCipher {

	public static void main(String[] args) {

		System.out.println(rotationCiper("Zebra-493?", 3));
		System.out.println(rotationCiper("abcdefghijklmNOPQRSTUVWXYZ0123456789", 39));

		//nopqrstuvwxyzABCDEFGHIJKLM9012345678
		
		//nopqrstuvwxyzABCDEFGHIJKLM39404142434445464748

	}

	private static String rotationCiper(String input, int rotationFactor) {

		String result = "";
		for (int i = 0; i < input.length(); i++) {
			char res = input.charAt(i);
			if (Character.isDigit(res)) {
				int number = Integer.parseInt(String.valueOf(res));
				if (number < 10) {
					number += rotationFactor;
					result += String.valueOf(number);

				} else {
					number = 1;
					number += rotationFactor;
					result += String.valueOf(number);

				}

			}
			if (Character.isAlphabetic(res)) {
				if (Character.isUpperCase(res)) {
					if (res != 'Z') {

						char ch = (char) (((int) (res + rotationFactor) - 65) % 26 + 65);

						result += ch;
					} else {
						char ch = (char) (((int) 'Z' + rotationFactor - 65) % 26 + 65);
						result += ch;
					}
				} else if (Character.isLowerCase(res)) {
					if (res != 'z') {

						char ch=(char) (((int)(res+rotationFactor)-97)%26+97);
						result += ch;

					} else {
						// result+='a'+increament;
						char ch = (char) (((int) 'a' + rotationFactor - 97) % 26 + 97);
						result += ch;

					}
				}

			} else if (!Character.isLetterOrDigit(res)) {
				result += res;
			}
		}

		/*for (int i = 0; i < input.length(); i++) {
	         if (alpha.contains(input.charAt(i)+"")) {
	             result += alpha.charAt( ( alpha.indexOf( input.charAt(i) ) + key%26 )%26 );
	         }
	         else {
	             if (alphaCapital.contains(input.charAt(i)+"")) {
	                 result += alphaCapital.charAt( ( alphaCapital.indexOf( input.charAt(i) ) + key%26 )%26 );
	             }
	             else {
	                 result += input.charAt(i);
	             }
	         }
	     }*/
		return result;
	}

	
	 /*for (int i = 0; i < input.length(); i++) {
         if (alpha.contains(input.charAt(i)+"")) {
             result += alpha.charAt( ( alpha.indexOf( input.charAt(i) ) + key%26 )%26 );
         }
         else {
             if (alphaCapital.contains(input.charAt(i)+"")) {
                 result += alphaCapital.charAt( ( alphaCapital.indexOf( input.charAt(i) ) + key%26 )%26 );
             }
             else {
                 result += input.charAt(i);
             }
         }
     }*/

}
