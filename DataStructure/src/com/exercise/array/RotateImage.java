package com.exercise.array;

import java.util.Arrays;

public class RotateImage {

	public static void main(String[] args) {
		int[][] matrix = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };
		rotateMatrix(matrix);
	}

	private static void rotateMatrix(int[][] matrix) {

		int n=matrix.length;
		
		int temp1=0;
		int temp2=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				temp1=matrix[j][i];
				matrix[j][i]=matrix[i][j];
				matrix[i][j]=temp1;
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n/2;j++)
			{
				temp2=matrix[i][j];
				matrix[i][j]=matrix[i][n-j-1];
				matrix[i][n-j-1]=temp2;
			}
		}
		
		System.out.println(Arrays.deepToString(matrix));
		
		for(int[] x: matrix)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}

}
