package com.exercise.linkedlist;

public class PalindromeLinkedList {

	public static void main(String[] args) {
		Node head1 = newNode(5);
		head1.next = newNode(3);
		head1.next.next = newNode(5);
		display(head1);
		System.out.println("is palindrome " + isPalindrome(head1));
	}

	public static boolean isPalindrome(Node head) {

		if (head == null)
			return true;

		Node fast = head;
		Node slow = head;

		// while (fast.next != null && fast.next.next != null)
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		Node firstHalfHead = head;
		Node secondHalfHead = reverseList(slow.next);

		while (firstHalfHead != null && secondHalfHead != null) {
			if (firstHalfHead.data != secondHalfHead.data)
				return false;

			else {
				firstHalfHead = firstHalfHead.next;
				secondHalfHead = secondHalfHead.next;

			}
		}

		return true;
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

	private static Node reverseList(Node head) {
		if (head == null)
			return null;

		Node prev = null;
		Node next = null;
		Node current = head;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		return prev;
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
