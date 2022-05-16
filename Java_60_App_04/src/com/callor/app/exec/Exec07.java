package com.callor.app.exec;

import com.callor.utils.Line;

public class Exec07 {
	
	public static void main(String[] args) {

		int lineLength = 13;
		int num = 7;

		System.out.println(Line.dLine(lineLength));
		
		System.out.printf(" %d 단 구구단\n", num);
		
		System.out.println(Line.sLine(lineLength));
		
		for (int i = 2; i < 10; i++) {
			System.out.printf(" %d x %d = %3d\n", num, i, num * i);
		}
		
		System.out.println(Line.dLine(lineLength));
		
	}
	

}
