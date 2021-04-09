package com.practice.fb.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PassingYearBook {

	public static void main(String[] args) {
		int[] arr = { 1, 2 };
		System.out.println(Arrays.toString(findSignatureCounts(arr)));
	}

	static int[] findSignatureCounts(int[] arr) {
		int[] res = new int[arr.length];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++)
			map.put(arr[i], i + 1);

		Set<Integer> visited = new HashSet<Integer>();
		for (int k : map.keySet()) {
			Set<Integer> round = new HashSet<Integer>();
			while (!visited.contains(k)) {
				visited.add(k);
				round.add(k);
				k = map.get(k);
			}
			for (int i : round) {
				res[i - 1] = round.size();

			}

		}
		return res;
	}

}
