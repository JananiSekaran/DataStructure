package com.test;

public class SinglyLinkedList {
	
	class Node{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public Node head=null;
	public Node tail=null;
	
	public void add(int data)
	{
		Node newNode=new Node(data);
		
		if(head==null)
		{
			head=newNode;
			tail=newNode;
			
		}
		else
		{
			tail.next=newNode;
			tail=tail.next;
		}
	}
	
	public void display()
	{
		Node currentNode=head;
		
		if(currentNode==null)
		{
			System.out.println("list is empty");
			
		}
		while(currentNode!=null)
		{
			System.out.println(currentNode.data);
			currentNode=currentNode.next;
		}
		
	}
	
	 public static void main(String[] args)
	{
		SinglyLinkedList s=new SinglyLinkedList();
		s.add(1);
		s.add(33);
		s.add(44);
		
		s.display();
	}
}