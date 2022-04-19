package com.callor.score.domain;

// VO클래스 : Value Object 클래스
// 객체지향 프로그래밍에서 가장 중요한 역할을 수행할 클래스
// 변수들의 묶음이고, **데이터를 한 개의 그룹으로** 묶어서 
// 정보처리에 사용할 용도로 선언하는 클래스

public class ScoreVO {

	// 인스턴스변수
	// class 영역에 선언된 변수
	// ScoreVO 클래스를 사용하여 객체를 선언하고 생성자를 호출하여
	// 인스턴스 화 할 때 깉이 선언 및 **초기화** 되는 변수
	public String stName;
	public int intKor;
	public int intEng;
	public int intMath;
	public int intSum;
	
} // end class
