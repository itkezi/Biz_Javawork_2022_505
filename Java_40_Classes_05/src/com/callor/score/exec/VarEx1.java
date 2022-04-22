package com.callor.score.exec;

import com.callor.score.domain.StudentVO;
import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.ScoreServiceImplV1;

public class VarEx1 {
	
	public static void main(String[] args) {
		
		// primitive(기본) type keyword
		// primitive type 변수 선언
		int num1 = 100 ;
		float num2 = 100.3f;
		boolean bYes = true;
		
		// 첫글자가 대문자 = class
		// class type keyword
		// class type 변수 선언 = (주소)참조형 변수 선언
		Integer intNum1 = 100;
		Float fNum2 = 100.3f;
		Boolean bYes1 = true;
		
		String str = "korea";
		
		// StudentVO형 타입(StudentVO클래스)의 변수
		StudentVO stVO = new StudentVO();
		
		// StudentVO배열형 타입의 변수
		StudentVO[] stList = new StudentVO[10];
		
		//interface지만 ScoreService class 변수(또는 ScoreService형 타입)라 부름
		ScoreService scService = new ScoreServiceImplV1(); 
	}

}
