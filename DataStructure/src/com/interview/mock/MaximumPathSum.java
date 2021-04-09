package com.interview.mock;

public class MaximumPathSum {

	Node root;
	static int max_sum;

	public static void main(String[] args) {
		MaximumPathSum tree = new MaximumPathSum();
		tree.root = new Node(3);
		tree.root.left = new Node(4);
		tree.root.right = new Node(5);

		tree.root.left.left = new Node(-10);
		tree.root.left.right = new Node(4);

		System.out.println(maxSum(tree.root));

	}

	private static int maxSum(Node root) {
		if(root==null)
			return 0;
		
		max_sum = Integer.MIN_VALUE;
		  pathSum(root);

		return max_sum;
	}

	private static int pathSum(Node root) {
		if (root == null)
			return 0;

		int left = pathSum(root.left);
		int right = pathSum(root.right);
		max_sum = Math.max(max_sum, left + right + root.data);

		return Math.max(left, right) + root.data;
	}

	static class Node {
		int data;
		Node left, right = null;

		Node(int d) {
			data = d;
			left = null;
			right = null;
		}
	}
}
