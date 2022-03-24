package com.callor.var;

public class Var_02 {
	public static void main(String[] args) {
		
		// 변수의 선언과 clear
		int intNum1 = 0;
		
		// main() {} 블럭에서 선언된 intNum1 변수는
		// main() {} 블럭이 끝나는 시점에 모두 소멸
		
		int intNum2 = 0;

		// 변수에 값을 할당, 대입, 저장
		// 이전에 변수에 어떤 일이 있던지 상관없이 모든 값이 clear되고, intNum1 변수에는 55만 담겨있게 된다.
		intNum1 = 55;
		intNum2 = 33;
		
		// 이 명령문을 만나면
		// 1. inNum1에 저장된 값을 읽어온다
		System.out.println(" 55 + 33 = " + intNum1 + intNum2 );
		// 2. intNum1 에 담김 숫자형 데이터를 문자열형 데이터로 바꿔버린다.
		// 3. intNum2에 저장된 값을 읽어온다.
		
		
		System.out.println(" 55 + 33 = " + "55" + intNum2 );
		// 4. intNum2에 담긴 숫자형 데이터를 문자열 형 데이터로 바꿔버린다.
		
		System.out.println(" 55 + 33 = " + "55" + "33" );
		// 5. 53 + 33 = 5533으로 출력된다.
	
		System.out.println(" 55 + 33 = " + (intNum1 + intNum2) );
		// 6. 괄호를 사용해 우선순위 부여

		System.out.println(" 55 * 33 = " + intNum1 * intNum2 );
		// 7. 곱셈은 덧셈보다 우선순위에 있기때문에 원하는 대로 출력 가능
		//    (그러나 맴이 찝찝하면 괄호를 쳐주자.)

		System.out.println(" 55 - 33 = " + (intNum1 - intNum2) );
		// 문자열과 문자열은 뺄셈할 수 없다. (똑같이 괄호 사용해줘야 함. 나누기도 마찬가지)
	
	
	
		// 이전에 변수에 어떤 일이 있던지 상관없이 모든 값이 clear되고, intNum1 변수에는 77만 담겨있게 된다.
		intNum1 = 77;
		intNum2 = 99;

		System.out.println(" 55 + 33 = " + (intNum1 + intNum2) );

		
		// 블럭( { } ) 내에서 선언하고 값이 할당된 변수가 있을 때
		// 변수에서 값을 읽어서 연산을 수행하는데 어떠한 연산을 수행하든 읽기를 수행하는 변수의 값은 절대 변함이 없다.
		
		// 다만, 어디선가 변수에 또다른 값을 할당하면 변수 값이 변하게 된다. 
		
		int intNum3 = 1000;

		System.out.println(intNum3);
		System.out.println(intNum3);
		System.out.println(intNum3);
		System.out.println(intNum3);
		System.out.println(intNum3);
		
	} // main()이 끝나는 곳
	
	// Main() 영역의 바깥
	// System.out.println(intNum3); : 사용할 수 없다.
	// intNum3 변수도 사용(읽기 저장) 할 수 없다.

} // class Var_02가 끝나는 곳
