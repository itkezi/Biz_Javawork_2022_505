package com.callor.score.exec;

public class VarEx2 {

	public static void main(String[] args) {

		int num1 = 100;

		// int type 변수 -(복사)> Integer type 변수 ( Integer가 int를 box로 감싸는 형태 : Integer가 기능이 더 많이 때문)
		// -> Boxing
		Integer intNum1 = num1;
		
		// Integer type 변수 -(복사)> int type 변수 ( Integer가 int를 감싼 box를 푼다)
		// -> UnBoxing
		num1 = intNum1;
	}

}
