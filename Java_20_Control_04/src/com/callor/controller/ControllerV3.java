package com.callor.controller;

public class ControllerV3 {

	public static void main(String[] args) {

		// if(비교연산식) {}
		// for(;;) {}

		int intNum = 1;
		for (;;) {
			System.out.printf("%d x %d = %d\n", 3, intNum, 3 * intNum++);

			// for() 반복문 코드 내부에 조건 연산을 추가하여 반복 횟수를 제한하기
			// break : for() 무한 반복문 중단하기
			if (intNum > 9) {
				System.out.println("10 넘어감");
				// for(;;) 반복문 내에서 break 명령이 실행되면 즉시 반복을 멈춘다.
				break;

			} // end if

		} // end for

	} // end main

} // end class
