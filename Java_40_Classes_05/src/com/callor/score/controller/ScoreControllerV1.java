package com.callor.score.controller;

import com.callor.score.domain.StudentVO;
import com.callor.score.service.impl.ScoreServiceImplV1;
import com.callor.score.service.impl.StudentServiceImplV1;

public class ScoreControllerV1 {

	public static void main(String[] args) {

		String stFile = "student.txt";
		int stLength = 50;
		
		// (stFile, stLengh) : 기본 생성자가 없으니 강제로 argument로 전달하도록 코드를 짬
		StudentServiceImplV1 stService1 = new StudentServiceImplV1(stFile, stLength);
		
		stService1.loadStudent();
		StudentVO[] stList = stService1.getStudents();
		StudentVO stNo1 = stService1.findByNum("0001");
		

		// 다른 클래스로 실험하려면 두개의 요소를 수정해야함 = ScoreServiceImplV1 2개
		ScoreServiceImplV1 scServiceV1 = new ScoreServiceImplV1();

		scServiceV1.makeScore();
		int intSum = scServiceV1.retSum();
		float fAvg = scServiceV1.retAvg();
		scServiceV1.printScore();

	}

}
