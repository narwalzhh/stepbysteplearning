package com.rookiego.quiz.day1;

public class outputhelloworld100times {
	public static void main(String[] args) {
		String world = "Hello World!";
		int i = 0;
		while (i < 100) {
			i++;
			System.out.print(world);
			System.out.println("---" + i);
		}
	}
}
