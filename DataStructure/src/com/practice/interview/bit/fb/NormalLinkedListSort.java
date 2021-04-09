package com.practice.interview.bit.fb;

import com.practice.interview.bit.fb.SortBinaryTree0sAnd1s.Node;

public class NormalLinkedListSort {

	public static void main(String[] args) {
		Node head = new Node(11);
		head.next = new Node(2);
		head.next.next = new Node(13);
		head.next.next.next = new Node(4);
		Node temp=sort(head);
		display(temp);
		
	}
	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
	private static void display(Node temp) {
		while (temp != null) {
			System.out.print (temp.data+" ");
			temp = temp.next;
		}
	}

	public static Node sort(Node head) {
		if(head==null || head.next==null)
			return head;
		
		Node fast=head;
		Node slow=head;
		while(fast.next!=null && fast.next.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		
		Node mid=slow;
		Node nextMid=mid.next;
		mid.next=null;
		
		Node left=sort(head);
		Node right=sort(nextMid);
		
		return mergeSort(left,right);
		
	}

	private static Node mergeSort(Node a, Node b) {

		if(a==null)
			return b;
		
		if(b==null)
			return a;
		
		Node result=null;
		
		if(a.data<=b.data)
		{
			result=a;
			result.next=mergeSort(a.next, b);
		}
		else
		{
			result=b;
			result.next=mergeSort(b.next, a);
		}
		
		return result;
	}
}
