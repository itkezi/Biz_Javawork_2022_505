package com.callor.todo.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.callor.todo.model.TodoVO;

public class TodoServiceImplV2 extends TodoServiceImplV1 {

	public TodoServiceImplV2() {
		super();
		loadTodoList();
	}

	// 저장된 todoList.txt 파일을 읽어서 todoList에 추가하기
	public void loadTodoList() {

		FileInputStream is = null;

		try {
			is = new FileInputStream(this.saveFileName);
		} catch (FileNotFoundException e) {
			System.out.println(saveFileName + "파일을 찾을 수 없습니다.");
			return;
		}

		Scanner fileRead = new Scanner(is);

		int T_KEY = 0;
		int S_DATE = 1;
		int S_TIME = 2;
		int E_DATE = 3;
		int E_TIME = 4;
		int T_CONTENT = 5;

		while (fileRead.hasNext()) {

			String todoLine = fileRead.nextLine();

			String[] todoInfo = todoLine.split(",");

			// text 파일에 데이터를 저장하면 마지막에 공백의 Line이 추가되는 경우가 있다
			// 이때는 split 으로 분해한 배열의 개수가 부족하게 된다
			// 이러한 상황을 방지하기 위하여 아래 코드를 추가한다
			if (todoInfo.length < T_CONTENT + 1) {
				continue;
			}

			String tK = todoInfo[T_KEY];
			String sD = todoInfo[S_DATE];
			String sT = todoInfo[S_TIME];
			String eD = todoInfo[E_DATE];
			String eT = todoInfo[E_TIME];
			String tC = todoInfo[T_CONTENT];

			if (eD.equals("null")) {
				eD = null;
			}
			if (eT.equals("null")) {
				eT = null;
			}

			TodoVO tVO = TodoVO.builder().tKey(tK).sdate(sD).stime(sT).edate(eD).etime(eT).tContent(tC).build();

			todoList.add(tVO);

		}

		try {
			is.close();
		} catch (Exception e) {
		}
		fileRead.close();
	}

}
