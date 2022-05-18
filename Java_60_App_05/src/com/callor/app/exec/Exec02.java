package com.callor.app.exec;

import com.callor.app.model.AddressVO;

public class Exec02 {

	public static void main(String[] args) {

		AddressVO[] addrs = new AddressVO[3];

		addrs[0] = new AddressVO();
		addrs[0].setName("홍길동");
		addrs[0].setAge(30);

		addrs[1] = AddressVO.builder().name("이몽룡").age(20).build();
		addrs[2] = AddressVO.builder().name("성춘향").age(16).build();

		for (AddressVO aVO : addrs) {
			System.out.println(aVO);
		}

		int size = addrs.length;
		
		// 배열일 경우에는 이래도 됨 그러나
		// for 반복문이 시작되기 전에 _tVO 선언하고
		// for 내부에서 반복적으로 값을 교환하는 코드를 사용할 경우
		// type형 변수의 생명주기 문제고 메모리 누수가 발생할 수 있다
		// 어차피 
		// AddressVO _tVO = null;

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				// 베열의 i요소인 aVO의 나이가 더 큰값이면
				if(addrs[i].getAge() > addrs[j].getAge()) {
					// tVO에 임시 저장
					// 배열의 i번째 요소를 대피
					AddressVO _tVO = addrs[i];
					// i번째 요소 위치에 j번째 요소값을 복사
					addrs[i] = addrs[j];
					// 대피해 두었던 i번째 요소 값을 j번째에 복사
					addrs[j] = _tVO;
				}
			}
		}
	}
}
