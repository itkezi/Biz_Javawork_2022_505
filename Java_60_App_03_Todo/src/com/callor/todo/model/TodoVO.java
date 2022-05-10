package com.callor.todo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TodoVO {

	// 아이디
	private String tKey;

	// 할 일 내용
	private String tContent;

	// 시작 날짜
	private String sdate;

	// 시작 시각
	private String stime;

	// 완료 날짜
	private String edate;

	// 완료 시각
	private String etime;

	// 완료 여부
	private boolean dComp;

	@Override
	public String toString() {
		// 3항 연산
		// edate.isEmpty()가 ture이면 "진행중" 문자열을 저장, 그렇지 않으면 "완료됨"을 저장
		String result = String.format("%s\t", tKey);
		result += String.format("%s\t", sdate);
		result += String.format("%s\t", stime);
		
		// compStr = edate.isEmpty() ? "진행중" : "완료됨";
		
		// edate의 값이 null이거나 ""이면
		String compStr = edate == null || edate.isEmpty() ? "진행중" : "완료됨";
		// 아래의 if()문 명령문을 간소화한 명령문
		if(edate == null || edate.isEmpty()) {
			compStr = "진행중";
		} else {
			compStr = "완료됨";
		}
		
		result += String.format("%s\t", tContent);
		result += String.format("%s", compStr);
		
		return result;
}}

	