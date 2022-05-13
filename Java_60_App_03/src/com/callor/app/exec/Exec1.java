package com.callor.app.exec;

public class Exec1 {
	
	// random()를 사용하여 1 ~ 100 까지 저장
	// 홀수 / 짝수 여부 판별
	// 모든 과정 10번 반복
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 100) + 1;
			if (num % 2 == 0) {
				System.out.printf("%3d = 짝수\n", num);
			} else {
				System.out.printf("%3d = 홀수\n", num);
			}
		}
	}
}
