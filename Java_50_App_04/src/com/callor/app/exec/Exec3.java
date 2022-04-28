package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec3 {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			nums.add((int) (Math.random() * 100) + 1);
		}

		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) >= 55) {
				System.out.printf("%d번째에서 55이상이 나왔다. (값 : %d)", i , nums.get(i));
				break;
			}
		}

	}

}
