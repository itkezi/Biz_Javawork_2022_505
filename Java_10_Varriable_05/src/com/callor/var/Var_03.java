package com.callor.var;

public class Var_03 {

	public static void main(String[] args) {
		
		double doNum1 = 0;
		double doNum2 = 0;
		
		doNum1 = Math.random();
		
		//웬만하면 명령문 다음에 숫자가 오는 것이 순서가 깔끔하다.
		doNum2 = Math.random() * 1000 + 1;
		
		// Math.random()이 실행된 결과가 담긴 doNum1 값에 1000을 곱하여 다시 doNum에 담아라
		// doNum1 = doNum1 * 1000;과 같다.
		//  doNum1 : 0.000 ~ 999.999 범위의 실수가 저장
		doNum1*= 1000;
		
		// doNum1 에 담긴 값에 1을 더하여 다시 doNum1에 저장
		// doNum1 : 1.000 ~ 1000.999 범위의 실수가 저장
		doNum1++; 

		// 정수값으로 변환
		// intNum1 : 1 ~ 1000 범위의 정수가 저장
		int intNum1 = (int)doNum1;
		int intNum2 = (int)doNum2;
		
		System.out.println(intNum1);
		System.out.println(intNum2);
		
		System.out.println("------------");

		System.out.println(intNum1 + intNum2);
		System.out.println(intNum1 - intNum2);
		System.out.println(intNum1 * intNum2);
		System.out.println(intNum1 / intNum2);		
		
	}
}

