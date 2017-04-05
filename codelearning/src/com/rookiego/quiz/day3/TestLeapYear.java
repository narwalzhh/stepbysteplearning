package com.rookiego.quiz.day3;

public class TestLeapYear {
	public static void main(String[] args) {
		double[] years = { 1996, 2000, 2004, 2008, 2016};
		for (double year : years) {
			double a = year % 4.0;
			double b = year % 100.0;
			if (a == 0 && b != 0 ) {
				System.out.println("闰年：" + (int) year);
			}
		}
	}

}
