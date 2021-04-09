package com.exercise.design;

import java.util.Arrays;
import java.util.Random;

public class ArrayShuffle {
	static int[] shuffle;
	static int[] original;
	static Random rand;

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };

		original = array;
		shuffle = Arrays.copyOf(array, array.length);
		rand = new Random();
		System.out.println(Arrays.toString(array));

		shuffle();
		System.out.println(Arrays.toString(shuffle));

		reset();

		System.out.println(Arrays.toString(shuffle));

	}

	static int[] reset() {

		shuffle = Arrays.copyOf(original, original.length);

		return shuffle;

	}

	static int[] shuffle() {
		int temp, index;
		for (int i = shuffle.length - 1; i > 0; i--) {
			index = rand.nextInt(i + 1);
			temp = shuffle[index];
			shuffle[index] = shuffle[i];
			shuffle[i] = temp;
		}

		return shuffle;
	}
}
