package com.itbank.model.vo;

import java.sql.Date;

/*
	IDX       NOT NULL NUMBER        
	TITLE     NOT NULL VARCHAR2(200) 
	WRITER    NOT NULL VARCHAR2(100) 
	PUBLISHER NOT NULL VARCHAR2(100) 
	P_DATE             DATE          
	PRICE     NOT NULL NUMBER  
 */

public class BookVO {
	private int idx, price;
	private String title, writer, publisher;
	private Date p_date;
	
	public BookVO() {}
	
	public BookVO(int idx, int price, String title, String writer, String publisher, Date p_date) {
		this.idx = idx;
		this.price = price;
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		this.p_date = p_date;
	}

	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Date getP_date() {
		return p_date;
	}
	public void setP_date(Date p_date) {
		this.p_date = p_date;
	}
		
}
