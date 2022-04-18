package com.callor.classes.exec;

public class String2intV2 {

	public static void main(String[] args) {

		String strNum = "";
		int intNum = 0;
		if (strNum.equals("")) {
			System.out.println("숫자로 변환할 수 없음");
		} else {
			intNum = Integer.valueOf(strNum);
		}
		
		// 만약 키보드 등을 사용하여 값을 입력할 경우 은연 중에 space 키를 눌러 whit space가 담기는 경우가 발생할 것이다.
		// space 키를 한 번, 두 번, 혹은 여러 번 입력한다고 가정할 경우
		// 모든 경우의 수를 if()를 사용하여 검사한다면 다수의 불요코드가 추가될 것이다.
		if (strNum.equals("  ")) {
			System.out.println("space는 숫자로 변환할 수 없음");
		}

	}
}
