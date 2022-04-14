package com.callor.arrays.service;

import java.util.Scanner;

import com.callor.arrays.utils.Line;

// ServiceV2에서 ServiceV1을 상속받았다
// 상속을 받으면 ServiceV1에 선언된 변수, method를 그대로 물려받는다
// 단, 생성자 제외
//
// 상속 키워드가 extends(확장) 인 것에 주목
public class StudentServiceV2 extends StudentServiceV1 {

	public StudentServiceV2() {
		this(10);
	}

	public StudentServiceV2(int length) {
		strStudents = new String[length];
		scan = new Scanner(System.in);

	}

	// [재정의(Override)]
	// ServiceV1에 선언된 메서드 중에서 inputStudent()를 다시 정의하겠다.
	@Override
	public int inputStudent() {

		System.out.println(Line.dLine(50));
		System.out.println("학생 정보 입력 V2");
		System.out.println(Line.sLine(50));

		int index = 0;
		for (index = 0; index < strStudents.length; index++) {
			System.out.printf("%d 번 학생 입력 (QUIT : 중단) > ", (index + 1));
			String strName = scan.nextLine();

			// 문자열이 변수에 담기면 T/F 를 물어보는 " == / != "는 안쓰는 것이 좋다 (StringEx1 파일 참
			// break와 같은 명령문을 사용할 때에는 간단한 문자보다는 QUIT같이 정확한 단어를 사용해 주는 것이 실수 방지에 좋다
			if (strName.equals("QUIT")) {
				break;
			}
			strStudents[index] = strName;
		}

		// for가 시작되기 전에 선언된 index는 for() {} 종료되어도 값을 유지하고 있다.
		// 만약 for() 명령문이 모두 수행 되지 않고 중단되면
		// index < strStudents.length 이다.
		if (index < strStudents.length) {
			System.out.println("입력이 중단되었습니다.");
		} else {
			System.out.println("입력을 모두 마쳤습니다.");
		}

		// 이런 방식보다는 위의 방식이 더 편리 ( <, >= 가 다름)
		//		if (index >= strStudents.length) {
		//			System.out.println("입력이 중단되었습니다.");
		//		} else {
		//			System.out.println("입력을 모두 마쳤습니다.");
		//		}

		//		System.out.println("index: " + index);
		//		System.out.println("종료");

		return 0;
	}

}
