package com.rookiego.quiz.day2;

public class outputtraingle {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (4-i); j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (2*i + 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
