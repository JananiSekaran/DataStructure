package com.practice.interview.bit.fb;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
/*
https://www.programcreek.com/2014/05/leetcode-meeting-rooms-ii-java/
*/public class MeetingRoomWithMinimumConfRequired {

	public static void main(String[] args) {

		int[][] intervals = { { 0, 30 }, { 5, 10 }, { 15, 20 } };
		System.out.println(solve(intervals));
		System.out.println(minMeetingRooms(intervals));

	}

	public static int solve(int[][] A) {
	//	Arrays.sort(A, (a, b) -> (a[0] == b[0] ? (a[1] - b[1]) : (a[0] - b[0])));
	  Arrays.sort(A, Comparator.comparing((int[] itv) -> itv[0]));

		PriorityQueue<Integer> heapQueue = new PriorityQueue<>();
		int count = 0;
		for (int[] itv : A) {
			if (heapQueue.isEmpty()) {
				count++;
				heapQueue.offer(itv[1]);
			} else {
				if (itv[0] >= heapQueue.peek()) {
					heapQueue.poll();
				} else {
					count++;
				}

				heapQueue.offer(itv[1]);
			}
		}

		return count;
	}
	
	public static int minMeetingRooms(int[][] intervals) {
	    Arrays.sort(intervals, (a, b) -> (a[0] == b[0] ? (a[1] - b[1]) : (a[0] - b[0])));
	    PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
	    for (int[] i : intervals) {
	        if (!queue.isEmpty() && queue.peek() <= i[0])
	            queue.poll();
	        queue.add(i[1]);
	    }
	    return queue.size();
	}

}
