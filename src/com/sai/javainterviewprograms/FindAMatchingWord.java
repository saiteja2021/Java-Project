package com.sai.javainterviewprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAMatchingWord {

	public static void main(String[] args) {
		String s = "saitejasaitejasaiteja";
		Pattern p = Pattern.compile("sai");
		Matcher m = p.matcher(s);
		int count = 0;
		while (m.find()) {
			System.out.println(m.start());
			
			
			count++;
		}
		System.out.println(count);
	}

}
