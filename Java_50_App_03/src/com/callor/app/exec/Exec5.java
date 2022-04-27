package com.callor.app.exec;

public class Exec5 {

	public static void main(String[] args) {

		// num에 담겨있는 값이 소수인가
		int num = (int) (Math.random() * 100) + 1;


		if (num == 1) {
			System.out.printf("나온 값이 %d입니다.\n", num);
			return;
		}

		int i = 0;

		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				break;
			} 
		} 
		

		if (i < num)
			System.out.print(num + "은(는) 소수가 아닙니다.");
		else
			System.out.print(num + "은(는) 소수입니다.");

	}
}
