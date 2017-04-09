package com.rookiego.quiz.day3;

public class TestMin {
	public static void main(String[] args) {
		int[] i = new int[] { 51, 76, 84, 34, 28, 23, 46, 12, 43, 78 };
		int min = i[0];
		for (int j = 1; j < i.length; j++) {
			if (i[j] < min) {
				min = i[j];
			}
		}
		System.out.println("最小数为：" + min);

	}

}
