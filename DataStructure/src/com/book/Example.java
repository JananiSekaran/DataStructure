package com.book;

public class Example {
	
	static int methodOne(int i)
	{
		System.out.println("method one "+i);
		return methodTwo(i*=11);
	}
	static int methodTwo(int i)
	{
		System.out.println("method 2 "+i);
		return methodThree(i/=11);
	}
	static int methodThree(int i)
	{
		System.out.println("method 3 "+i);
		return methodFour(i-=11);
	}
	static int methodFour(int i)
	{
		System.out.println("method 4 "+i);
		return i+=11;
	}
	
	public static void main(String args[])
	{
		System.out.println(methodOne(11));
	}
}
