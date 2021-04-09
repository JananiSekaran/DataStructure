package com.exercise.tree;

import com.exercise.tree.MaximumDepthOfBinaryTree.TreeNode;

public class SymmetricTree {

	static TreeNode root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SymmetricTree tree = new SymmetricTree();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(2);
		tree.root.left.left = new TreeNode(3);
		tree.root.left.right = new TreeNode(4);
		tree.root.right.left = new TreeNode(4);
		tree.root.right.right = new TreeNode(3);
		System.out.println("Is binary tree symmetric or not: " + isSymmteric(root));
	}

	private static boolean isSymmteric(TreeNode root) {
		// TODO Auto-generated method stub
		return isMirror(root, root);
	}

	private static boolean isMirror(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null)
			return true;
		if (t1 == null || t2 == null)
			return false;

		return t1.data == t2.data && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
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
