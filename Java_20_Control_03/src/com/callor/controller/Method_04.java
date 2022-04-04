package com.callor.controller;

import com.callor.service.ServiceV1;
import com.callor.service.ServiceV2;

public class Method_04 {

	public static void main(String[] args) {

		// ServiceV1 클래스에 선언된 add(), multi()는 static으로 선언되었다.
		int intSum1 = ServiceV1.add();

		String str;
		int num1;

		// class는 변수처럼 선언할 수 있다.
		// ServiceV2 class type으로 변수 선언하기
		// 여기서 ServiceV2 클래스는 이 프로젝트에저 생성한 임의의 키워드이다.
		//
		// 프로젝트에서 선언된 클래스는 변수처럼 선언을 할 수 있다.
		ServiceV2 serviceV2; // 선언하기
		serviceV2 = new ServiceV2(); // 초기화하기

		ServiceV2 sV2 = new ServiceV2(); // 선언과 초기화
		int intSum2 = serviceV2.add();
		int intSum3 = sV2.add();

		// int type의 변수 intNum4 선언하고 정수 0으로 clear
		int intNum4 = 0;
		// String type의 변수 strNation을 선언하고 빈(blank) 문장열로 clear
		String strNation1 = "";

		// String class type의 인스턴스 strNation2를 선언하고 인스턴스를 초기화( new String()) 하였다.
		String strNation2 = new String();

		// ServicV2 class type의 인스턴스 sV3를 선언하고 인스턴스를 초기화 (new serviceV2()) 하였다.
		ServiceV2 sV3 = new ServiceV2();

		// ServiceV2 class type의 객체(object)를 선언했다
		ServiceV2 sV4;
		// 초기화(new ServiceV2())를 실행하여 sV4가 인스턴스가 되었다.
		sV4 = new ServiceV2();

	}

}
