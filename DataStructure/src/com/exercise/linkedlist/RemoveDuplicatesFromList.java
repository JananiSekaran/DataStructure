package com.exercise.linkedlist;

public class RemoveDuplicatesFromList {
	static Node head;

	public static void main(String[] args) {
		RemoveDuplicatesFromList list = new RemoveDuplicatesFromList();
		list.head = new Node(5);
		list.head.next = new Node(3);
		list.head.next.next = new Node(1);
		list.head.next.next.next = new Node(3);
		list.head.next.next.next.next = new Node(5);

		list.removeDuplicatese(head);
		list.display();

	}

	private void display() {

		if (head == null)
			System.out.println("List is empty");

		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

	private void removeDuplicatese(Node head) {
		Node temp = head;
		Node prev = null;

		while (temp != null && temp.next != null) {
			prev = temp;

			while (prev != null && prev.next != null) {
				if (temp.data == prev.next.data) {

					prev.next = prev.next.next;
					System.gc();
				} else {
					prev = prev.next;
				}
			}
			temp = temp.next;
		}

	}

	static class Node {
		int data;
		Node next = null;

		Node(int d) {
			data = d;
			next = null;
		}

	}
}
