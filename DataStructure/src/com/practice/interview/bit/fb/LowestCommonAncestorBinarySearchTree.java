package com.practice.interview.bit.fb;

public class LowestCommonAncestorBinarySearchTree {

	static TreeNode root;

	/*
	 * https://www.youtube.com/watch?v=6POfA8fruxI
	 */ public static void main(String[] args) {
		LowestCommonAncestorBinarySearchTree tree = new LowestCommonAncestorBinarySearchTree();
		tree.root = new TreeNode(10);
		tree.root.left = new TreeNode(5);
		tree.root.right = new TreeNode(15);
		tree.root.left.left = new TreeNode(3);
		tree.root.left.right = new TreeNode(8);
		tree.root.right.left = new TreeNode(12);
		tree.root.right.right = new TreeNode(50);

		TreeNode temp=LCA(root,root.left, root.right);
		System.out.println(temp.data);
	}

	private static TreeNode LCA(TreeNode root, TreeNode i, TreeNode j) {

		if(root==null)
			return null;
		
		if(i.data<root.data && j.data<root.data)
			return LCA(root.left,i,j);
		
		if(i.data>root.data && j.data>root.data)
			return LCA(root.right,i,j);
		
		
		return root;
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
