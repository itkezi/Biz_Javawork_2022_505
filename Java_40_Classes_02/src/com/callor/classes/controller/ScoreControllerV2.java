package com.callor.classes.controller;

import com.callor.classes.service.ScoreServiceV2;

public class ScoreControllerV2 {
	
	public static void main(String[] args) {
		
		ScoreServiceV2 scoreServiceV2 = new ScoreServiceV2(3);
		
		int intResult = scoreServiceV2.input();
		
		if (intResult < 0) {
			System.out.println("입력을 중단했습니다");
		} else {
			System.out.println("입력을 마쳤습니다");
		}
		
	}

}
