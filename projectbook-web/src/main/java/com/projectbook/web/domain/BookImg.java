package com.projectbook.web.domain;

public class BookImg {
	private int bookNo;
	private String img;
	
	public BookImg() {}

	public BookImg(int bookNo, String img) {
		this.bookNo = bookNo;
		this.img = img;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
}
