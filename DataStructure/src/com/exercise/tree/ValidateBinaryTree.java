package com.exercise.tree;

import com.exercise.tree.MaximumDepthOfBinaryTree.TreeNode;


public class ValidateBinaryTree {

	static TreeNode root;
public static void main(String args[]) {
	ValidateBinaryTree tree = new ValidateBinaryTree();
	tree.root = new TreeNode(10);
	tree.root.left = new TreeNode(5);
	tree.root.right = new TreeNode(15);
	tree.root.left.left = new TreeNode(3);
	tree.root.left.right = new TreeNode(6);
	tree.root.right.left=new TreeNode(12);
	tree.root.right.right=new TreeNode(20);
	// display(root);

	System.out.println(isBinaryTree(root));
		// TODO Auto-generated method stub

	}

 static boolean isBinaryTree(TreeNode root) {
	 if(root==null)
		 return true;
	 return dfs(root,null,null);

	 
}
  static boolean dfs(TreeNode root,Integer min,Integer max)
 {
	 if(root==null)
		 return true;
	 if(min!=null && root.data<=min || max!=null && root.data>=max)
		 return false;
	 
	 return dfs(root.left,min,root.data) && dfs(root.right,root.data,max);
	  
 }

static class TreeNode{
	TreeNode left,right=null;
	int data;
	
	TreeNode(int d)
	{
		data=d;
		left=null;
		right=null;
	}
}
}
