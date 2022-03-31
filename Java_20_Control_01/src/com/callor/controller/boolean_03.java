package com.callor.controller;

public class boolean_03 {

	public static void main(String[] args) {

		boolean bYes = true;
		boolean bWhat = bYes;

		// bYes에 저장된 값이 false가 물어보는 연산이 실행되고 그 결과가 bWhat에 저장된다
		// 결과는 false
		bWhat = bYes == false;

		// bYes에 저장된 갑시 true가 아니냐? 라고 물어보는 연산
		// 결과는 당연히 false
		bWhat = bYes != true;

		// ! : Not 연산기호
		// boolean형 데이터를 반전 시키는 연산
		// true가 담겨있으면 false, false가 담겨있으면 true
		// bWhat에는 false가 담김
		bWhat = !bYes;
		// !(Not 연산자)를 이용하려 변수 값을 true, false를 반복하도록 하는 명령문
		bWhat = !bWhat;
		bWhat = !bWhat;
		
	}

}
