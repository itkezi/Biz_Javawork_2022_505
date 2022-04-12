package com.callor.arrays.exec;

// - 정수형 배열 100개를 선언하고
// - Math.random()을 사용하여 1~ 100까지의 임의의 수를 생성하고 각각 요소에 저장
// - 배열의 각 요소에 저장된 수가 짝수인가 아닌가를 판별하여 출력하시오.

public class ExecV2 {

	public static void main(String[] args) {

		int[] intRan = new int[100];

		for (int index = 0; index < intRan.length; index++) {

			intRan[index] = (int) (Math.random() * 100) + 1;

			boolean ex = intRan[index] % 2 == 0;

			if (ex) {
				System.out.println(intRan[index] + "는 짝수이다");
			} else {
				System.out.println(intRan[index] + "는 짝수가 아니다");
			}

//			if (intRan[index] % 2 == 0) { 
//				System.out.println(intRan[index] + "는 짝수이다");
//			} else { 
//				System.out.println(intRan[index] + "는 짝수가 아니다");
//			}

		}
	}
}
