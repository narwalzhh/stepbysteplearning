package com.rookiego.quiz.day4;

import java.util.Arrays;

public class TestSelectionSort {
	public static void main(String[] args) {
		int[] num = { 63, 4, 24, 1, 3, 15, 18, 9, 56 };
		for (int i = 0; i < num.length; i++) {
			int min = num[i];
			for (int j = i; j < num.length; j++) {
				if (num[j] < min) {
					int temp = num[i];
					min = num[j];
					num[i] = num[j];
					num[j] = temp;

				}
			}

		}

		System.out.println(Arrays.toString(num));
	}
}
