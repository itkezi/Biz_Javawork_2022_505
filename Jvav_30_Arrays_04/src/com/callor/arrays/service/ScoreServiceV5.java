package com.callor.arrays.service;

import com.callor.arrays.utils.Line;

// intKor 배열 선언
// makeScore()
// prntScore()
// sumScore()
// 등의 method를 선언하고
// 임의 성적을 생성하여 intKor에 저장
// 성적일람표 출력
// 총점 계산후 출력
public class ScoreServiceV5 {

	private int[] intKor;
	private int intSum = 0;

	public void makeScore() {
		intKor = new int[100];
		for (int i = 0; i < intKor.length; i++) {
			intKor[i] = (int) (Math.random() * 100) + 1;
		}
	}

	public void printScore() {
		System.out.println();
		System.out.println(Line.dLine(77));
		System.out.println();
		System.out.println("\t\t\t 인재개발원 국어 일람표");
		System.out.println();
		System.out.println(Line.sLine(77));
		System.out.println();
		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%3d번: %3d점\t", (i + 1), intKor[i]);

			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}

		System.out.println();
		System.out.println(Line.sLine(77));
	}

	public void sumScore() {

		for (int i = 0; i < intKor.length; i++) {
			intSum += intKor[i];
		}
		System.out.println();
		System.out.printf("\t\t\t     총점 : %5d점\n" , intSum);
		System.out.println();
		System.out.println(Line.dLine(77));

	}
}
