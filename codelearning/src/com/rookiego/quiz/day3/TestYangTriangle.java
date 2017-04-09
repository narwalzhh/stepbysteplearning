package com.rookiego.quiz.day3;

import java.util.Arrays;

public class TestYangTriangle {
	public static void main(String[] args) {
		int[][] number = new int[10][];
		for (int i = 0; i < 10; i++) {
			number[i] = new int[i + 1];
			number[i][0] = 1;
			number[i][i] = 1;
		}
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j != i; j++) {
				number[i][j] = number[i - 1][j - 1] + number[i - 1][j];
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int a = 0; a<9-i;a++) {
				System.out.print(' ');
			}
			for (int j = 0; j != i; j++) {
				

				System.out.print(number[i][j] + " ");
			}
			System.out.println();

		}
	}
}
//如何输出居中还没想到，输出方式不尽人意,输出也有误，回来就改