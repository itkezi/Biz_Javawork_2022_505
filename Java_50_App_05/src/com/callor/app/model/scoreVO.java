package com.callor.app.model;

public class scoreVO {

	private int kor;
	private int eng;
	private int math;
	private int sum;
	private int av;
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getAv() {
		return av;
	}
	public void setAv(int av) {
		this.av = av;
	}
	@Override
	public String toString() {
		return "scoreVO [kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", av=" + av + "]";
	}
	
	
	
}
