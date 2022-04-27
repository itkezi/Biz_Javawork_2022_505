package com.callor.app.exec;

public class Exec7 {

	public static void main(String[] args) {

		// 각 요소에 1 ~100 까지의 임의의 정수 저장 후 소수의 개수를 세어 출력
		int num = 100;
		int[] intNums = new int[num];
		int count = num;
		
		for (int i = 0; i < intNums.length; i++) {
			int nums = (int) (Math.random() * 100) + 2;
			intNums[i] = nums;
		}

		for (int i = 0; i < intNums.length; i++) {

			for (int a = 2 ; a < intNums[i] ; a++) {
				
				if ( intNums[i] % a == 0) {
					num--;
					break;
				}
			}
		
		}
		
		System.out.println(count);
		
		
	}
}
