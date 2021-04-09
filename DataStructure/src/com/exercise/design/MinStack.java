package com.exercise.design;

import java.util.Stack;

public class MinStack {

	static Stack<Integer> stack = new Stack<>();
	static Stack<Integer> min_stack = new Stack<>();

	public static void main(String[] args) {

		int[] stackArray = { 5, 6, 74, 24, 8 };
		for (int i = 0; i < stackArray.length; i++) {
			push(stackArray[i]);

		}
		pop();
		pop();
		System.out.println(getTop());
		System.out.println(getMin());
	}

	static void push(int x) {
		if (min_stack.isEmpty() || x <= min_stack.peek()) {
			min_stack.push(x);
		}
		stack.push(x);
	}

	static void pop() {
		if (stack.peek().equals(min_stack.peek()))
			min_stack.pop();
		stack.pop();
	}

	static int getTop() {
		if (stack.isEmpty())
			return 0;
		else
			return stack.peek();
	}

	static int getMin() {
		if (min_stack.isEmpty())
			return 0;
		else

			return min_stack.peek();
	}

}
