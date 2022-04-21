package com.callor.score.controller;

import com.callor.score.domain.StudentVO;
import com.callor.score.service.ScoreService;
import com.callor.score.service.studentService;
import com.callor.score.service.impl.ScoreServiceImplV1;
import com.callor.score.service.impl.StudentServiceImplV1;

public class ScoreControllerV2 {
	
	public static void main(String[] args) {
		
		String stFile = "src/com/callor/score/data/student.txt";
		int stLength = 50;
		studentService stService = new StudentServiceImplV1(stFile, stLength);
		stService.loadStudent();
		StudentVO[] stList = stService.getStudents();
		StudentVO stNo1 = stService.findByNum("0001");
		
		
		
		// ScoreServiceImplV1 클래스를 사용하여 객체를 생성하고 method를 호출하여 기능을 수행하려고 한다
		//
		// 1. 보통의 경우 
		//   : class 객체 = class() => class 교체 시 수정 2개
		// 
		// 2. 인터페이스를 상속받아 선언한 클래스일 경우를 인터페이스를 객체로 선언하고
		//    실제 사용할 클래스의 생성자를 호출하여 인스턴스를 생성한다.
		//   : interface 객체 = new classImpl() => class 교체 시 수정 1개
		// 
		// 클래스의 다형성에도 부합하는 성질
		
		// 다른 클래스 실험하려면 하나만 수정하면 됨 = ScoreServiceImplV1 1개
		ScoreService scService = new ScoreServiceImplV1();
		scService.makeScore();
		scService.printScore();
	}

}
