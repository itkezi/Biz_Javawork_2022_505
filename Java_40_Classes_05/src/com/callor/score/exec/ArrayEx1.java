package com.callor.score.exec;

public class ArrayEx1 {

	public static void main(String[] args) {
		int[] intNums = new int[10];

		for (int i = 0; i < intNums.length; i++) {

			intNums[i] = (int) (Math.random() * 100) + 1;

		}
		for (int i = 0; i < intNums.length; i++) {
			System.out.printf("%d\t", intNums[i]);
		}

		System.out.println();

		// 확장된 for()명령, 새로운 for()명령 = forEach
		// intNums를 펼쳐서 배열의 개수(배열의 0부터 끝까지)만큼 num에 담아라
		// 배열에 값을 저장하거나, 일부만 확인하는 것은 불가능
		for (int num : intNums) {
			System.out.printf("%d\t", num);
			
		}
	}
}
