package com.callor.app.exec;

import java.util.List;

public class Exec5A {

	public static void main(String[] args) {
		
		List<Integer> nums = GetValue.getList(100);
		
		int max = 0;
		int index = 0;
		
		for (int i = 0 ; i < nums.size() ; i++) {
			if (nums.get(i) > max) {
				max = nums.get(i);
				index = i;
			}
		}
		System.out.printf("%d에 담긴 %d이(가) 가장 크다\n", index, max);
		
		// max값과 일치하는 최초의 요소 위치를 알려주는 method
		int lindex = nums.indexOf(max);
		
		System.out.println("가장 큰 수가 가장 처음 나타난 위치 : " + lindex);
	}
}
