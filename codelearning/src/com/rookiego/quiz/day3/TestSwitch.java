package com.rookiego.quiz.day3;

import java.util.Scanner;

public class TestSwitch {
	public static void main(String[] args) {
		System.out.println("请输入月份数：");
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {

			switch (input.nextInt()) {
			case 12:
			case 1:
			case 2:
				System.out.println("该月份为冬季");
				break;
			case 3:
			case 5:
			case 4:
				System.out.println("该月份为春季");
				break;
			case 6:
			case 8:
			case 7:
				System.out.println("该月份为夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("该月份为秋季");
				break;
			}
		}
	}

}
