package com.callor.app.exec.prime;

public class Exec7 {

	public static void main(String[] args) {

		// 각 요소에 1 ~100 까지의 임의의 정수 저장 후 소수의 개수를 세어 출력
		int[] intNums = new int[100];

		for (int i = 0; i < intNums.length; i++) {
			int nums = (int) (Math.random() * 100) + 2;
			intNums[i] = nums;
		}

		int count = 0;
		// 배열 전체 요소 개수만큼 반복하기
		for (int i = 0; i < intNums.length; i++) {
			
			// 배열의 i번째 요소에 저장된 수가 소수인가 판별
			int index = 0;
			for (index = 2; index < intNums[i]; index++) {
				if (intNums[i] % index == 0) {
					break;
				}
			}

			// 배열의 i번째 요소가 소수이면 count 증가
			// if(index >= intNums[i])
			if (!(index < intNums[i])) {
				count++;

			}

		}

		System.out.println("소수의 개수 : " + count);

	}
}
