package com.exercise.others;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {

		int n = 5;
		List<List<Integer>> value = printPascalTriangel(n);

		for (List<Integer> x : value) {
			for (Integer y : x) {
				System.out.print(y + " ");
			}
			System.out.println("");
		}
	}

	private static List<List<Integer>> printPascalTriangel(int n) {
		List<List<Integer>> triangle = new ArrayList<>();
		if (n == 0)
			return triangle;
		List<Integer> firstRow = new ArrayList<>();
		firstRow.add(1);
		triangle.add(firstRow);

		for (int i = 1; i < n; i++) {
			List<Integer> prev_row = triangle.get(i - 1);
			List<Integer> row = new ArrayList<>();

			row.add(1);

			for (int j = 1; j < i; j++) {
				row.add(prev_row.get(j - 1) + prev_row.get(j));
			}

			row.add(1);

			triangle.add(row);
		}

		return triangle;
	}

}
