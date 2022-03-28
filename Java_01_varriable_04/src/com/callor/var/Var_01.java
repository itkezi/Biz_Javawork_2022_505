package com.callor.var;

public class Var_01 {

	public static void main(String[] args) {
		
		// 변수를 선언하고 clear(0을 저장, 대입)
		int intNum1 = 0;
		int intNum2 = 0;
		
		
		//변수에 값 저장하기
		intNum1 = 33;
		intNum2 = 55;

		int intEx1 = intNum1 + intNum2 ;
		int intEx2 = intNum1 - intNum2 ;
		int intEx3 = intNum1 * intNum2 ;
		int intEx4 = intNum1 / intNum2 ;
		
		System.out.printf( "%d + %d = %d\n" , intNum1 , intNum2 , intEx1);
		System.out.printf( "%d - %d = %d\n" , intNum1 , intNum2 , intEx2);
		System.out.printf( "%d × %d = %d\n" , intNum1 , intNum2 , intEx3);
		System.out.printf( "%d ÷ %d = %d\n" , intNum1 , intNum2 , intEx4);
	}

}
