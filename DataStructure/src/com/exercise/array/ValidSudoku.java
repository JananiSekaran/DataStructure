package com.exercise.array;

import java.util.HashSet;

public class ValidSudoku {

	public static void main(String[] args) {
// if the input is character
		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

		System.out.println("is valid sudoko " + isValidSudoku(board));

		//if the input is integer
		int[][] solution = { { 4, 2, 9, 8, 1, 3, 5, 6, 7 }, { 5, 1, 6, 4, 7, 2, 9, 3, 8 },
				{ 7, 8, 3, 6, 5, 9, 2, 4, 1 }, { 6, 7, 2, 1, 3, 4, 8, 5, 9 }, { 3, 9, 5, 2, 8, 6, 1, 7, 4 },
				{ 8, 4, 1, 7, 9, 5, 6, 2, 3 }, { 1, 5, 8, 3, 6, 7, 4, 9, 2 }, { 9, 3, 4, 5, 2, 8, 7, 1, 6 },
				{ 2, 6, 7, 9, 4, 1, 3, 8, 5 } };
		System.out.println("is valid sudoko "+isValidSudoko(solution));

	}

	private static boolean isValidSudoko(int[][] solution) {

		HashSet<String> seen = new HashSet<>();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				int current_val = solution[i][j];
				if (current_val != '.') {
					if (!seen.add(current_val + "found in row" + i) || !seen.add(current_val + "found in column" + j)
							|| !seen.add(current_val + "found in subbox" + i / 3 + "-" + j / 3)) {

						return false;
					}

				}
			}
		}

		return true;
	}

	private static boolean isValidSudoku(char[][] board) {

		HashSet<String> seen = new HashSet<>();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				char current_val = board[i][j];
				if (current_val != '.') {
					if (!seen.add(current_val + "found in row" + i) || !seen.add(current_val + "found in column" + j)
							|| !seen.add(current_val + "found in subbox" + i / 3 + "-" + j / 3)) {

						return false;
					}

				}
			}
		}

		return true;
	}

}
