package com.callor.app.controller;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.service.ServiceV2;

public class ControllerV22 {
	
	public static void main(String[] args) {
		
		// 1. scoreList에는 실제 데이터가 저장될 곳의 주소만 담겨있는 상태 (참조변수의 특성)
		List<Integer> scoreList = new ArrayList<Integer>();
		
		// 2. scoreList의 주소를 생성자의 매개변수로 주입하기
		ServiceV2 sV2 =  new ServiceV2(scoreList);
		System.out.println(scoreList);
		
		// scoreList에 getScore에서 return한 값을 담지 않았음에도 출력되는 모습
		// 3. scoreList의 주소를 전달받은 intList에 10개의 데이터를 추가하기
		sV2.getScore(10);
		
		// 4. ServiceV2의 getScore()가 추가한 데이터를 바라보고 있는 scoreList를 출력
		// 5. scoreList와 intList는 같은 데이터를 바라보고 있기 때문에 ServiceV2.gerScore()가 추가한 데이터를 Controller에서 출력할 수 있다.
		System.out.println(scoreList);
		
	}

}
