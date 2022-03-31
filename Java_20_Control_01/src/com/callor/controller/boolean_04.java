package com.callor.controller;

public class boolean_04 {

	public static void main(String[] args) {

		boolean bYes1 = true;
		boolean bYes2 = true;

		int intNum1 = 33;
		int intNum2 = 55;

		bYes1 = intNum1 == intNum2; // false
		bYes2 = intNum1 < intNum2; // true

		// || : boolean 데이터의 or 연산 (덧셈 연산)
		// && : boolean 데이터의 and 연산 (곱셈 연산)
		boolean bWhat = bYes1 || bYes2; // (이진수로 생각하여) 0 + 1 = 1 = true
		bWhat = bYes1 && bYes2; // (이진수로 생각하여) 0 * 1 = 0 false

		// (intNum1 == intNum2) OR (intNum1 < intNum2)
		if (bYes1 || bYes2) {
			System.out.printf("%d는 %d보다 작거나 같다\n", intNum1, intNum2);
		}
		
		bWhat = !(bYes1||bYes2);
		System.out.println(bWhat);
		
		// !(false And true)
		bWhat = !(bYes1 && bYes2);
		System.out.println(bWhat);
		
		
	}

}
