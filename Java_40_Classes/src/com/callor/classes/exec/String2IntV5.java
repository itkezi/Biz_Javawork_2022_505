package com.callor.classes.exec;

import java.util.Scanner;

public class String2IntV5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("정수 입력 > ");
		int intNum = 0;
		String strNum = scan.nextLine();
		if (strNum.equals("")) {
			System.out.println("숫자만 입력해주세요");
		} else {
			intNum = Integer.valueOf(strNum);
		}

		// int intNum = scan.nexLine();

		System.out.println("문자열 입력 > ");
		String strValue = scan.nextLine();

		System.out.println("입력된 정수 : " + intNum);
		System.out.println("입력된 문자열 : " + strValue);
	}

}
