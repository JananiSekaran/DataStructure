package com.test;

public class SinglyLinkedListRemoveDuplicates {
	public static void main(String[] args) {
		SinglyLinkedListRemoveDuplicates s = new SinglyLinkedListRemoveDuplicates();
		s.add(100);
		s.add(33);
		s.add(33);
		s.add(44);
		s.add(44);

		System.out.println("before removing duplicates");
		s.display();

		s.removeDuplicateNew();
		System.out.println("after removing duplicates");
		s.display();

		s.sortList();
		System.out.println("after sorting");
		s.display();

	}
	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public Node head = null;
	public Node tail = null;

	public void add(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;

		} else {
			tail.next = newNode;
			tail = tail.next;
		}
	}

	
	public void sortList() {
		Node current = head;
		Node index = null;
		int temp;

		if (current == null) {
			System.out.println("list is empty");
		}

		else {
			while (current.next != null) {
				index = current.next;
				while (index != null) {
					if (current.data > index.data) {
						temp = current.data;
						current.data = index.data;
						index.data = temp;

					}
					index = index.next;
				}

				current = current.next;

			}
		}

	}
	 public void removeDuplicateNew() {  
	        //Node current will point to head  
	        Node current = head, index = null, temp = null;  
	          
	        if(head == null) {  
	            return;  
	        }  
	        else {  
	            while(current != null){  
	                //Node temp will point to previous node to index.  
	                temp = current;  
	                //Index will point to node next to current  
	                index = current.next;  
	                  
	                while(index != null) {  
	                    //If current node's data is equal to index node's data  
	                    if(current.data == index.data) {  
	                        //Here, index node is pointing to the node which is duplicate of current node  
	                        //Skips the duplicate node by pointing to next node  
	                        temp.next = index.next;  
	                    }  
	                    else {  
	                        //Temp will point to previous node of index.  
	                        temp = index;  
	                    }  
	                    index = index.next;  
	                }  
	                current = current.next;  
	            }          
	        }  
	    }  
	 
	 
	
	public void display() {
		Node currentNode = head;

		if (currentNode == null) {
			System.out.println("list is empty");

		} else {
			while (currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
		}
	}

	
}