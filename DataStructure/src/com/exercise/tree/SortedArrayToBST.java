package com.exercise.tree;

public class SortedArrayToBST {

	public static void main(String[] args) {

		int arr[] = { -10, -3, 0, 5, 9 };
		TreeNode head = sortArrayToBST(arr);
		
		traverseInorder(head);
	}
	private static void traverseInorder(TreeNode node) {
	    if(node == null) {
	      return;
	    }
	    traverseInorder(node.left);
	    System.out.print(node.data  + " ");
	    traverseInorder(node.right);
	  }
	private static TreeNode sortArrayToBST(int[] nums) {
		if (nums.length == 0) {
			return null;
		}

		return dfs(nums, 0, nums.length - 1);
	}

	private static TreeNode dfs(int[] nums, int start, int end) {
		if (end < start)
			return null;
		int mid = (start + end) / 2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = dfs(nums, start, mid - 1);
		root.right = dfs(nums, mid + 1, end);

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
