/*
 * 현재 생성한 HelloKorea 클래스는 
 * com/callor/hello 폴더에 저장되어있다 라는 표식
 * 현재 생성한 클래스가 저장된 base package 다 라고 한다.
 */

package com.callor.hello;

//지금 작성하는 소스코드는 HelloKorea.java 파일이다.
// HelloKorea.java 를 클래스 파일 또는 자바소스코드라고 한다.
public class HelloKorea {
	/*
	 * main 키워드 + Ctrl +Space : 상용구 작성
	 * @param args
	 * 
	 * Key Words reserved word, 명령어(command word) 
	 * 대소문자도 틀려선 안됨 (개발전용 폰트 쓰는 이유)
	 * Package, Public, Class, static, void
	 * 
	 */
	public static void main(String[] args) {
		
		System.out.println("반갑습니다.");
		System.out.println(30+40);
		System.out.println(30*40);
		System.out.println(40-30);
		System.out.println(40/2);
		System.out.println(30+40*40/2-100);
	
		//""안의 문자 명령어는 그냥 그대로 출력 (공백도) (""안에서는 연산 불가능)
		System.out.println("30+40="+(30+40));
		System.out.println("30+40="+"70");
		
		// 문자열 덧셈 연산
		// 문자열 + 문자열은, 문자열을 연결하여 결과를 만든다. (덧셈만 가능)
		System.out.println("대한"+"민국");
		System.out.println("대한민국");
	}

}
