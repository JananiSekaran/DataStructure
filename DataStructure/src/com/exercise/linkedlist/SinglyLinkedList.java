package com.exercise.linkedlist;

public class SinglyLinkedList {
	public static Node head = null;
	public Node tail = null;

	public static void main(String args[]) {

		SinglyLinkedList d = new SinglyLinkedList();
		d.addNode(5);
		d.addNode(10);
		d.addNode(11);
		d.addNode(15);
		d.addNode(150);

		SinglyLinkedList d1 = new SinglyLinkedList();

		d1.addNode(35);
		d1.addNode(0);
		d1.addNode(41);
		d1.addNode(25);
		d1.addNode(50);
		d.display();

		d.deleteNode(head.next.next);// 11 need to delete
		System.out.println("after deletion ");
		d.display();

		System.out.println("reverse ");
		Node currentHead = reverseList(head);
		d.displayReverse(currentHead);

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

	private void deleteNode(Node nodeToDelete) {

		if (nodeToDelete.next == null)
			nodeToDelete = null;

		nodeToDelete.data = nodeToDelete.next.data;
		nodeToDelete.next = nodeToDelete.next.next;
	}

	public class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}

	}

	public void addNode(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else if (tail != null) {
			tail.next = newNode;
			tail = newNode;

		}
	}

	public void display() {
		Node temp = head;
		if (head == null) {
			System.out.println("list is empty");
		}
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

	public void displayReverse(Node head) {
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
