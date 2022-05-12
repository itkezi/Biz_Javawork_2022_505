package com.callor.todo.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.todo.model.TodoVO;
import com.callor.utils.Line;

public class VarEx2 {
	
	public static void main(String[] args) {
		
		
		List<TodoVO> todoList = new ArrayList<>();
		
		
		// Builder 패턴을 사용한 VO 객체 생성
		// 클래스.builder() 메서드에 의해 VO객체가 선언되고 필드변수로 선언한 것과 
		//	같은 이름의 setter 메서드를 사용하여 VO 객체의 각 변수 값을 채워넣으면서 VO 객체를 생성하는 것
		TodoVO tVO = TodoVO.builder().sdate("2022-05-12").tContent("과제하기").build();
		todoList.add(tVO);
		
		// 원래라면 위 코드를 아래와 같이 작성해야함1
		// 기본생성자를 사용하여 객체 변수를 저장하면서 객체 생성하기
		tVO = new TodoVO();
		tVO.setEdate("2022-05-12");
		tVO.setTContent("과제하기");
		todoList.add(tVO);
		
		// 원래라면 위 코드를 아래와 같이 작성해야함2
		// 필드생성자를 사용하여 객체 변수를 저장하면서 객체 생성하기
		// 모든 값은 설정해주어야 함
		tVO = new TodoVO("001","생성자","2022-05-12", "09:30:00", "","",false);
		todoList.add(tVO);
		
		
		for ( TodoVO vo : todoList) {
			System.out.println(vo.toString());
		}
		
		// todoList의 0번째 요소를 getter하면 한 개의 todoList를 추출할 수 있다
		TodoVO todoVO = todoList.get(0);
		todoVO.setTKey("009");
		System.out.println(Line.dLine(50));
		for ( TodoVO vo : todoList) {
			System.out.println(vo.toString());
		}

		// 위 코드와 같다
		todoList.get(1).setTKey("101");
		System.out.println(Line.dLine(50));
		for ( TodoVO vo : todoList) {
			System.out.println(vo.toString());
		}
		
		
		
		
		
	}

}
