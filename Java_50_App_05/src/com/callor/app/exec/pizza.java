package com.callor.app.exec;

public class pizza {
	
	public static void main(String[] args) {
		
		int[] student = new int[26];
		
		int num = 24;
		for (int i = 0 ; i < student.length ; i++) {
			num++;
			student[i] = num;
//			System.out.println(student[i]);
		}
		
		int pizza = 5;
		
		for (int i = 0 ; i < student.length ; i++) {
			System.out.print(student[i] + "명은");
			if (student[i] > (6* pizza)) {
				pizza++;

			}
			
			System.out.println(pizza + "판");
		}
	}

}
