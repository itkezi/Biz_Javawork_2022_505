package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {

	// 생성자 패턴
	// 클래스 영역(필드영역)에서 변수, 객체 배열 등을 선언만 하고
	// private로 접근제한을 하고
	// 객페와 배열은 final로 선언하고
	// (java에서는 기본, Spring 임의) 생성자 method에서
	// 선언된 변수를 초기화(생성, 사용할 준비)를 한다
	//
	// 이 클래스를 상속할 수 있도록 하려면 변수를 protected로 변경
	protected final List<ScoreVO> scoreList;
	
	public ScoreServiceImplV1() {
		scoreList = new ArrayList<>();
	}

	@Override
	public void makeScore() {

		for (int i = 0 ; i < 10 ; i++) {
			int Kor = (int)(Math.random()* 50) +51;
			int Math = (int)(Math.random()* 50) +51;
			int Eng = (int)(Math.random()* 50) +51;
			
			ScoreVO sVO = new ScoreVO();
			sVO.setIntKor(Kor);
			
			
		}
		
	}

	@Override
	public void printScore() {

	}

	@Override
	public void sumScore() {

	}

	@Override
	public void avgScore() {

	}

}
