package com.sai.javainterviewprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class RepeatedCharacterCountInAString {

	public static void main(String[] args) {
		String s = "saitejae";
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (m.containsKey(c)) {
				m.put(c, m.get(c) + 1);
			} else {
				m.put(c, 1);

			}
		}
		System.out.println(m);

	}

}
