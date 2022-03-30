package com.callor.var;

public class Var_03 {
	public static void main(String[] args) {
		
		int intNum1 = 0;
		int intNum2 = 0;
		int intSum = 0;
		
		// intNum1 변수는 int type 이기 때문에 2의 32승 -1까지 값만 저장 가능
		// 천 단위마다 콤마, 대신 언더바_ 사용
		intNum1 = 999_999_999;
	
		long longNum1 = 0;
		
		// int 형 변수는 큰 값을 저장할 수 없다.
		// 만약 큰 정수값을 저장하려고 하면 long type으로 변수를 선언해야 한다. (2의 승까지 가능)
		// (마지막에 L 꼭 붙여주기)
		longNum1 = 999_999_999_999_999_999L;
		
		
		
		
	}
}
