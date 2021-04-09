package com.exercise.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.exercise.linkedlist.SinglyLinkedList.Node;
import com.exercise.tree.MaximumDepthOfBinaryTree.TreeNode;

public class BinaryTreeTravesal {
	static TreeNode root;

	public static void main(String[] args) {
		BinaryTreeTravesal tree = new BinaryTreeTravesal();
		tree.root = new TreeNode(10);
		tree.root.left = new TreeNode(5);
		tree.root.right = new TreeNode(15);
		tree.root.left.left = new TreeNode(3);
		tree.root.left.right = new TreeNode(8);
		tree.root.right.left = new TreeNode(12);
		tree.root.right.right = new TreeNode(50);
		// display(root);

		System.out.println(treeTransaversal(root));
		preOrderTraversal(root);
		System.out.println("");
		inOrderTraversal(root);
		System.out.println("");

		postOrderTraversal(root);
		System.out.println("");


		
	}

	private static void preOrderTraversal(TreeNode root) {

		if (root != null) {
			System.out.print(root.data+" ");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);

		}

	}
	private static void inOrderTraversal(TreeNode root) {

		if (root != null) {
			
			preOrderTraversal(root.left);
			System.out.print(root.data+" ");
			preOrderTraversal(root.right);

		}

	}
	private static void postOrderTraversal(TreeNode root) {

		if (root != null) {
			
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
			System.out.print(root.data+" ");

		}

	}

	private static List<List<Integer>> treeTransaversal(TreeNode root) {

		List<List<Integer>> result = new ArrayList<>();
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			int size = q.size();
			List<Integer> level = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				TreeNode curr = q.poll();
				level.add(curr.data);

				if (curr.left != null) {
					q.add(curr.left);
				}
				if (curr.right != null) {
					q.add(curr.right);
				}

			}
			result.add(level);
		}

		return result;
	}

}
