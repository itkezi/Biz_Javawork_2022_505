package com.callor.controller.op;

public class Operator_03 {

	public static void main(String[] args) {

		int intNum1 = (int) (Math.random() * 100) + 1;

		// SCE 코드
		// 만약 random으로 생성된 값이 60이상이면 "합격하였음"이라고 출력하고,
		// 그렇지 않으면 intNum1에 60을 세팅하고 "합격하였음"을 출력한 후 다음으로 진행
		if (intNum1 >= 60 || (intNum1 = 60) >= 60) {
			System.out.println("합격하였음");

		}
	}

}
