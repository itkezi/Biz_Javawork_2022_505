package com.callor.classes.exec;

import java.util.Scanner;

public class String2intV3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요 >> ");
		String strNum = scan.nextLine();
		int intNum = 0;
		try {
			intNum = Integer.valueOf(strNum);
			boolean bEven = intNum % 2 == 0;
			if (bEven) {
				System.out.printf("정수 %d는 짝수", intNum);
			} else {
				System.out.printf("정수 %d는 짝수가 아님\n", intNum);
			}
		} catch (Exception e) {
			System.out.println("입력한 문자열을 숫자로 변경할 수 없음");
		}

	}
}
