package com.callor.score.service;
 
import com.callor.score.domain.ScoreV2VO;
import com.callor.score.utils.Line;
import com.callor.score.utils.Score;

public class ScoreServiceV3 extends ScoreServiceV1 {
	
	public ScoreServiceV3() {
		this(10);
	}

	public ScoreServiceV3(int length) {

		scores = new ScoreV2VO[length];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreV2VO();
		}
	}

	// 학생 이름 리스트를 배열로 받아서 초기화 하기
	public ScoreServiceV3(String[] stNames) {

		int length = stNames.length;
		scores = new ScoreV2VO[length];

		for (int i = 0; i < length; i++) {
			scores[i] = new ScoreV2VO();
			scores[i].setStName(stNames[i]);
		}
	}

	public void printScore() {
		
		float[] totals = new float[5];
		
		System.out.println(Line.dLine(50));
		System.out.println("빛나고교 성적표 v1");
		System.out.println(Line.sLine(50));
		System.out.println("이  름\t 국어\t 영어\t 수학\t 총점\t  평균\t");
		System.out.println(Line.sLine(50));
		
		for (int i = 0; i < scores.length; i++) {
			
			System.out.printf("%-3s\t",scores[i].getStName());
			System.out.printf("%4d\t" ,scores[i].getIntKor());
			System.out.printf("%4d\t" ,scores[i].getIntEng());
			System.out.printf("%4d\t" ,scores[i].getIntMath());
			System.out.printf("%6d\t  " ,scores[i].getIntSum());
			System.out.printf("%6.2f\n",scores[i].getfAvg());
			
			totals[Score.I_KOR] += scores[i].getIntKor();
			totals[Score.I_ENG] += scores[i].getIntEng();
			totals[Score.I_MATH] += scores[i].getIntMath();
			totals[Score.I_SUM] += scores[i].getIntSum();
			totals[Score.I_AVG] += scores[i].getfAvg();
			
//			scores[i].getfAvg() / scores.length
			
		}
		
		System.out.println(Line.sLine(50));
		System.out.printf("%-3s\t","총  점");
		System.out.printf("%4.0f\t" ,totals[Score.I_KOR]);
		System.out.printf("%4.0f\t" ,totals[Score.I_ENG]);
		System.out.printf("%4.0f\t" ,totals[Score.I_MATH]);
		System.out.printf("%6.0f\t  " ,totals[Score.I_SUM]);
		System.out.printf("%6.2f\n",totals[Score.I_AVG]/ scores.length);
		System.out.println(Line.dLine(50));
		
	}

}
