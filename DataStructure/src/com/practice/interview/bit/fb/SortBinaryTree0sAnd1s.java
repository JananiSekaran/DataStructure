package com.practice.interview.bit.fb;

public class SortBinaryTree0sAnd1s {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(0);
		head.next.next = new Node(0);
		head.next.next.next = new Node(1);
		display(head);
		Node temp=sort1s0s(head);
		System.out.println("");
		display(temp);
		
	}

	private static void display(Node temp) {
		while (temp != null) {
			System.out.print (temp.data+" ");
			temp = temp.next;
		}
	}

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	static Node sort1s0s(Node head) 
	{
		Node temp=head;
		Node zeroD=new Node(0);
		Node oneD=new Node(0);
		Node zero=zeroD;
		Node one=oneD;
		
		while(temp!=null)
		{
			if(temp.data==0)
			{
				zero.next=temp;
				zero=zero.next;
				temp=temp.next;
			}
			else if(temp.data==1)
			{
				one.next=temp;
				one=one.next;
				temp=temp.next;
			}
			
			
		}

		zero.next=oneD.next;
		head=zeroD.next;
		return head;

	}

}
