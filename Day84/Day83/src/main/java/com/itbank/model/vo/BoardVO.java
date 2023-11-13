package com.itbank.model.vo;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

/*
	IDX        NOT NULL NUMBER        
	TITLE      NOT NULL VARCHAR2(200) 
	CONTENTS   NOT NULL CLOB          
	WRITER     NOT NULL VARCHAR2(150) 
	WRITE_DATE          DATE          
	VIEW_COUNT          NUMBER        
	IMG                 VARCHAR2(300) 
 */

public class BoardVO {
	private int idx, view_count;
	private String title, contents;
	private String writer, img;
	private Date write_date;
	
	private MultipartFile imgFile;
	
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
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Date getWrite_date() {
		return write_date;
	}
	public void setWrite_date(Date write_date) {
		this.write_date = write_date;
	}
	public MultipartFile getImgFile() {
		return imgFile;
	}
	public void setImgFile(MultipartFile imgFile) {
		this.imgFile = imgFile;
	}
	
}
