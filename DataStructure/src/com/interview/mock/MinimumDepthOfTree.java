package com.interview.mock;

import com.interview.mock.DistanceBetweenTwoNodes.Node;

public class MinimumDepthOfTree {

	static Node root;

	public static void main(String[] args) {
		MinimumDepthOfTree tree = new MinimumDepthOfTree();
		tree.root = new Node(0);
		tree.root.left = new Node(1);
		tree.root.right = new Node(2);
		tree.root.right.right = new Node(3);

		System.out.println(minDepth(root));
	}

	private static int minDepth(Node root) {
		if(root==null)
			return 0;
		if(root.left==null && root.left==null)
			return 1;
		
		if(root.left==null)
			return minDepth(root.right)+1;
		
		if(root.right==null)
			return minDepth(root.left)+1;

		return Math.min(minDepth(root.right), minDepth(root.left))+1;
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
