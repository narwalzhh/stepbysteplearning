package com.rookiego.quiz.day3;

import java.util.Arrays;

public class TestBubbleSort {
	public static void main(String[] args) {
		int[] i = new int[] { 21, 15, 48, 46, 6, 21, 29, 4, 35, 19 };

		for (int a = 0; a < i.length; a++) {
			for (int b = 0; b < i.length; b++) {
				int m;
				if (i[a] < i[b]) {
					m = i[a];
					i[a] = i[b];
					i[b] = m;
				}
			}
		}
		System.out.println(Arrays.toString(i));
	}

}
