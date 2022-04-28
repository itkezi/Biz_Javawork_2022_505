package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class GetValue {

	public static List<Integer> getList(int length) {

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			list.add((int) (Math.random() * 100) + 1);
		}
		return list;
	}

	public static int[] getArray(int length) {

		int[] nums = new int[length];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 100) + 1;
		}
		return nums;
	}

}
