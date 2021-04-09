package com.practice.interview.bit.fb;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/*
https://www.programcreek.com/2014/05/leetcode-meeting-rooms-ii-java/
*/public class MeetingRoom {

	public static void main(String[] args) {

	//	int[][] intervals = { { 0, 30 }, { 5, 10 }, { 15, 20 } };

		Interval i = new Interval(0, 30);
		Interval j = new Interval(5, 10);

		Interval k = new Interval(15, 20);

		Interval[] inte = { i, j, k };
		System.out.println(canAttendMeetings(inte));

	}

	public static class Interval {
		int start;
		int end;

		Interval() {
			start = 0;
			end = 0;
		}

		Interval(int s, int e) {
			start = s;
			end = e;
		}
	}

	static boolean canAttendMeetings(Interval[] intervals) {
		Arrays.sort(intervals, new Comparator<Interval>() {
			public int compare(Interval a, Interval b) {
				return a.start - b.start;
			}
		});

		for (int i = 0; i < intervals.length - 1; i++) {
			if (intervals[i].end > intervals[i + 1].start) {
				return false;
			}
		}

		return true;
	}

}
