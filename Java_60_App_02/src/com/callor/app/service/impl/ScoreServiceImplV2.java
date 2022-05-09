package com.callor.app.service.impl;

import com.callor.app.model.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServiceImplV1A {

	public ScoreServiceImplV2() {
		// 상속받은 ScoreServiceImplV1A 클래스의 기본 생성자 호출
		super();
	}

	@Override
	public void inputScore() {

		while (true) {
			System.out.println("학생이름 입력 (QUIT : 종료) >> ");
			String stName = scan.nextLine();
			if (stName.equals("QUIT")) {
				break;
			}

			String[] strSubject = { "국어", "영어", "수학" };
			Integer[] intScore = new Integer[3];

			int index = 0;
			for (index = 0; index < strSubject.length; index++) {
				intScore[index] = 0;
				intScore[index] = getScore(strSubject[index]);
				if (intScore[index] == null) {
					/*
					 * 만약 index 값이 0이라면 " 국어 점수 " 입력 화면이 나타난다 점수를 숫자로 입력하지 않고 Enter만 누르거나 다른 문자열이 섞인
					 * 경우라면 " 국어 점수는 정수만 입력 " 메시지를 보여주고 null을 return 그러면 index 값을 1 감소시켜 -1로 만든 후 다시
					 * for() 처음으로 점프한다. for(index = -1; ...) { } 가 다시 실행될 것 for(;;index++)에 의해서
					 * index는 다시 0이 된다 그러면 국어 점수를 입력하는 화면이 다시 나타날 것이다.
					 */
					index--;
					continue;
				}
				// for() 반복문 중단하기
				if (intScore[index] < 0)
					break;
			} // end for
				// while() 반복문 중단하기
			if (index < strSubject.length) {
				break;
			}

			// Build 패턴을 사용하여 VO 객체 생성하면서 데이터 Setting하기
			// 1. 생성자 키워드 new 사용하지 않음
			// 2. 클래스.builder() method 시작
			// 3. VO 클래스에 정의된 변수 이름이 method 역할 수행
			// 4. 변수 이름에 해당하는 method에 값 전달하여 데이터 저장
			// 5. build() method 호출하여 마감
			//
			// build 패턴을 사용하는 이유
			// 1. VO 객체를 생성하고 Setter method를 사용하여 데이터를 저장하는 번거로움을 해결
			// 2. 필드생성자를 사용할 때 모든 변수의 값을 준비해야하는 번거로운을 해결
			// 3. 준비된 데이터만 가지고 VO 객체를 생성하면서 데이터를 Setting 할 수 있다
			ScoreVO scVO = ScoreVO.builder().stName(stName).intKor(intScore[0]).intEng(intScore[1]).intMath(intScore[2])
					.build();
			scList.add(scVO);

		} // end while

		// 확인 코드
		System.out.println("=".repeat(55));
		System.out.println("이름\t\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(55));
		System.out.println();
		for (ScoreVO scVO : scList) {
			System.out.println(scVO.toString());
		}
		System.out.println("=".repeat(55));
	}
	/*
	 * 정수 점수를 정확히 입력했으면 점수를 return하고 만약 exception이 발생하면 null return 종료(QUIT)을 입력하면
	 * -1을 return
	 */

	private Integer getScore(String title) {

		System.out.printf("%s 점수입력 (QUIT : 종료) >> ", title);
		String score = scan.nextLine();
		Integer intScore = 0;

		if (score.equals("QUIT")) {
			return -1;
		}

		try {
			intScore = Integer.valueOf(score);
		} catch (Exception e) {
			System.out.printf("%s 점수는 정수만 가능\n", title);
			return null;
		}

		return intScore;

	}

}
