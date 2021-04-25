package com.sai.javainterviewprograms;

import java.util.HashMap;

public class RepeatedNumbersInArray {
	public static void main(String[] args) {
		int arr[]  = {1,2,2,3,4,5,6,6};
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length;i++) {
			int j=arr[i];
			if (m.containsKey(j)) {
				m.put(j, m.get(j) + 1);
			} else {
				m.put(j, 1);

			}
		}
		System.out.println(m);

	}
}
