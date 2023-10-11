package beans;

import java.sql.Date;

/*
	IDX        NOT NULL NUMBER        
	BOARD_IDX  NOT NULL NUMBER        
	CONTENTS   NOT NULL CLOB          
	NICK       NOT NULL VARCHAR2(100) 
	WRITE_DATE          DATE
	
	추가)
	title 		게시글 제목
 */

public class ReplyVO {
	private int idx, board_idx;
	private String contents, nick;
	private Date write_date;
	private String title;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getBoard_idx() {
		return board_idx;
	}
	public void setBoard_idx(int board_idx) {
		this.board_idx = board_idx;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public Date getWrite_date() {
		return write_date;
	}
	public void setWrite_date(Date write_date) {
		this.write_date = write_date;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
