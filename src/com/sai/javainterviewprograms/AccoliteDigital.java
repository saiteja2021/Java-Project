package com.sai.javainterviewprograms;

public class AccoliteDigital {

	public static void main(String[] args) {
		String s = "hai this is 123hyderabad456";
		s = s.replaceAll(" ", "");
		s = s.replaceAll("[a-z]", "");
		s=s.replace('1', '2');
		System.out.println(s);
	}

}
