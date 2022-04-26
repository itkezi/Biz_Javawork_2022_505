package com.callor.app.controller;

public class MainController {

	public static void main(String[] args) {
		MenuController menu = new MenuController();
		
		StudentControllerV1 stController = new StudentControllerV1();

		while (true) {
			menu.ViewMainMenu();

			Integer select = menu.selectMenu();
			if (select == null) {
				System.out.println("업무 선택을 잘못했습니다.");
				System.out.println("다시 입력해주세요");
				continue;
			} else if (select == 1) {
				stController.selectMenu();
			} else if (select == 2) {
				menu.viewScMenu();
			} else if (select == -1) {
				break;
			} else {
				System.out.println("업무 선택을 잘못했습니다.");
			}
			// end if
		} // end while
		System.out.println("집가자");
	} // end main
}
// end class
