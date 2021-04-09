package com.exercise.tree;

import java.util.LinkedList;
import java.util.Stack;

import com.exercise.tree.MaximumDepthOfBinaryTree.TreeNode;

public class MaximumDepthOfBinaryTree {
	static TreeNode root;

	public static void main(String[] args) {
		MaximumDepthOfBinaryTree tree = new MaximumDepthOfBinaryTree();
		tree.root = new TreeNode(10);
		tree.root.left = new TreeNode(5);
		tree.root.right = new TreeNode(15);
		tree.root.left.left = new TreeNode(3);
		tree.root.left.right = new TreeNode(8);
		tree.root.right.left = new TreeNode(12);
		tree.root.right.right = new TreeNode(50);
		// display(root);

		//System.out.println(maxDepthofBinarTree(root));
		//System.out.println(maxDepthofBinarTreeWithoutRecursive(root));
		System.out.println(maxDepth(root));
	}

	private static int maxDepthofBinarTree(TreeNode root) {
		if (root == null)
			return 0;

		return 1 + Math.max(maxDepthofBinarTree(root.left), maxDepthofBinarTree(root.right));
	}

	private static int maxDepthofBinarTreeWithoutRecursive(TreeNode root) {
		if (root == null)
			return 0;

		int depth = 1;
		LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
		LinkedList<Integer> depthList = new LinkedList<Integer>();
		stack.add(root);
		depthList.add(1);
		TreeNode currentNode = null;
		int curentDepth = 0;
		while (!stack.isEmpty()) {
			currentNode=stack.pollLast();
			curentDepth=depthList.pollLast();
			if(currentNode!=null)
			{
				depth=Math.max(depth, curentDepth);
				stack.push(currentNode.right);
				depthList.push(1+curentDepth);
				stack.push(currentNode.left);
				depthList.push(1+curentDepth);
			}
		}

		return depth;
	}

	static int maxDepth (TreeNode root) {
	    int depth = 0;
	    Stack<TreeNode> stack = new Stack<>();
	    Stack<TreeNode> path = new Stack<>();

	    stack.push (root);
	    while (!stack.empty()) {
	    	TreeNode temp = stack.peek();
	        if (!path.empty() && temp == path.peek()) {
	            if (path.size() > depth)
	                depth = path.size();
	            path.pop();
	            stack.pop();
	        } else {
	            path.push(temp);
	            if (temp.right != null)
	                stack.push(temp.right);
	            if (temp.left != null)
	                stack.push(temp.left);
	        }
	    }

	    return depth;
	}
	
	static class TreeNode {
		int data;
		TreeNode left, right = null;

		TreeNode(int value) {
			data = value;
			left = null;
			right = null;
		}
	}
}
