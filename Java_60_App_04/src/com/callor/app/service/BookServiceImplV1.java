package com.callor.app.service;

import java.util.List;

import com.callor.app.model.BookVO;

public class BookServiceImplV1 implements BookService {
	
	// protected는 기본적으로 private 성질을 가지면서 상속받은 클래스에서는 public 처럼 변수에 접근할 수 있다
	protected List<BookVO> bookList;

	@Override
	public void inputBook() {
		
	}

	@Override
	public void bookList() {
		
	}

}
