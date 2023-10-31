package com.projectbook.web.service;

import java.util.List;

import com.projectbook.web.domain.Book;

public interface BookService {
	
	// 메인 페이지(책 리스트)
	public abstract List<Book> bookList();
	// 상세보기
	public abstract Book bookDetail(int no);
	
}
