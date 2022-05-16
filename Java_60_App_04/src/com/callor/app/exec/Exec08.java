package com.callor.app.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exec08 {

	public static void main(String[] args) {
		
		String fileName = "src/com/callor/app/exec/data.txt";
		
		// file과 관련한 클래스는 객체 선언문과 생성(초기화)를 분리한다 -> try/catch 선언때문
		FileInputStream is = null;
		Scanner scan = null;

		try {
			is = new FileInputStream(fileName);
			scan = new Scanner(is);
			while (scan.hasNext()) {
				System.out.println(scan.nextLine());
			}
			scan.close();
			try {
				is.close();
			} catch (IOException e) {
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일 실종");
		}
	}
}
