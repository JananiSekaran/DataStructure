package com.practice.interview.bit.fb;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class SerializeAndDeSerializeBinaryTree {
	static TreeNode root;

	public static void main(String[] args) {
		SerializeAndDeSerializeBinaryTree tree = new SerializeAndDeSerializeBinaryTree();
		tree.root = new TreeNode(10);
		tree.root.left = new TreeNode(5);
		tree.root.right = new TreeNode(15);
		tree.root.left.left = new TreeNode(3);
		tree.root.left.right = new TreeNode(6);
		tree.root.right.left = new TreeNode(12);
		tree.root.right.right = new TreeNode(20);
		String value = serializeTree(root);
		System.out.println(value);
		TreeNode temp = deSerializeTree(value);
		display(temp);
	}

	static class TreeNode {
		TreeNode left, right = null;
		int data;

		TreeNode(int d) {
			data = d;
			left = null;
			right = null;
		}
	}
	private static void display(TreeNode temp) {
		if (temp != null) {
			System.out.print (temp.data+" ");
			display(temp.left);
			display(temp.right);
			
		}
	}
	static String serializeTree(TreeNode root) {

		if (root == null)
			return "X";

		return root.data + "," + serializeTree(root.left) + serializeTree(root.right);
	}

	static TreeNode deSerializeTree(String root) {

		Queue<String> q = new LinkedList<String>();

		q.addAll(Arrays.asList(root.split(",")));

		return deSerializeHelper(q);
	}

	private static TreeNode deSerializeHelper(Queue<String> q) {
		String nodeValue = q.poll();
		if (nodeValue.equals("X"))
			return null;

		TreeNode root = new TreeNode(Integer.valueOf(nodeValue));

		root.left = deSerializeHelper(q);
		root.right = deSerializeHelper(q);

		return root;
	}
}
