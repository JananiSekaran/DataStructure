package com.interview.mock;

public class DistanceBetweenTwoNodes {

	static Node root;

	public static void main(String[] args) {
		DistanceBetweenTwoNodes tree = new DistanceBetweenTwoNodes();
		tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 

		System.out.println(diameter(tree.root));

	}

	private static int diameter(Node root) {
		 if(root == null) {
             return 0;
      }
		int lHeight=height(root.left);
		int rHeight=height(root.right);
		
		int lDiameter=diameter(root.left);
		int rDiameter=diameter(root.right);
		
		return Math.max(lHeight+rHeight+1,Math.max(lDiameter, rDiameter));
		
	}

	private static int height(Node root) {

		if(root==null)
			return 0;
		
		int lHeight=height(root.left);
		int rHeight=height(root.right);
		
		if(lHeight>rHeight)
			return lHeight+1;
		else
			return rHeight+1;
		
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
