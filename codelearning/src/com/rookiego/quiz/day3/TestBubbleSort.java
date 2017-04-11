package com.rookiego.quiz.day3;

import java.util.Arrays;

public class TestBubbleSort {
	public static void main(String[] args) {
		int[] i = new int[] { 21, 15, 48, 46, 6, 21, 29, 4, 35, 19 };
		int count = 0;

		for (int a = 0; a < i.length - 1; a++) {
			for (int b = 0; b < i.length - a - 1; b++) {
				if (i[b] < i[b + 1]) {
					int m;
					m = i[b];
					i[b] = i[b + 1];
					i[b + 1] = m;
				}
				count++;
			}
		}
		System.out.println(Arrays.toString(i));
		System.out.println("当前循环次数为：" + count);
	}
}
