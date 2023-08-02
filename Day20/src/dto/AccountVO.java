package dto;

// desc 테이블명 - 위 명령어로 테이블 정보를 가져오면 다음에 보기 좋아진다
/*
	IDX       NOT NULL NUMBER      		pk, seq  
	USERID    NOT NULL VARCHAR2(20) 	uk
	USERPW    NOT NULL VARCHAR2(20)  
	NICK      NOT NULL VARCHAR2(100) 	uk
	EMAIL     NOT NULL VARCHAR2(100) 
	JOIN_DATE          DATE       		sysdate
 */

import java.sql.Date;

public class AccountVO {
	private int idx;
	private String userid, userpw;
	private String nick, email;
	private Date join_date;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getJoin_date() {
		return join_date;
	}
	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}
	
	@Override
		public String toString() {
			String format = "%d\t%s\t%s\t%s\t%s\t%s";
			format = String.format(format, idx, userid, userpw, nick, email, join_date);
			return format;
		}
}
