package com.practice.interview.bit.fb;

public class NumberOfIsland {
	/*https://www.youtube.com/watch?v=__98uL6wst8
*/	public static void main(String[] args) {
		char[][] grid = { { '1', '1', '0', '0', '0' }, { '1', '1', '0', '0', '0' }, { '0', '0', '1', '0', '0' },
				{ '0', '0', '0', '1', '1' } };
		System.out.println(numIslands(grid));

	}

	public static int numIslands(char[][] grid) {

		int rows = grid.length;

		if (rows == 0)
			return 0;

		int cols = grid[0].length;

		int numberOfIsland = 0;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (grid[i][j] == '1') {
					markCurrentIsLand(grid, i, j, rows, cols);
					numberOfIsland++;
				}
			}
		}

		return numberOfIsland;
	}

	private static void markCurrentIsLand(char[][] grid, int x, int y, int r, int c) {

		if (x < 0 || x >= r || y < 0 || y >= c || grid[x][y] != '1')
			return;

		grid[x][y] = '2';

		markCurrentIsLand(grid, x + 1, y, r, c);
		markCurrentIsLand(grid, x, y + 1, r, c);
		markCurrentIsLand(grid, x - 1, y, r, c);
		markCurrentIsLand(grid, x, y - 1, r, c);
	}

}
