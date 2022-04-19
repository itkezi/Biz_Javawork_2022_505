package com.callor.score.exec;

import com.callor.score.domain.ScoreV2VO;

public class ExecV3 {

	public static void main(String[] args) {
		
		// VO 클래스를 사용하여 배열 선언하기
		ScoreV2VO[] scores = new ScoreV2VO[10];
		
		// 객체를 배열로 불러왔을 때에는 각 요소를
		// 초기화해주지 않으면 값이 저장이 되지 않는다
		// (안하면 NullPointerException 오류 뜸)
		
		scores[0] = new ScoreV2VO();
		scores[1] = new ScoreV2VO();
		scores[2] = new ScoreV2VO();
		scores[3] = new ScoreV2VO();
		
		scores[0].setStName("홍길동");
		scores[1].setStName("이몽룡");
		scores[2].setStName("장영자");
		scores[3].setStName("성춘향");
		
	}
}
