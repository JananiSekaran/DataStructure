package com.exercise.array;

public class RotationRight {

	public static void main(String[] args) {


		int[] arr=new int[]{11,32,53,54,65,46,57};
		int k=3;
		rightRotate(arr,k);
		
		
	}
	public static void rightRotate(int[] A, int k)
	{
		int[] orgA = A.clone();
		int n = A.length;
		for (int i = 0; i < n; i++) {
			//rightRotateByOne(A);
			System.out.println("(i+k)%n "+(i+k)%n+">>>A[(i+k)%n] "+A[(i+k)%n]);
			A[(i+k)%n] = orgA[i] ;
		}
		
		for(int i=0;i<n;i++)
		System.out.print(A[i]+" ");
	}
}
