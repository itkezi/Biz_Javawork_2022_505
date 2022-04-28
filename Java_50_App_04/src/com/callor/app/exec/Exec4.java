package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec4 {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			nums.add((int) (Math.random() * 100) + 1);
		}

		int lastIndex = 0;
		int size = nums.size();

		for (int i = 0; i < size; i++) {
			int num = nums.get(i);
			if (num >= 55) {
				lastIndex = i;
			}
		}

		System.out.printf("%d번째 값 : %d\n", lastIndex, nums.get(lastIndex));

		for (int i = size - 1; i > -1; i--) {
			if (nums.get(i) >= 55) {
				System.out.println(i + "번째 값 : " + nums.get(i));
				break;
			}
		}

	}

}
