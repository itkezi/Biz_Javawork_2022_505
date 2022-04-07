package com.callor.app.service;

public class ServiceV2A {

	public void print() {
		
		// ServiceV2와 Service2A는 같은 package(com.callor.app.service)이기 때문에 import문이 필요 없
		ServiceV2 serviceV2 = new ServiceV2();
		
		// sum()는 private로 설정되어 있기 때문에 호출할 수 없다.
		// serviceV2.sum();
		
		
		// add()는 한정자를 생략했기 매문에 같은 package에 있는 클래스들 끼리는 호출이 가능하다.
		serviceV2.add();
	}
	
}
