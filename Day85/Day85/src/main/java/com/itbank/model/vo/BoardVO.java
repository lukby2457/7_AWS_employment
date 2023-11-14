package com.itbank.model.vo;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/*
	IDX        NOT NULL NUMBER        
	TITLE      NOT NULL VARCHAR2(300) 
	CONTENTS   NOT NULL CLOB          
	WRITER     NOT NULL VARCHAR2(100) 
	VIEW_COUNT          NUMBER        
	WRITE_DATE          DATE       
 */

public class BoardVO {
	private int idx, view_count;
	private String title, contents, writer;
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "ko-kr")
	private Date write_date;
	
	public BoardVO() {}
	
	public BoardVO(int idx, int view_count, String title, String contents, String writer, Date write_date) {
		this.idx = idx;
		this.view_count = view_count;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.write_date = write_date;
	}
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getView_count() {
		return view_count;
	}
	public void setView_count(int view_count) {
		this.view_count = view_count;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getWrite_date() {
		return write_date;
	}
	public void setWrite_date(Date write_date) {
		this.write_date = write_date;
	}
	
}
