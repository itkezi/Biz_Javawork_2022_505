package com.callor.app.exec;

public class Exec02 {

	public static void main(String[] args) {

		int[] nums = new int[10];
		int count = 0;
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 100) + 1;
			System.out.println(nums[i]);
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				count++;
				sum += nums[i];
			}
		}
		System.out.println("짝수의 개수는 : " + count);
		System.out.println("짝수의 합은 : " + sum);
	}

}
