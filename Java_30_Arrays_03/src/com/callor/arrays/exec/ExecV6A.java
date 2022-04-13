package com.callor.arrays.exec;

public class ExecV6A {

	public static void main(String[] args) {

		int[] intNums = new int[100];

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = (int) (Math.random() * 100) + 1;
		}

		// 짝수를 5번 출력하고 Enter를 출력하여 줄바꿈하기
		// i를 사용하여 횟수흫 구분하면 홀수일 때, 짝수일 때 상관없이
		// i 변수값은 변화를 하기 때문에 문제가 발생한다.
		//
		// 짝수를 출력할 때마다 출력한 횟수를 저장할 변수가 필요하다
		// 별도로 짝수를 출력할 때 마다 출력한 횟수를 저장할 변수를
		// for() 명령문 이전에 선언을 해 주어야 한다

		int intCount = 0;
		for (int i = 0; i < intNums.length; i++) {
			boolean bEven = intNums[i] % 2 == 0;

			if (bEven) {
				System.out.printf("%d\t", intNums[i]);
				intCount++;
				
				// 다섯 개 마다 줄바꿈
				if (intCount % 5 == 0) {
					// 줄바꿈만 출력하는 것이기 때문에 Count가 안뜨는 것
					System.out.println();
				}
					;

			}
		}
	}

}
