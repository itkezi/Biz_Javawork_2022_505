package com.callor.app.exec;

public class money {

	public static void main(String[] args) {

		int money = (int) (Math.random() * 100000) + 1;

		System.out.println("금액  : " + money);

		int fivem = money / 50000;
		if (fivem > 0) {
			System.out.printf("오만원 %d장\n", fivem);
			money = money - (50000 * fivem);
		}

		int onem = money / 10000;
		if (onem > 0) {
			System.out.printf("만원 %d장\n", onem);
			money = money - (10000 * onem);
		}

		int fivet = money / 5000;
		if (fivet > 0) {
			System.out.printf("오천원 %d장\n", fivet);
			money = money - (5000 * fivet);
		}

		int onet = money / 1000;
		if (onet > 0) {
			System.out.printf("천원 %d장\n", onet);
			money = money - (1000 * onet);
		}

		int fiveh = money / 500;
		if (fiveh > 0) {
			System.out.printf("오백원 %d개\n", fiveh);
			money = money - (500 * fiveh);
		}

		int oneh = money / 100;
		if (oneh > 0) {
			System.out.printf("백원 %d개\n", oneh);
			money = money - (100 * oneh);
		}

		int fifty = money / 50;
		if (fifty > 0) {
			System.out.printf("오십원 %d개\n", fifty);
			money = money - (50 * fifty);
		}

		int ten = money / 10;
		if (ten > 0) {
			System.out.printf("십원 %d개\n", ten);
			money = money - (50 * ten);
		}

	}
}
