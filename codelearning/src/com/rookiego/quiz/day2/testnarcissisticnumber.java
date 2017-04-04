package com.rookiego.quiz.day2;

public class testnarcissisticnumber {
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			int a = i / 100;
			int b = (i % 100) / 10;
			int c = i % 10;

			if (i == (a ^ 3 + b ^ 3 + c ^ 3)) {
				System.out.println("水仙花数：" + i);
			}
		}
	}
}
