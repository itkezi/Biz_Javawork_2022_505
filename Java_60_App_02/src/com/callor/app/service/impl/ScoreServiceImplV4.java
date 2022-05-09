package com.callor.app.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.callor.app.model.ScoreVO;

public class ScoreServiceImplV4 extends ScoreServiceImplV3{
	
	public ScoreServiceImplV4() {
		super();
	}

	@Override
	public void saveScore() {
		
		FileWriter fileWriter = null;
		PrintWriter print = null;
		
		try {
			fileWriter = new FileWriter(saveFileName);
			print = new PrintWriter(fileWriter);
			for(ScoreVO scVO : scList) {
				String writeStr = "";
				print.format("%s:", scVO.getStName());
				print.format("%d:", scVO.getIntKor());
				print.format("%d:", scVO.getIntEng());
				print.format("%d\n", scVO.getIntMath()); }
			
			print.close();
			fileWriter.close();
		} 
			catch (IOException e) {
			
		}
		
		
		
		
	}
	
}
