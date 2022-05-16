package com.callor.app.exec;

public class Exec06 {

	// 배열에 10 ~ 100까지 정수를 저장하고, 소수를 찾아 출력하기
	public static void main(String[] args) {
		int[] nums = new int[100];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 91) + 10;
		}

		for (int j = 0; j < nums.length; j++) {
			int index = 0;
			for (index = 2; index < nums[j]; index++) {
				if (nums[j] % index == 0) {
					break;
				}
			}
			if (nums[j] <= index) {
				System.out.println(nums[j] + "는 소수");
			} else {
				System.out.println(nums[j] + "는 소수X");
			}
		}
	}

}
