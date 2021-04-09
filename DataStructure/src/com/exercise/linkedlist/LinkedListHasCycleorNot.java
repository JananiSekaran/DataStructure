package com.exercise.linkedlist;

public class LinkedListHasCycleorNot {

	public static void main(String[] args) {
		Node head1 = newNode(5);
		head1.next = newNode(3);
		head1.next.next = newNode(1);
		//head1.next.next.next= head1; 

	//	display(head1);
		System.out.println("List has cycle or not: " + isListHasCycle(head1));
	}

	private static boolean isListHasCycle(Node head) {

		Node fast = head;
		Node slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;

			if (fast == slow)
				return true;
		}

		return false;
	}

	static class Node {
		int data;
		Node next;
	};

	// Function to create newNode in a linkedlist
	static Node newNode(int key) {
		Node temp = new Node();
		temp.data = key;
		temp.next = null;
		return temp;
	}

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

}
