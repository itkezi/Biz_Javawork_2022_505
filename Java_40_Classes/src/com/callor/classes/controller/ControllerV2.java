package com.callor.classes.controller;

import com.callor.classes.service.ScoreServiceV2;

public class ControllerV2 {

	public static void main(String[] args) {
		
		ScoreServiceV2 scServiceV2 = new ScoreServiceV2(3);
		scServiceV2.input();
		scServiceV2.print();
	}
}
