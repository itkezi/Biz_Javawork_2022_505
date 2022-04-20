package com.callor.classes.exec;

public class StringEx1 {

	public static void main(String[] args) {

		String strNation = "대한민국만세";
		System.out.println(strNation);

		String strName = new String("홍길동");
		System.out.println(strName);

		// 일부 문자열만 자르고 싶을 때 : 3번째 글자부터
		String strNo1 = strNation.substring(3);
		System.out.println(strNo1);

		// 일부 문자열만 자르고 싶을 때 : 3번째 글자부터 5번째 글자 ***앞까지***
		String strNo2 = strNation.substring(3, 5);
		System.out.println(strNo2);

		for (int i = 0; i < strNation.length(); i++) {
			System.out.println(strNation.substring(i));
		}

		for (int i = 0; i < strNation.length(); i++) {
			System.out.println(strNation.substring(i, i + 1));
		}
		// 6번글자 앞까지 출력인데 6번째 글자가 나오는 이유
		// : 저장소가 글자열 마지막에 1칸 더(000/이것이 나오면 출력이 멈추게) 저장해줌 그래서 온전히 나올 수 있는 것
		for (int i = 0; i < strNation.length(); i++) {
			System.out.print(strNation.substring(i, i + 1));
		}
		System.out.println();

		int[] intNum = new int[10];
		// 베열에 있는 length는 변수(속성)이다
		for (int i = 0; i < intNum.length; i++) {
			System.out.print(intNum[i]);
		}
		System.out.println();

		String str0 = "0123456789";
		// 배열에 있는 length는 메서드이다 (for가 10번 반복되면 10번 호출되는 것) -> 무거워짐 
		for (int i = 0; i < str0.length(); i++) {
			System.out.print(str0.substring(i, i + 1));
		}
		System.out.println();
		
		// 위의 코드를 효율적으로 바꿔보자
		// str0.length() 메서드는 문자열의 길이를 계산하는 method
		String str1 = "0123456789";
		// for()반복문이 실행되기 전에 문자열의 개수를 계산하여 return하는 length()를 호출하고 결과를 변수에 담자
		// 이제 문자열의 길이를 계산하는 코드는 한번만 실행되고 문자열의 길이만큼 for()반복문을 수행할 수 있게 되었다.
		// 상당히 많은 코드 실행이 없어져 효율적인 코드가 된다.
		int str1Length = str1.length();
		for (int i = 0; i < str1Length; i++) {
			System.out.print(str1.substring(i, i + 1));
		}
		System.out.println();
	}

}
