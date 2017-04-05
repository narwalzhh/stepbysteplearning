package com.rookiego.quiz.day1;

public class TestOutPutWord100Times {
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
