package com.test;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {

	public static void main(String[] args) {
     Deque<String> deque=new ArrayDeque<>();
     deque.addFirst("Hi");
     deque.add("janani");
     deque.addLast("add last");
     deque.addFirst("addfirst");
     deque.offerFirst("offerFirst");
     deque.offer("first-offer");
     System.out.println(deque);

    System.out.println(deque.peekFirst());
    System.out.println( deque.peek());
    System.out.println(deque.pollFirst());
    System.out.println(deque.pollLast());
    
     System.out.println(deque);
     
		Deque<Integer> q = new ArrayDeque<Integer>();
		int arr[] = { 11, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for(int i=0;i<arr.length;i++)
			q.offer(arr[i]);
		System.out.println(q.toString());
		System.out.println(q.peekLast());
		System.out.println(q.toString());


	}

}
