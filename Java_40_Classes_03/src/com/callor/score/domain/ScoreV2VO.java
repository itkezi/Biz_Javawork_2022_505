package com.callor.score.domain;

// public class ScoreV2VO extends Object 지만 생략된 것임
public class ScoreV2VO {

	private String stName;
	private int intKor;
	private int intEng;
	private int intMath;
	private int intSum;
	private float fAvg;

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
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
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		return intSum;
	}

	// 데이터 수정 우려때문에 필요 없음
	// public void setIntSum(int intSum) {
	// this.intSum = intSum;
	// }

	public float getfAvg() {
		fAvg = (float) getIntSum() / 3.0f;
		return fAvg;
	}

	@Override
	public String toString() {
		return "ScoreV2VO [" 
	+ "stName=" + stName 
	+ ", intKor=" + intKor 
	+ ", intEng=" + intEng 
	+ ", intMath=" + intMath
	+ ", intSum=" + getIntSum()
	+ ", fAvg=" + getfAvg() + "]";
	}

	// 필요없음
	// public void setfAvg(float fAvg) {
	// this.fAvg = fAvg;
	// }

}
