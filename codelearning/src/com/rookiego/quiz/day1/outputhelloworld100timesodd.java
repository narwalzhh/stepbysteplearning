package com.rookiego.quiz.day1;

public class outputhelloworld100timesodd {
	public static void main(String[] args) {
		String world = "Hello World!";
		int i = 0;
		do {
			i++;
			if (i % 2 == 1) {
				System.out.print(world);
				System.out.println("---" + i);
			}
		} while (i < 100);
	}
}
