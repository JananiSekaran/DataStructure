package com.practice.fb.questions;

public class VisibleNodeBinaryTree {

	Node root;
	static int count;

	public static void main(String[] args) {
		VisibleNodeBinaryTree tree = new VisibleNodeBinaryTree();
		tree.root = new Node(7);
		tree.root.left = new Node(3);
		tree.root.right = new Node(10);

		tree.root.left.left = new Node(20);
		tree.root.left.right = new Node(21);

		tree.root.right.left = new Node(1);
		tree.root.right.left = new Node(11);

		count = 0;
		countofVisibleNode(tree.root, 0);
		System.out.println(count);
	}

	private static void countofVisibleNode(Node root, int max) {
		if (root == null)
			return;
		if (root.data >= max) {
			max = root.data;
			count++;
		}

		countofVisibleNode(root.left, max);
		countofVisibleNode(root.right, max);

	}

	static class Node {
		Node left, right = null;
		int data;

		Node(int d) {
			data = d;
			left = null;
			right = null;
		}
	}
}
