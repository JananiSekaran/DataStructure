package com.practice.interview.bit.fb;

import java.util.Stack;

public class MaxRectangleInBinaryMatrix1 {

	public static void main(String[] args) {
		/*
		 * int[][] matrix = { { 0, 1, 1, 0, }, { 1, 1, 1, 1, }, { 1, 1, 1, 1, }, { 1, 1,
		 * 0, 0 } };
		 */
		int[][] matrix = { { 0, 1, 1, 0 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 0, 0 } };
		int rows = 4;
		int cols = 4;

		int[][] grid = new int[rows][cols];
		buildHistogram(matrix, grid, rows, cols);
		int max = 0;
		for (int i = 0; i < matrix.length; i++) {
			max = Math.max(max, maxRectangle(grid, i));
		}
		System.out.println(max);
	}

	private static int maxRectangle(int[][] grid, int i) {
		Stack<Integer> stack = new Stack<>();
		stack.push(-1);
		int max = 0;
		int cur_index = 0;
		while (cur_index < grid[i].length) {

			while (stack.peek() != -1 && grid[i][cur_index] <= grid[i][stack.peek()]) {
				max = Math.max(max, (grid[i][stack.pop()]) * (cur_index - stack.peek() - 1));
			}
			stack.push(cur_index++);
		}

		while (stack.peek() == -1) {
			max = Math.max(max, (grid[i][stack.pop()]) * (grid[i].length - stack.peek() - 1));
		}
		System.out.println("value " + max);

		return max;
	}

	private static void buildHistogram(int[][] matrix, int[][] grid, int cols, int rows) {

		for (int i = 0; i < cols; i++) {
			grid[0][i] = matrix[0][i] == 1 ? 1 : 0;
		}

		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				grid[i][j] = matrix[i][j] == 1 ? grid[i - 1][j] + 1 : 0;
			}
		}
	}

}
