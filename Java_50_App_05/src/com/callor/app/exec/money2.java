package com.callor.app.exec;

public class money2 {

	public static void main(String[] args) {

		int pay = (int) (Math.random() * 1000000) + 1;
		
		System.out.printf("%7d원\n", pay);
		System.out.println("=".repeat(20));
		
		int money = 50_000;
		
		boolean sw = true;
		
		while ( pay > 0 ) {
			int paper = pay / money;
			System.out.printf("%7d원 : %5d 매 \n", money, paper);
			
			pay -= paper * money;
			if(sw) {
				money = money /5;
			} else {
				money = money / 2;
			}
			sw = !sw;
		}

	}
}