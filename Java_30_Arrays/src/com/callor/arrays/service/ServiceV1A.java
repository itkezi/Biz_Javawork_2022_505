package com.callor.arrays.service;

public class ServiceV1A {

	// private 으로 선언된 makeScore()는 ServiceV1A 클래스 블럭 ({}) 안에서만 접근(호출) 가능
	// local method (지역 메소드)라 불림
	private int makeScore() {
		
		return (int)(Math.random()*100)+1;
	} // end makeScore()
	
	// public으로 선언된 scoreKorSum()은 프로젝트의 어디에서 클래스의 인스턴스를 생성하고
	//    인스턴스를 통하여 접근(호출)할 수 있다  (static이 없음)
	public int scoreKorSum() {

		// V1에서 Math.random()를 사용하여 점수를 생성하는 코드를 makeScore()로 이전하고,
		// 점수 생성이 필요한 경우 makeScore()를 호출하여 결과를 사용한다
		int intKor1 = makeScore();
		int intKor2 = makeScore();
		int intKor3 = makeScore();
		int intKor4 = makeScore();
		int intKor5 = makeScore();

		int intKorSum = intKor1;
		intKorSum += intKor2;
		intKorSum += intKor3;
		intKorSum += intKor4;
		intKorSum += intKor5;

		return intKorSum;

	} // end scoreKorSum()

} // end class
