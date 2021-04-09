package com.practice.fb.questions;

public class ConvertTernaryExpressionToBinaryTree {

	public static void main(String[] args) {

		 String exp = "a?b?c:d:e"; 
		 ConvertTernaryExpressionToBinaryTree treeNode=new ConvertTernaryExpressionToBinaryTree();
		 char ch[]=exp.toCharArray();
		 Node root=convertExpression(ch,0);
		 treeNode.printPreOrder(root);
		 
		 
	}

	private void printPreOrder(Node root) {

		Node temp=root;
		if(temp!=null)
		{
			System.out.print(temp.data+" ");
			printPreOrder(temp.left);
			printPreOrder(temp.right);
		}
			
	}

	private static Node convertExpression(char[] ch, int i) {

		if(i>=ch.length)
			return null;
		
		Node root=new Node(ch[i]);
		++i;
		
		if(i<ch.length && ch[i]=='?')
			root.left=convertExpression(ch, i+1);
		else
			root.right=convertExpression(ch, i+1);
		
		return root;
	}

	static class Node{
		char data;
		Node left;
		Node right;
		
		Node(char d)
		{
			data=d;
			left=null;
			right=null;
		}
	}
}
