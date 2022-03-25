package com.callor.var;

public class Var_06 {

	public static void main(String[] args) {

		int num1 = 0;
		
		// 변수++ 또는 ++변수는 단독으로 사용될 때는 연산 결과가 똑같다. ( num1++ = ++num1)
		// 그러나 다른 명령문 안에서 사용될 때는 성질이 매우 달라서 많이 주의를 해야한다.
		// ++변수 : 가장 먼저 실행되는 명령이 된다. 
		// 변수++ : 모든 명령이 다 실행되고 다음줄 명령문으로 진행하기 직전에 실행된다.
		System.out.println(++num1);
		System.out.println(num1++);
		
		System.out.println("=====");
		
		num1 = 0;
		num1 = ++num1 * 3;
		System.out.println(num1);
		
		num1 =0;
		num1 = num1++ *3;
		System.out.println(num1);
		
		// ++들은 sysout 줄단위로 출력되는 것이 아니라, 연산단위로 출력된다
		//  : A=2, B=1 일때
		//  : A*B, A*++B, A*B 는 2, 4, 4 로 출력된다.
		//  : A*B, A*B++, A*B 는 2, 2, 4 로 출력된다.
		int A = 2; int B = 1;
		System.out.printf("%d, %d, %d\n", A*B, A*++B, A*B);
		A = 2; B = 1; // (초기화해주기)
		System.out.printf("%d, %d, %d\n", A*B, A*B++, A*B);
		
	}

}
