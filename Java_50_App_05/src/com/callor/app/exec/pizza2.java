package com.callor.app.exec;

public class pizza2 {

	public static void main(String[] args) {

		int student = (int) (Math.random() * 25) + 25;
		
		int pizza = 5;

		System.out.print(student + "명은");
		for (int i = 0; i < student; i++) {
			if (student > (6 * pizza)) {
				pizza++;
			}
		}
		System.out.println(pizza + "판");
	}

}
