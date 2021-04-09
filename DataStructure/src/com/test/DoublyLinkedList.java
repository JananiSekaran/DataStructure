package com.test;

public class DoublyLinkedList {

	static Node head, tail = null;

	public static void main(String[] args) {
		DoublyLinkedList dl_List = new DoublyLinkedList();
		// Add nodes to the list
		dl_List.addNewNode(10);
		dl_List.addNewNode(20);
		dl_List.addNewNode(30);
		dl_List.addNewNode(40);
		dl_List.addNewNode(50);

		// print the nodes of DoublyLinkedList
		dl_List.printNode();

		deleteNode(head.next);
		dl_List.printNode();

	}

	static class Node {
		Node prev;
		Node next;
		int data;

		Node(int d) {
			this.data = d;
		}

	}

	static void addNewNode(int item) {
		Node newNode = new Node(item);
		if (head == null) {
			head = newNode;
			tail = newNode;
			newNode.prev = null;
			newNode.next = null;

		}

		else if (head != null) {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			tail.next = null;
		}
	}

	static void deleteNode(Node deleteNode) {
		if (head == null || deleteNode == null)
			return;

		if (head == deleteNode)
			head = deleteNode.next;

		if (deleteNode.next != null) {
			deleteNode.next.prev = deleteNode.prev;
		}
		if (deleteNode.prev != null) {
			deleteNode.prev.next = deleteNode.next;
		}

		return;

	}

	void printNode() {
		Node node = head;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println("");
	}
}
