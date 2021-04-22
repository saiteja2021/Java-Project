package com.sai.javainterviewprograms;

public class ReverseWords {

	public static String reverse(String str) {
		String s2 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			s2 = s2 + str.charAt(i);
		}
		return s2;
	}

	public static void main(String[] args) {
		String s = "This is saiteja from hyderabad";
		String s2[] = s.split(" ");
		String str2 = "";
		for (String s3 : s2) {
			str2 = str2 + reverse(s3) + " ";
		}

		System.out.println(str2);
	}

}
