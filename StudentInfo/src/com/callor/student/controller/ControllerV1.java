package com.callor.student.controller;

import com.callor.student.service.StudentService;
import com.callor.student.service.impl.StudentServiceImplV1;

public class ControllerV1 {
	
	public static void main(String[] args) {
		StudentService stService = new StudentServiceImplV1();
		stService.printStudent();
		
	}

}
