package com.exercise.linkedlist;


public class MergeSortedList {

	public static void main(String[] args) {
		Node head1 = newNode(1);
		head1.next = newNode(3);
		head1.next.next = newNode(5);

		// 1.3.5 LinkedList created

		Node head2 = newNode(2);
		head2.next = newNode(4);
		head2.next.next = newNode(24);

		// 0.2.4 LinkedList created
		System.out.println("merge list sorted");
		Node mergedhead = merge(head1, head2);
		display(mergedhead);
	}

	private static Node merge(Node list1, Node list2) {
		Node temp = newNode(0);
		Node current = temp;
		while (list1 != null && list2 != null) {
			if (list1.data < list2.data) {
				current.next = list1;
				list1 = list1.next;
			} else if(list2.data<list1.data){
				current.next = list2;
				list2 = list2.next;
			}
			current = current.next;
		}
		if (list1 != null) {
			current.next = list1;
			list1 = list1.next;
		}
		if (list2 != null) {
			current.next = list2;
			list2 = list2.next;
		}
		temp=temp.next;
		return temp;
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
	/*
	 * public static Node merge(Node head1, Node head2) { Node head = newNode(0);
	 * Node p=head; Node p1=head1; Node p2=head2;
	 * 
	 * while(p1!=null && p2!=null) { if(p1.data<p2.data) { p.next=p1; p1=p1.next; }
	 * else { p.next=p2; p2=p2.next; } p=p.next;
	 * 
	 * } if(p1!=null) p.next=p1; if(p2!=null) p.next=p2;
	 * 
	 * return head.next; }
	 */

	public static void display(Node head) {
		Node temp = head;
		if (head == null) {
			System.out.println("list is empty");
		}
		while (temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}

	}
}
