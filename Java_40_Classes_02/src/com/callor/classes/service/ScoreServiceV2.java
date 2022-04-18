package com.callor.classes.service;

import java.util.Scanner;

import com.callor.classes.utils.Line;

public class ScoreServiceV2 {

	protected String[] student;
	protected int[] intKor;
	protected Scanner scan;
	protected int linelength;

	public ScoreServiceV2() {
		this(3);
	}

	public ScoreServiceV2(int length) {

		student = new String[length];
		intKor = new int[length];
		scan = new Scanner(System.in);
		linelength = 50;
	}

	public int input() {

		System.out.println(Line.dLine(linelength));
		System.out.println("대한 고교 성적처리 V2");
		System.out.println(Line.sLine(linelength));

		int index = 0;

		while (index < student.length) {

			System.out.print("이름(END : 중단) >> ");
			String strName = scan.nextLine();
			if (strName.equals("END")) {
				return -1;
			}

			System.out.print("점수(정수로, END : 중단) >> ");
			String strKor = scan.nextLine();
			if (strKor.equals("END")) {
				return -1;
			}

			int intScore = 0;
			
			try {
				intScore = Integer.valueOf(strKor);
				student[index] = strName;
				intKor[index] = intScore;
				index++;
			} catch(Exception e) {
				System.out.println("잘못된 입력값입니다.");
				
			}
			
			
		}

		return 0;
	}

}
