package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {
//	생성자 패턴
//	클래스 영역(필드영역)에서 변수, 객체, 배열 등을 선언만 하고 private으로 접근제한을 한다.
//	객체와 배열은 final로 선언한다.
//	(java: 기본, spring: 임의) 생성자 method에서 선언된 변수를 초기화(생성, 사용할 준비)를 한다.
	
	// 만약 이 클래스를 상속할 수 있도록 하려면 변수를 protected로 변경해야 한다.
	protected final List<ScoreVO> scoreList;
	public ScoreServiceImplV1() {
		scoreList = new ArrayList<>();
	}

	@Override
	public void makeScore() {
		int kor = 0;
		int eng = 0;
		int math = 0;
		for(int i = 0; i < 10; i ++) {
			kor = (int)(Math.random() * 50) + 51;
			eng = (int)(Math.random() * 50) + 51;
			math = (int)(Math.random() * 50) + 51;
			ScoreVO scVO = new ScoreVO();
			scVO.setStNum(i + "");
			scVO.setIntKor(kor);
			scVO.setIntEng(eng);
			scVO.setIntMath(math);
			scoreList.add(scVO);
			System.out.println(scoreList.get(i));
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
