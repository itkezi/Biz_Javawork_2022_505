package com.callor.controller.op;

public class Operator_04 {

	public static void main(String[] args) {

		int intNum1 = 100;

		// intNum1의 값의 부호를 음수로 하여 intNum2에 대입하라
		int intNum2 = -intNum1;

		intNum1 = 100;
		intNum2 = intNum1 * (-1);

		System.out.println(intNum1);
		System.out.println(intNum2);

		// bit 연산자
		// ^는 보통 제곱으로 사용되지만 java에서는 다르다
		// intNum1을 이진수로, 정수2를 이진수로 변환한 후 각 bit를 OR 연산
		intNum2 = intNum1 ^ 2;
		intNum2 = intNum1 | 2;

		// 각 값을 이진수로 변환 후 각 bit를 AND 연산
		intNum2 = intNum1 & 2;

		// 연산을 제곱하는 방법
		intNum2 = intNum1 * intNum1; // 제좁
		intNum2 = intNum1 * intNum1 * intNum1; // 세제곱

	}
}
