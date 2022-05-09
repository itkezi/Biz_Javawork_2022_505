package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;

public class ScoreServiceImplV1A implements ScoreService {

	protected final Scanner scan;

	protected final List<ScoreVO> scList;

	public ScoreServiceImplV1A() {
		scList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}

	@Override
	public void inputScore() {

		while (true) {
			// 학생 이름 입력
			
			System.out.println("이름(종료 : QUIT) > ");
			String stName = scan.nextLine();
			// QUIT 입력되면 break;
			if(stName.equals("QUIT")) {
				break;
			}
			
			// 국어 입력
			System.out.println("국어 점수 > ");
			String strKor = scan.nextLine();
			int intKor = Integer.valueOf(strKor);
			
			// 영어 입력
			System.out.println("영어 점수 > ");
			String strEng = scan.nextLine();
			int intEng = Integer.valueOf(strEng);
			
			// 수학 입력
			System.out.println("수학 점수 > ");
			String strMath = scan.nextLine();
			int intMath = Integer.valueOf(strMath);
			
			// VO 생성
			ScoreVO vo = new ScoreVO();
			// vo에 Setting
			vo.setStName(stName);
			vo.setIntKor(intKor);
			
			// scList.add();
			scList.add(vo);

		}


	}

	@Override
	public void saveScore() {

	}

}
