package com.callor.score.service;

import com.callor.score.domain.StudentVO;

// StudentService가 할 일
// 1. Student.txt 파일을 읽어서 학생데이터들 만들기
// 2. 생성된 학생데이터들을 return 해주기
// 3, 학번을 argument로 받아서 해당 학생데이터를 return 해주기

public interface studentService {

	public void loadStudent();

	public StudentVO[] getStudents();

	// stNum 학번을 학생데이터들에서 찾아서(findByNum) 학생 데이터를 return하기
	public StudentVO findByNum(String stNum);

}
