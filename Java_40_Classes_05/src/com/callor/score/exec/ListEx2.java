package com.callor.score.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.domain.StudentVO;

public class ListEx2 {

	public static void main(String[] args) {

		// java9 이후로부터는 뒤<>는 생략가능
		// 밑줄 생기면 적어주기
		List<StudentVO> stList = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			StudentVO vo = new StudentVO();

			int intNum = (int)(Math.random() *100) + 1;
			int intGrade = (intNum % 4) + 1;
			String strGrade = intGrade + "";
			
			String strNum = String.format("%05d", i + 1);
			vo.setStNum(strNum);
			vo.setStGrade(strGrade);
			System.out.println(vo.toString());
			stList.add(vo);
		}
	}

}
