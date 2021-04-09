package com.practice.interview.bit.fb;

import java.util.HashMap;
import java.util.Map;

/*https://massivealgorithms.blogspot.com/2018/05/leetcode-825-friends-of-appropriate-ages.html
*/public class FriendsOfApprioriateAges {

	public static void main(String[] args) {

		int[] ages = {16,17,18};
		 System.out.println(numFriendRequests(ages));
		System.out.println(numFriendRequestsNew(ages));
	}

	static int numFriendRequests(int[] ages) {
		Map<Integer, Integer> count = new HashMap<>();
		for (int age : ages)
			count.put(age, count.getOrDefault(age, 0) + 1);
		int res = 0;
		for (Integer a : count.keySet())
			for (Integer b : count.keySet())
				if (request(a, b))
					res += count.get(a) * (count.get(b) - (a == b ? 1 : 0));
		return res;
	}

	static boolean request(int a, int b) {
		return !(b <= 0.5 * a + 7 || b > a || (b > 100 && a < 100));
	}

	// New another approach
	static int numFriendRequestsNew(int[] ages) {
		int[] count = new int[121];
		for (int age : ages) {
			count[age]++;
		}
		
		int rst = 0;
		for (int ageA = 1; ageA <= 120; ageA++) {
			for (int ageB = 1; ageB <= 120; ageB++) {
				if ((ageB > 0.5 * ageA + 7) && (ageB <= ageA) && (ageB <= 100 || ageA >= 100)) {
					rst += ageA == ageB ? count[ageA] * (count[ageA] - 1) : count[ageA] * count[ageB];
				}
			}
		}
		return rst;
	}

}
