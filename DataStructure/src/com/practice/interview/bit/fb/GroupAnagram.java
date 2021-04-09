package com.practice.interview.bit.fb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
	/*
	 * https://www.youtube.com/watch?v=PPc0v_oDQvo
	 */ public static void main(String[] args) {

		String[] str = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(groupAnagram(str));
	}

	private static List<List<String>> groupAnagram(String[] str) {

		Map<String, ArrayList<String>> map = new HashMap<>();
		for (String st : str) {

			char[] ch=st.toCharArray();
			Arrays.sort(ch);
			String key=new String(ch);
			map.putIfAbsent(key, new ArrayList<>());
			map.get(key).add(st);
		}

		return new ArrayList(map.values());
	}

}
