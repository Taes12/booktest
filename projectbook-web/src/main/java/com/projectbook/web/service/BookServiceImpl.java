package com.projectbook.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectbook.web.dao.BookDao;
import com.projectbook.web.domain.Book;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookDao bookDao;
	
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	// 메인 페이지(책 리스트)
	@Override
	public List<Book> bookList() {
		return bookDao.bookList();
	}
	// 상세보기
	@Override
	public Book bookDetail(int no) {
		return bookDao.bookDetail(no);
	}

}
