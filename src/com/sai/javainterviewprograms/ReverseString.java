package com.sai.javainterviewprograms;

public class ReverseString {

	public static void main(String[] args) {
		String s = "javaseleniu";
		String s2 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s2 = s2 + s.charAt(i);
		}
		System.out.println(s2);
		//String
	}

}
