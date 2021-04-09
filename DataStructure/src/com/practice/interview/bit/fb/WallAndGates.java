package com.practice.interview.bit.fb;

public class WallAndGates {
	/*
	 * https://www.youtube.com/watch?v=wCTbLn6QgTE
	 */ public static void main(String[] args) {
		int[][] rooms = { { 2147483647, -1, 0, 2147483647 }, { 2147483647, 2147483647, 2147483647, -1 },
				{ 2147483647, -1, 2147483647, -1 }, { 0, -1, 2147483647, 2147483647 } };

		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				if (rooms[i][j] == 0) {
					dfs(rooms, i, j, rooms.length, rooms[i].length, 0);
				}

			}
		}
	}

	private static void dfs(int[][] rooms, int i, int j, int rows, int cols, int distance) {

		if (i < 0 || i > rows || j < 0 || j > cols || rooms[i][j] < distance) {
			return;
		}

		dfs(rooms, i - 1, j, rows, cols, distance + 1);
		dfs(rooms, i + 1, j, rows, cols, distance + 1);
		dfs(rooms, i, j - 1, rows, cols, distance + 1);
		dfs(rooms, i, j + 1, rows, cols, distance + 1);
	}

}
