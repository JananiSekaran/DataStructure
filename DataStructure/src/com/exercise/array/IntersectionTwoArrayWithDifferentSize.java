package com.exercise.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionTwoArrayWithDifferentSize {
	public static void main(String args[]) {
		
		Integer[] array1 = { 9, 4, 6, 2, 10, 10 };
		Integer[] array2 = { 14, 3, 6, 9, 10, 15, 17, 9 };
	System.out.println(Arrays.toString(interSectionArray(array1, array2)));
	}

	private static int [] interSectionArray(Integer[] array1, Integer[] array2) {
		Set<Integer> hashSet = new HashSet(Arrays.asList(array1));
		Set<Integer> commonElements = new HashSet();
		for (int i = 0; i < array2.length; i++) {
			if (hashSet.contains(array2[i])) {
				commonElements.add(array2[i]);
			}
		}
		return 	commonElements.stream() 
        .mapToInt(Integer::intValue) 
        .toArray();
	}
}
