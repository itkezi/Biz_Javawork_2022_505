package com.callor.app.service;

import java.util.List;

import com.callor.app.domain.StudentVO;

public interface StudentService {
	
	public void loadStudent();
	public List<StudentVO> getStudents();
	public StudentVO findByStNum(String stNum);
	// 중복값이 있을 수도 있는 건 return type을 반드시 리스트로
	public List<StudentVO> findByStName(String stName);
	

}
