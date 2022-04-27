package com.callor.app.exec;

public class Exec1 {

	// 10개의 정수형 배열을 생성하고 1 ~ 100 까지의 임의 정수를 생성하여 각 배열의 요소에 저장하시오
	public static void main(String[] args) {
		

		int[] intNum = new int[10];
		
		for(int i= 0; i < intNum.length ; i++) {
			
			int num = (int)(Math.random()*100) +1;
			intNum[i] = num;
		}
		
		
		for(int i= 0; i < intNum.length ; i++) {
			System.out.println(intNum[i]); 
			
		}

		
		
	}

}
