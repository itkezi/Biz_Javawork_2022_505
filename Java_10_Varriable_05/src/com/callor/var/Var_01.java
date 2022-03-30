package com.callor.var;

public class Var_01 {

	public static void main(String[] args) {
		
		// 실수(double) 형으로 선언할 경우 0보다 0.0처럼 명확히 해주는 것이 좋다
		double douNum1 = 0.0;
		double douNum2 = 0.0;
		
		douNum1 = Math.random() *1000;
		douNum2 = Math.random() *1000;
		
		double douAdd = douNum1 + douNum2;
		double douSub = douNum1 - douNum2;
		double douMul = douNum1 * douNum2;
		double douDiv = douNum1 / douNum2;
	
		System.out.println(douNum1);
		System.out.println(douNum2);
		System.out.println(douAdd);
		System.out.println(douSub);
		System.out.println(douMul);
		System.out.println(douDiv);
	
	}
}
