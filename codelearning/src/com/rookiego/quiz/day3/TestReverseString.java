package com.rookiego.quiz.day3;

public class TestReverseString {
	public static void main(String[] args) {
		String loveJava = "人生苦短，我有病，我要学java！";
		String str = "";
		for (int i = 1; i <= loveJava.length(); i++) {
			char a = loveJava.charAt(loveJava.length() - i);
			str += String.valueOf(a);
		}
		System.out.println(str);

	}

}
