package com.callor.var;

public class Var_04 {
	
	public static void main(String[] args) {
	
		int intSum = 0;
		
		// 할당 명령문( 변수에 값을 할당, 저장, 대입하는 명령문)에 연산식이 따라오면
		// 1. EQ(=) 의 오른쪽 연산을 항상 먼저 실행한다.
		// 2. 그리고 실행한 결과를 왼쪽의 변수에 저장한다.
		intSum = 55 + 33 ;
		System.out.println(intSum);
	
		int intNum1 = 55;
		int intNum2 = 77;

		// 1. intNum1 변수의 값을 읽어서 CPU(ACC)에서 가져오기
		// 2. intNum2 변수의 값을 읽어서 CPU에 가져오기
		// 3. 두 값의  덧셈하여 결과는 변수 intSum 에 저장하기
		intSum = intNum1 + intNum2;
		System.out.println(intNum1);
		System.out.println(intNum2);
		System.out.println(intSum);

		// println에서 ln은 New line -> 그래서 없으면 줄바꿈 X
		System.out.print( intNum1 );
		System.out.print(" + ");
		System.out.print( intNum2 );
		System.out.print(" = ");
		System.out.println( intSum );
	
		// 이렇게 하는 방법도 있다.
		System.out.println(intNum1 + "+" + intNum2 + "=" + intSum);
	
		intNum1 = 101;
		intNum2 = 202;

		// printf의 f는 form
		// form에는 변수도, 값도 입력 가능
		// \n : 줄바꿈
		
		System.out.printf("%d + %d = %d\n", intNum1, intNum2, intNum1 * intNum2);
		System.out.printf("%d * %d = %d\n", intNum1, intNum2, intNum1 * intNum2);
		System.out.printf("%d - %d = %d\n", intNum1, intNum2, intNum1 * intNum2);
		System.out.printf("%d / %d = %d\n", intNum1, intNum2, intNum1 * intNum2);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
