package com.test;

import java.util.HashMap;
import java.util.Map;
/*https://github.com/awangdev/LintCode/blob/master/Java/Encode%20and%20Decode%20TinyURL.java
*/public class EncodeAndDecodeTinyURL {
	static Map<String, String> map = new HashMap<>();
	static int count = 0;
	static String BASE_URL = "http://tinyurl.com/";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String longURL = "https://leetcode.com/problems/design-tinyurl";
		String shortURL = encode(longURL);
	    System.out.println(decode(shortURL));
	}

	static String encode(String longURL) {

		 final String key = BASE_URL + (map.size() + 1);
	        map.put(key, longURL);
	        return key;

	}

	static String decode(String shortURL) {
		return map.get(shortURL);
	}

}
