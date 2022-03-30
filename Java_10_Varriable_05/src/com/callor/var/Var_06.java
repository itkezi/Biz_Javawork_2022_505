package com.callor.var;

public class Var_06 {

	public static void main(String[] args) {
		
		// 괄호가 우선순위가 되어 연산결과가 0이 나옴
		int intNum = (int)Math.random() * 1000;
		
		int intAge = (int)(Math.random() * 100) + 10;
	
		String strName = "홍길동";
		
		System.out.printf("%s의 나이는 %d이다", strName, intAge);
		
		
	
		
	}
	
}
