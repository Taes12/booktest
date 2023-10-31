package com.projectbook.web.domain;

import java.sql.Timestamp;

public class Book {
	
	private int no;
	private String title;
	private String author;
	private String publisher;
	private Timestamp publicationDate;
	private String description; 
	private int price;
	private int discount;
	
	public Book() {}

	public Book(int no, String title, String author, String publisher, Timestamp publicationDate, String description,
			int price, int discount) {

		this.no = no;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publicationDate = publicationDate;
		this.description = description;
		this.price = price;
		this.discount = discount;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Timestamp getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Timestamp publicationDate) {
		this.publicationDate = publicationDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
}
	