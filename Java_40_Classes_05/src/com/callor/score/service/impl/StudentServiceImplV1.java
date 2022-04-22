package com.callor.score.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

import com.callor.score.domain.StudentVO;
import com.callor.score.service.studentService;

public class StudentServiceImplV1 implements studentService {

	// 학생데이터들을 저장할 배열 변수
	private StudentVO[] stList;

	// 데이터가 저장된 text file 이름
	private String stFile;

	// public StudentServiceImplV1() {
	// }

	public StudentServiceImplV1(String stFile, int length) {

		// argument로 받은 stFile을 사용하기 위해 아래에 저장하는 것
		// student.txt로 쓰지 않고 stFile에 담는 이유 : 파일 교체할 일이 있을 시 수월하게 하기 위함
		this.stFile = stFile;
		this.stList = new StudentVO[length];

		// 클래스로 선언된 변수는 초기화해주기
		for (int i = 0; i < this.stList.length; i++) {
			this.stList[i] = new StudentVO();
		}
	}

	@Override
	public void loadStudent() {

		// 선언 따로
		// 간단한 이 코드로 다른 친구들의 어쩌고를 불러온다 <-> Java_40_Classes_04/ScannerEx2.java
		InputStream is = null;

		// 초기화 따로
		// 반드시 try catch로 묶어줘야한다.
		try {
			is = new FileInputStream(this.stFile);
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println(stFile + " 파일을 찾을 수 없습니다.");
			
			// 다음 코드 진행을 막기 위해 method 종료
			return;
		}
		Scanner scan = new Scanner(is);

//		while (true) {
//			// 스캐너를 사용한 파일이 내용이 있냐
//			boolean bYes = scan.hasNext();
//
//			// 없으면(false) 중단하고
//			if (bYes == false) {
//				break;
//			}
//			// 있으면(true) 출력
//			String stLine = scan.nextLine();
//			System.out.println(stLine);
//		}

		// stList의 요소를 가리키는 값
		int index = 0;
		
		// 위의 코드를 간단하게
		// 스캔한 내용이 있으면(true) {}내용을 반복하라
		while(scan.hasNext()==true) {
			String stLine = scan.nextLine();
			System.out.println(stLine);
			
			// 담긴 데이터를 개별적으로 분리해주기
			String[] stInfos = stLine.split(":");
			
			System.out.println("학번 : " + stInfos[0]);
			System.out.println("이름 : " + stInfos[1]);
			System.out.println("학년 : " + stInfos[2]);
			System.out.println("학과 : " + stInfos[4]);
			System.out.println("주소 : " + stInfos[5]);
			
			StudentVO stVO = new StudentVO();
			stVO.setStNum(stInfos[0]);
			stVO.setStName(stInfos[1]);
			stVO.setStGrade(stInfos[2]);
			stVO.setStDept(stInfos[4]);
			stVO.setStAddr(stInfos[5]);
			
			stList[index++] = stVO;
		} // end while 여기를 지나면 stList에 모든 데이터가 담겨있을 것이다.
		
		this.printStudents();
		
	} // end loadStudent

	// V1에서 stList에 담긴 데이터들을 확인하기 위하여 내부용으로 만든 method
	private void printStudents() {
		
		for (int i = 0; i < stList.length; i++) {
			System.out.println(stList[i].toString());
		}
		
		// 위의 코드와 같음
		for (StudentVO vo : stList) {
			System.out.println(vo.toString());
		}
	}
	
	@Override
	public StudentVO[] getStudents() {
		return null;
	}

	@Override
	public StudentVO findByNum(String stNum) {
		return null;
	}

}
