package com.callor.var;

public class Var_04 {

	public static void main(String[] args) {

		int intNum1 = (int) (Math.random() * 100) + 1;
		int intNum2 = (int) (Math.random() * 100) + 1;

		boolean bCompare = true;

		bCompare = intNum1 > intNum2;

		// ctrl + shift + f : 자동정렬? 기능인 듯 ~!~!~!
		
		if (bCompare) {
			System.out.println(intNum1 + "은(는) " + intNum2 + "보다 크다");
		} else {
			System.out.println(intNum1 + "은(는) " + intNum2 + "보다 크지 않다"); 
			// 값이 같은 경우에도 false가 뜨기 때문에 '크지 않다'라고 표현
		}

		// 또는
		
		if (bCompare) {
			System.out.printf("%d은(는) %d보다 크다\n",intNum1, intNum2);
		} else {
			System.out.printf("%d은(는) %d보다 크지 않다\n",intNum1, intNum2);
		}

	}

}
