package com.callor.classes.exec;

public class StringEx2 {
	
	public static void main(String[] args) {
		
		String strText = "홍길동,90,90,77";
		String[] names = {"홍길동", "이몽룡", "성춘향"};
		
		// .split() : 문자열 변수를 ()안의 내용을 가준으로 잘라 선언한 문자열배열로 저장해줌
		String[] items = strText.split(",") ; 
		
		for (int i = 0 ;i < items.length ; i++) {
			System.out.println(items[i]);
		}
	}

}
