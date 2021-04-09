package com.practice.interview.bit.fb;

import com.practice.interview.bit.fb.LowestCommonAncestorBinarySearchTree.TreeNode;

/*https://www.programcreek.com/2014/07/leetcode-lowest-common-ancestor-of-a-binary-tree-java/
 * 
 * This is for Binary Tree not Binary Search Tree
*/public class LowerCommonAncestorBinaryTree {

	static TreeNode root;

	public static void main(String[] args) {
		LowerCommonAncestorBinaryTree tree = new LowerCommonAncestorBinaryTree();
		tree.root = new TreeNode(10);
		tree.root.left = new TreeNode(5);
		tree.root.right = new TreeNode(15);
		tree.root.left.left = new TreeNode(3);
		tree.root.left.right = new TreeNode(8);
		tree.root.right.left = new TreeNode(12);
		tree.root.right.right = new TreeNode(50);

		//System.out.println(LCA(root, 12, 50));
		TreeNode temp=LCA(root,root.left,root.right);
		System.out.println(temp.data);
	}

	private static TreeNode LCA(TreeNode root, TreeNode i, TreeNode j) {

		if(root==null)
			return null;
		
		if(root==i || root==j)
			return root;
		
		TreeNode l=LCA(root.left,i,j);
		TreeNode r=LCA(root.right,i,j);
		
		if(l!=null && r!=null)
			return root;
		if(l==null && r==null)
			return null;
		
		return l==null?r:l; 
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
