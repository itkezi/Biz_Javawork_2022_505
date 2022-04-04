package com.callor.controller;

public class Method_01 {

	public static void main(String[] args) {

		// num()를 호출하여(실행하고) return된 값을
		// intResult에 저장하기
		int intSum = num();

		System.out.println(intSum);

	}

	// int num() {} : 어떤 정수값을 return하겠다.
	public static int num() {

		// 임의 정수 2개를 만들고(변수에 저장하고)
		int num1 = (int) (Math.random() * 100) + 1;
		int num2 = (int) (Math.random() * 100) + 1;

		// 두 값을 덧셈하여 return
		return (num1 + num2);

	}
}
