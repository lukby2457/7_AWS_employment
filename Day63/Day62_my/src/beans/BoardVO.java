package beans;

import java.sql.Date;

/*
	IDX        NOT NULL NUMBER        
	TITLE      NOT NULL VARCHAR2(200) 
	CONTENTS            CLOB          
	WRITER     NOT NULL VARCHAR2(100) 
	WRITE_DATE          DATE          
	IMG_PATH            CLOB   
 */

public class BoardVO {
	private int idx;
	private String title, contents, writer;
	private Date write_date;
	private String img_path;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
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
	public String getImg_path() {
		return img_path;
	}
	public void setImg_path(String img_path) {
		this.img_path = img_path;
	}
}
