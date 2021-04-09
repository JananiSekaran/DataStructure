package com.practice.interview.bit.fb;

import java.util.LinkedList;
import java.util.Queue;
/*https://www.geeksforgeeks.org/averages-levels-binary-tree/
*/
public class AverageLevelBinaryTree {

	private static TreeNode root;

	public static void main(String[] args) {
		root = new TreeNode(4);  
	    root.left = new TreeNode(2);  
	    root.right = new TreeNode(9);  
	    root.left.left = new TreeNode(3);  
	    root.left.right = new TreeNode(5);  
	    root.right.right = new TreeNode(7);  
		averageLevelBinaryTree(root);
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

static	void averageLevelBinaryTree(TreeNode root) {

		int sum = 0, count = 0;
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);

		while (!q.isEmpty()) {

			sum = 0;
			count = 0;
			Queue<TreeNode> temp = new LinkedList<>();
			while (!q.isEmpty()) {
				TreeNode n = q.peek();
				q.remove();
				count++;
                 sum+=n.data;
                 
				if (n.left != null) {
					temp.add(n.left);
				}
				if (n.right != null) {
					temp.add(n.right);
				}
				

			}
			q=temp;
			System.out.println((sum*1.0/count)+" ");

		}

	}

}
