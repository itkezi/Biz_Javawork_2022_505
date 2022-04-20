package com.callor.classes.exec;

import java.io.InputStream;
import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		// data.txt 우클릭 후 Copy Qualified name 했음
		String filename = "data.txt";
		
		// ScannerEx1에 있는 filename을 가져와 Stream 하라
		InputStream is = ScannerEx1.class.getResourceAsStream(filename);
		
		// input Stream
		Scanner scan = new Scanner(is);
		String strLine = scan.nextLine();
		
		System.out.println(strLine);
		System.out.println(scan.nextLine());		
		System.out.println(scan.nextLine());		
		System.out.println(scan.nextLine());		
		System.out.println(scan.nextLine());		
		System.out.println(scan.nextLine());		
		System.out.println(scan.nextLine());		
		System.out.println(scan.nextLine());		
	}
}
