package com.rookiego.quiz.day1;

public class TestOutPutWordEndAt50Times {
	public static void main(String[] args) {
		String world = "Hello World!";
		for (int i = 1; i <= 100; i++) {
			if (i == 50) {
				System.out.println("当前循环次数为" + i);
				break;
			}
			System.out.println(world);
		}
	}

}
