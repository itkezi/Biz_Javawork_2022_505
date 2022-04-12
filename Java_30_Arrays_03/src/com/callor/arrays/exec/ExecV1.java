package com.callor.arrays.exec;

// Math.random()를 사용하여 1 ~100까지 임의의 수를 생성하고 생성한 수가 짝수인가 홀수인가 판별하는 코드를 작성

public class ExecV1 {
	
	public static void main(String[] args) {
		
		int intRan = (int)(Math.random() *100) +1 ;
		
		if (intRan % 2 == 0) { 
			
			System.out.println(intRan + "은 짝수이다");
					
			} else {System.out.println(intRan + "은 짝수가 아니다");};
		
		
			
	}

}
