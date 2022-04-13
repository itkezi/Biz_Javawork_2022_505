package com.callor.arrays.exec;

// - 정수형 배열 100개를 선언하고
// - Math.random()를 사용하여 1~100까지 임의의 수를 생성하고 각각 요소에 저잘
// - 배열의 각 요소에 저장된 수 중에서 "짝수의 리스트"를 예제처럼 출력하시오

public class ExecV6 {

	public static void main(String[] args) {

		int[] intNum = new int[100];
		
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = (int) (Math.random() * 100) + 1;
		} // for (선언)
		
		int intCount = 0;
		
		for (int i = 0; i < intNum.length; i++) {
			
			if (intNum[i] % 2 == 0) {
				System.out.print(intNum[i] + ",\t");
				intCount++;
				
				if (intCount % 5 == 0) {
					System.out.println();
				} // if (줄바꿈)
			} // if (출력)
		} //for 
	} // main
} //class

