package com.projectbook.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projectbook.web.domain.Book;
import com.projectbook.web.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	public void serBookService(BookService bookService) {
		this.bookService = bookService;
	}
	// 메인 페이지(책 리스트)
	@RequestMapping(value= {"/bookList", "/list"}, method=RequestMethod.GET)
	public String bookList(Model model) {
	
	List<Book> bookList = bookService.bookList();
	
	model.addAttribute("bookList", bookList);
	
	return "bookList";
	}
	
	// 책 상세보기
	@RequestMapping("/bookDetail")
	public String bookDetail(Model model, int no) {
		Book book = bookService.bookDetail(no);
		model.addAttribute("book", book);
		
		return "bookDetail";
	}	
	
}
