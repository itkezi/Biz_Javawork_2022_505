package com.callor.controller.op;

public class Operator_02 {

	public static void main(String[] args) {

		int intNum1 = 0;
		int intNum2 = 0;

		// intNum1 - intNum +10;
		System.out.println(intNum1 += 10);

		System.out.println((intNum1 += 10) > 10);

// Short-circuit Evaluation(SCE)
		// (최적화된) 단축 평가 값
		// 연산의 효율을 높이기 위해 불필요한 연산은 하지 않는다
		// 이 명령이 수행되면 두개의 논리 연산식이 실행된다.
		// 두개의 논리 연산의 결과를 OR 연산하여 console에 출력한다
		//결과는 true, 또는 false 가 될것이다.
		// OR 연산에서 하나만 나오면 true이기 때문에 뒤 값을 실행할 이유가 없어 intNum2는 0으로 남는다
		System.out.println(((intNum1 += 10) > 20) || ((intNum2 += 10) > 10));
		System.out.println(intNum1);
		System.out.println(intNum2);

		// 마찬가지로 AND 연산에서 하나라도 false가 나오면 false이기 때문에 뒤 연산을 실행할 이유가 없어 intNum2는 0으로 남는다
		System.out.println(((intNum1 += 10) < 20) && ((intNum2 += 10) < 100));
		System.out.println(intNum1);
		System.out.println(intNum2);
		
		
	}
}
