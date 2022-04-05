package com.callor.controller;

// 지금부터 java.util package에 담긴 Scanner라는 클래스를 연결하여 사용하겠다.
import java.util.Scanner;

public class ScannerEx_01 {
		
	public static void main(String[] args) {

		int intRnd = (int)(Math.random() *100) +1 ;
	
		// class를 사용하여 객체(Object)를 선언하기
		// Scanner class에 포함된 method를 호출하여 어떤 명령을 수행하기 위한 첫 준비 단계
		// 객체(Object)를 선언한다.라고 표현
		// 객체가 선언만 된 상태에서는 아직 method를 호출하여 무언가 명령을 수행할 수는 없다.
		Scanner scan;
		
		System.out.println( "console에 출력");
		
		// 선언된 scan object를 instance로 만들어 memory에 loading하고 사용할 준비가 된 상태
		// 이때 "scan instance"라고 부른다.
		// new Scanner(System.in) : pc에 연결된 키보드를 Scanner Class에게 연결하여 키보드로부터 데이터(값)을 입력받을 수 있도록 한다.
		
		scan = new Scanner(System.in);

		String inputStr = new String();
		
		inputStr = scan.nextLine();
		System.out.println("inputStr 값 : " + inputStr);
		
	}
	
}
