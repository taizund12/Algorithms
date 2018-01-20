package com.taz.dynamic.programming;

public class Sequences {

	private int getLongestCommonSubsequence(int[] list) {
		int max = 0;
		if (list.length > 0) {
			int[] result = new int[list.length];
			result[0] = 1;
			int prev = list[0];

			for (int i = 1; i < list.length; i++) {
				if (list[i] > prev) {
					result[i] = result[i - 1] + 1;
				} else {
					result[i] = 1;
				}
				if(result[i] > max) {
					max = result[i];
				}
				prev = list[i];
			}
		}

		return max;
	}

	public static void main(String args[]) {
		Sequences seq = new Sequences();
		int[] list = { 1, 2, 5, 4, 6, 8, 9, 1, 3, 11, 19, 25, 27 };
		System.out.println(seq.getLongestCommonSubsequence(list));
	}
}
