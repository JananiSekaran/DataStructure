package com.practice.interview.bit.fb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/*https://www.youtube.com/watch?v=tGw5GbDekTU
*/public class TaskScheduler {

	public static void main(String[] args) {

		char[] tasks = { 'A', 'A', 'A', 'B', 'B', 'B' };
		int n = 2;

		System.out.println(leastInterval(tasks, n));
		//System.out.println(leastIntervalNew(tasks,n));
	}

	private static int leastInterval(char[] tasks, int n) {

		Map<Character, Integer> counts = new HashMap<>();
		for (char t : tasks)
			counts.put(t, counts.getOrDefault(t, 0) + 1);

		PriorityQueue<Integer> pq = new PriorityQueue(counts.size(), Collections.reverseOrder());
		pq.addAll(counts.values());

		int result = 0;
		while (!pq.isEmpty()) {
			int time = 1;
			List<Integer> temp = new ArrayList<>();

			for (int i = 0; i < n + 1; ++i) {
				if (!pq.isEmpty()) {
					temp.add(pq.remove() - 1);
					pq.poll();
					time++;
				}
			}

			for (int t : temp) {
				if (t > 0)
					pq.offer(t);

				result += pq.isEmpty() ? time : n + 1;

			}
		}

		return result;
	}

	// Its not working
	static int leastIntervalNew(char[] tasks, int n) {
		int[] f = new int[26];
		for (char t : tasks)
			f[t - 'A']++;

		Arrays.sort(f);

		int chunk = f[25] - 1;
		int idleSpots = chunk * n;

		for (int i = 24; i > 0; i--) {
			idleSpots -= Math.min(chunk, f[i]);
		}

		return idleSpots > 0 ? tasks.length : idleSpots + tasks.length;
	}

}
