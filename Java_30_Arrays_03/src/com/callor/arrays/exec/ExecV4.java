package com.callor.arrays.exec;

// - 정수형 배열 100개를 선언하고
// - Math.random()를 사용하여 1 ~ 100까지의 임의의 수를 생성하고 각각 요소에 저장
// - 배열의 각 요소에 저장된 수 중에서 "짝수 만을 모두 더하여" 결과를 출력하시오

public class ExecV4 {

	public static void main(String[] args) {

		int[] intRnd = new int[100];

		for (int i = 0; i < intRnd.length; i++) {
			intRnd[i] = (int) (Math.random() * 100) + 1;
		}

		int intEvenSum = 0;

		for (int i = 0; i < intRnd.length; i++) {
			boolean bEven = intRnd[i] % 2 == 0;

			if (bEven) {
				intEvenSum += intRnd[i];
			}
		}
		System.out.println("짝수들의 총합은 " + intEvenSum + "입니다.");
	}
}
