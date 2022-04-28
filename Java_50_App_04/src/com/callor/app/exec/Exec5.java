package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec5 {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			nums.add((int) (Math.random() * 100) + 1);
		}
		
		int size = nums.size();
		int max = 0;
		int index = 0;
		
		for (int i = 0 ; i <size ; i++) {
			if (nums.get(i) > max) {
				max = nums.get(i);
				index = i;
			}
		}
		System.out.printf("%d에 담긴 %d이(가) 가장 크다", index, max);
	}
}
