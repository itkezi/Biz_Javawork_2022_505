package com.callor.score.service;

import com.callor.score.domain.ScoreV2VO;
import com.callor.score.utils.Line;

public class ScoreServiceV1 {

	private ScoreV2VO[] scores;

	public ScoreServiceV1() {
		this(10);
	}

	public ScoreServiceV1(int length) {

		scores = new ScoreV2VO[length];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreV2VO();
		}
	}

	// 학생 이름 리스트를 배열로 받아서 초기화 하기
	public ScoreServiceV1(String[] stNames) {

		int length = stNames.length;
		scores = new ScoreV2VO[length];

		for (int i = 0; i < length; i++) {
			scores[i] = new ScoreV2VO();
			scores[i].setStName(stNames[i]);
		}
	}

	public void makeScore() {

		for (int i = 0; i < scores.length; i++) {

			int intKor = (int) (Math.random() * 50) + 51;
			int intEng = (int) (Math.random() * 50) + 51;
			int intMath = (int) (Math.random() * 50) + 51;

			scores[i].setIntKor(intKor);
			scores[i].setIntEng(intEng);
			scores[i].setIntMath(intMath);
		}
	}

	public void printScore() {
		
		int intKorSum = 0;
		int intEngSum = 0;
		int intMathSum = 0;
		int intSubSum = 0;
		float fAvgSum = 0.0f;
		
		System.out.println(Line.dLine(50));
		System.out.println("빛나고교 성적표 v1");
		System.out.println(Line.sLine(50));
		System.out.println("이  름\t 국어\t 영어\t 수학\t 총점\t  평균\t");
		System.out.println(Line.sLine(50));
		
		for (int i = 0; i < scores.length; i++) {
			
			System.out.print(scores[i].getStName() + "\t");
			System.out.printf("%4s\t" ,scores[i].getIntKor());
			System.out.printf("%4s\t" ,scores[i].getIntEng());
			System.out.printf("%4s\t" ,scores[i].getIntMath());
			System.out.printf("%4s\t" ,scores[i].getIntSum());
			System.out.printf("%6.2f\n",scores[i].getfAvg());
			
			intKorSum += scores[i].getIntKor();
			intEngSum += scores[i].getIntEng();
			intMathSum += scores[i].getIntMath();
			intSubSum += scores[i].getIntSum();
			fAvgSum += scores[i].getfAvg();
		}
		
		System.out.println(Line.sLine(50));
		System.out.print("합  계" + "\t");
		System.out.printf("%4d\t" ,intKorSum);
		System.out.printf("%4d\t" ,intEngSum);
		System.out.printf("%4d\t" ,intMathSum);
		System.out.printf("%4d\t" ,intSubSum);
		System.out.printf("%6.2f\n",fAvgSum);
		System.out.println(Line.dLine(50));
		
	}

}
