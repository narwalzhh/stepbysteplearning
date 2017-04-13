package com.rookiego.quiz.day4;

import java.util.Arrays;

public class TestMatrixTranspose {
	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int m;
				m = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = m;
			}
		}
		System.out.println("二维数组转置为：");
		for (int i = 0; i < 4; i++) {
			System.out.println(Arrays.toString(mat[i]));
		}

	}

}
