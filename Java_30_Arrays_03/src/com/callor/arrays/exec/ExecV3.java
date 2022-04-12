package com.callor.arrays.exec;

public class ExecV3 {

	public static void main(String[] args) {

		int[] intRnd = new int[100];

		for (int i = 0; i < intRnd.length; i++) {
			intRnd[i] = (int) (Math.random() * 100) + 1;
		}

		int intEvenCount = 0;

		for (int i = 0; i < intRnd.length; i++) {
			boolean bEven = intRnd[i] % 2 == 0;

			if (bEven) {

				intEvenCount++;
			}

		}
		
		System.out.println("짝수의 개수 : " + intEvenCount);
	}

}
