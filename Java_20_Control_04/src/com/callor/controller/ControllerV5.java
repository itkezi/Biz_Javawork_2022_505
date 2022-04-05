package com.callor.controller;

public class ControllerV5 {

	public static void main(String[] args) {

		// if(비교연산식) {}
		// for(;;) {}
		//
		// for(;??;) 반복문의 두 번째 명령문은 비교문이 들어간다.
		// 이때부터 for() 반복문은 두 번째 명령문의 결과가 true일때만 {}의 코드를 실행한다.
		int intNum = 1;
		for (; intNum < 10 ; intNum ++) {
			System.out.printf("%d x %d = %d\n", 3, intNum, 3 * intNum);

		} // end for

	} // end main

} // end class
