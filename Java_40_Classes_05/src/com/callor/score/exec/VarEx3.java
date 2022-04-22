package com.callor.score.exec;

import java.util.List;

import com.callor.score.domain.StudentVO;

public class VarEx3 {
	
	public static void main(String[] args) {
		
		// primitive 변수 타입
		int num1;
		float num2;
		double num3;
		long num4;
		
		boolean bYes;
		char char1;
		
		// 기본형 변수들을 감싸고 있는 class
		// wrapper 클래스 (primitive 변수와 형제)
		Integer num11;;
		Float num22;
		Double num33;
		Long num44;
		
		Boolean bYes1;
		Character char11;
		
		// <> : generic(제네릭)
		// Object : java의 시조 class -> 제네릭에 선언할 수는 있지만 구동 시 메모리, 유효성 관리등에 어려움
		List<Object> objlist;
		
		// 그래서 보통 제네릭에는 보통 보관할 type이 들어감
		List<Integer> intlist;
		
		// Integer type만 add할 수 있는 intList에 Float type의 값을 추가하려고 하니 오류가 발생한다(데이터의 유효성 검사로 인함)
		// 유효성 검사를 사전에 함으로써 무결성을 유지
		// intList.add(30.0f);
		
		// stList에는 StudentVO type의 데이터만 추가할 수 있다. (다른 type은 오류)
		// 이러한 기능을 사용하지 않으면 stList에 저장된 데이터가 유효한지 잘못되었는지 항상 걱정하면서 코딩을 해야할 것이다
		// 사전에 <>(제네릭)을 선언함으로써 개발자는 데이터에 대한 유효성 검사를 걱정하지 않아도 된다
		// 즉 stList에 담긴 학생 정보들은 "무결성"을 유지한다
		List<StudentVO> stList;
	}

}
