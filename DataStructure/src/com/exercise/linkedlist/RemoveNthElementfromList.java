package com.exercise.linkedlist;


public class RemoveNthElementfromList {
	public static void main(String args[]) {

		Node head = newNode(1);
		head.next = newNode(2);
		head.next.next = newNode(3);
		head.next.next.next = newNode(4);
		System.out.println("size: "+sizeofList(head));

		
		display(head);
		Node temp=removeNthElement(head, 4);
		//Node temp=removeNthElementNew(head, 4);

		System.out.println("Remove nth element: " );
		display(temp);
	}

	private static int sizeofList(Node head) {

		int count=0;
		
		Node temp=head;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		
		return count;
	}

	static Node newNode(int key) {
		Node temp = new Node();
		temp.data = key;
		temp.next = null;
		return temp;
	}

	static class Node {
		int data;
		Node next;
	};

	public static void display(Node head) {
		Node temp = head;
		if (head == null) {
			System.out.println("list is empty");
		}
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}
	private static Node removeNthElement(Node head, int n) {
		if(head==null)
			return null;
		
		Node fast = head;
		Node slow = head;

		for(int i=0;i<n;i++)
			fast=fast.next;
		
		if(fast==null)
		{
			head=head.next;
			return head;
		}
		
		while(fast.next!=null)
		{
			fast=fast.next;
			slow=slow.next;
		}
		slow.next=slow.next.next;
		
		return head;
	}
	
	//Its not working
	private static Node removeNthElementNew(Node head, int n)
	{
		Node fast=head;
		Node slow=head;
		
		while(fast.next!=null)
		{
			fast=fast.next;
			if(n--<=0)
			{
				slow=slow.next;
			}
		}
		slow.next=slow.next.next;
		return head;
	}
}
