package com.callor.student.controller;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import com.callor.student.model.StudentVO;
import com.callor.student.service.StudentService;
import com.callor.student.service.impl.StudentServiceImplV2;

public class ControllerV2 {
	/*
	 * ControllerV1에서는 ServiceV1을 사용할 때 단순히 생성자를 호출하여
	 * ServiceV1에서 stdList와 fileName을 직접 관리하도록 하였다
	 * 만약 list 변수와 파일을 다른 것으로 바꾸려면 어쩔 수 없이 ServiceV1 코드를 변경해야 한다
	 * 
	 * 하지만 V2에서는 Controller에서 ServiceV2를 사용할 때
	 * stdList와 fileName을 생성자 매개변수로 전달하고 있다
	 * 이러한 패턴은 Controller와 Service 간의 결합도를 낮추어 더 좋은 패턴의 코드가 된다
	 */
	public static void main(String[] args) throws FileNotFoundException {
		List<StudentVO> stdList = new ArrayList<>();
		String fileName = "src/com/callor/student/student.txt" ;
		
		// java 1.5 이상에서 text 파일에 내용을 기재하기 위하여 단독으로 사용할 수 있는 클래스
		String printfile = "src/com/callor/student/print.txt" ;
		PrintStream ps = new PrintStream(printfile);
		PrintStream psConsole = System.out;
		
		// stdList의 원본데이터(student.txt) 파일을 생성자에 주입하여 
		// student.txt 파일에서 데이터를 읽어 stdList를 준비하라
		StudentService stService = new StudentServiceImplV2(stdList, fileName, ps);
		stService.printStudent();
		
		StudentService stService1 = new StudentServiceImplV2(stdList, fileName, psConsole);
		stService1.printStudent();
		
	}

}
