package com.callor.score.exec;

import com.callor.score.domain.StudentVO;

public class ArrayEx2 {
	
	public static void main(String[] args) {
	
		int length = 10 ;
		String[] stNums = new String[length];
		String[] stNames = new String[length];
		int[] intGrade = new int[length];
		
		StudentVO[] stList = new StudentVO[10];
		for ( int i = 0 ; i < stList.length ; i++) {
			stList[i] = new StudentVO();
		}
		
		// 배열의 크기를 다시 선언(10 그대로 써도, 값을 바꿔도)하면 담겨있던 값이 모두 초기화됨
		// 
		// 앞에서 선언, 생성되고 데이터가 추가된 배열을 다시 생성하게 되면 원래 저장된 데이터는 모두 소멸된다
		stList = new StudentVO[20];
		
	}

}
