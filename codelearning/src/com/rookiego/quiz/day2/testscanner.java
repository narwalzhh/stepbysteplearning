package com.rookiego.quiz.day2;

import java.util.Scanner;

public class testscanner {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("请输入字符：");
		while (input.hasNext()) {
			System.out.println("您输入的字符为：" + input.next());
		}
	}
}
