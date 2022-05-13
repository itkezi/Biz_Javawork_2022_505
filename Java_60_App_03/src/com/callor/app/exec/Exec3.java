package com.callor.app.exec;

public class Exec3 {

	public static void main(String[] args) {

		int[] nums = new int[10];
		int intSum = 0;
		float fAvg = 0f;
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 100) + 1;
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%2d번 :%d\n",i+1, nums[i]);
		}
		for (int i = 0; i < nums.length; i++) {
			intSum += nums[i];
		}
		
		fAvg = (float)intSum / nums.length ;
		System.out.printf("합계 : %d\n", intSum);
		System.out.printf("평균 : %.2f\n", fAvg);
	}
}
