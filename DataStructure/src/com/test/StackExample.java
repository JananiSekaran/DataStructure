package com.test;

import java.util.Stack;

public class StackExample {

	public static void main(String args[])
	{
	Stack<Integer> stack=new Stack<Integer>();	
	stack_push(stack);
	stack_pop(stack);
    stack_push(stack); 

	stack_peek(stack);
	stack_search(stack,4);
	}
	
	static void stack_push(Stack<Integer> stack)
	{
		for(int i=0;i<5;i++)
			stack.push(i);
	}
	
	static void stack_pop(Stack<Integer> stack)
	{
        System.out.println("Pop Operation:"); 

		for(int i=0;i<5;i++)
		{
			System.out.println((Integer)stack.pop());
		}
		
	}
	
	static void stack_peek(Stack<Integer> stack)
	{
		Integer element=(Integer)stack.peek();
        System.out.println("Element on stack top: " + element); 

	}
	
	static void stack_search(Stack<Integer> stack,int element)
	{
		Integer pos=(Integer)stack.search(element);
		if(pos==-1)
			System.out.println("element not found");
		else
		System.out.println("element found at the position of "+pos);
	}
	}

