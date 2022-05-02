package com.callor.app.model;

// 성적 처리를 하기 위해서 반드시 필요한 데이터
// 	- 학번, 국어, 영어, 수학
// 출력 결과를 보기 위해서 총점과 평균도 있으면 좋겠다
// 좀 더 확장을 하여 학생의 석차항목도 있으면 좋겠다
//
// 추상화 : 필요한 데이터를 설계
// private 변수 선언 : VO 클래스의 추상화된 데이터를 저장할 변수들
// private 변수에 접근하기 위하여 getter, setter method 선언
// 저장된 데이터를 확인하기 위하여 tdString() method도 재 정의
//
// spring project에서는 기본 생성자, 모든 필드를 포함한 임의 생성자를 만들지만, Console Project에서는 생성자는 생략 해도 된다.
public class ScoreVO {
	
	private int intStNum;
	
	private int intKor;
	private int intEng;
	private int intMath;
	
	private int intSum;
	
	private float fAvg;
	
	private int intRank;

	public int getIntStNum() {
		return intStNum;
	}

	public void setIntStNum(int intStNum) {
		this.intStNum = intStNum;
	}

	public int getIntKor() {
		return intKor;
	}

	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}

	public int getIntEng() {
		return intEng;
	}

	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}

	public int getIntMath() {
		return intMath;
	}

	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}

	public int getIntSum() {
		
		// ImplV1에서 intSum을 따로 구하지 않고 이곳에서 하는 방법도 있음
		 int intSum = intKor + intEng + intMath;
		
		return intSum;
	}

	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}

	public float getfAvg() {
		
		// ImplV1에서 fAvg를 따로 구하지 않고 이곳에서 하는 방법도 있음
		 fAvg = (float)getIntSum() / 3 ;
		
		return fAvg;
	}

	public void setfAvg(float fAvg) {
		this.fAvg = fAvg;
	}

	public int getIntRank() {
		return intRank;
	}

	public void setIntRank(int intRank) {
		this.intRank = intRank;
	}

	// toString() method를 재 정의하여
	// 한 학생의 성적 내용을 문자열로 만들어 return 하도록 하였다
	@Override
	public String toString() {
		
		String scStr= String.format("%5d\t", intKor);
		scStr += String.format("%5d\t", intEng);
		scStr += String.format("%5d\t", intMath);
		scStr += String.format("%5d\t", getIntSum());
		scStr += String.format("%5.2f\t\n", getfAvg());
		
		
		return scStr;
	}
	
	

}
