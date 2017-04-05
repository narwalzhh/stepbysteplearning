package com.rookiego.quiz.day1;

public class TestOutPutWordSkips50Times {
	public static void main(String[] args) {
		String world = "Hello World!";
		int i = 0;
		do {
			i++;
			if (i == 50) {
				continue;
			}
			System.out.print(world);
			System.out.println("---" + i);
		} while (i < 100);
	}

}
