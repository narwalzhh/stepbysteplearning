package com.rookiego.quiz.day3;

public class TestLeapYear {
	public static void main(String[] args) {
		int[] years = { 1996, 2000, 2004, 2008, 2016 };
		for (int year : years) {
			int a = year % 4;
			int b = year % 100;
			int c = year % 400;
			if (a == 0 && b != 0) {
				System.out.println("闰年：" + (int) year);
			} else if (b == 0 && c == 0) {
				System.out.println("闰年：" + (int) year);
			}
		}
	}
}
