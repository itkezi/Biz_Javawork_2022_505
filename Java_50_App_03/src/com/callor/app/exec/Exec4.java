package com.callor.app.exec;

public class Exec4 {

	public static void main(String[] args) {

		// num에 담겨있는 값이 소수인가
		int num = (int) (Math.random() * 100) + 1;
		int flag = 0;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			System.out.print(num + "은(는) 소수입니다.");
		else
			System.out.print(num + "은(는) 소수가 아닙니다.");

	}

}
