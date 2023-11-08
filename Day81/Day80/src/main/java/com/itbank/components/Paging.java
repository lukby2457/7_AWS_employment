package com.itbank.components;

public class Paging {
	private int reqPage;				// 요청 페이지
	private int offset; 				// 게시글 시작점
	private int perCount = 15;			// 페이지당 글 개수
	private int totalBoard;				// 총 게시글 수	
	private int totalPage;				// 총 페이지 수
	private int perPage = 10;			// 화면에 출력할 페이지 번호 수
	private int section;				// 페이지 번호 영역
	private int begin, end;				// 영역 첫, 끝 번호
	private boolean prev, next;			// 이전, 다음 버튼 표시 여부
	
	public Paging(int reqPage, int totalBoard) {
		this.reqPage = reqPage;
		this.totalBoard = totalBoard;
		
		offset = (reqPage - 1) * perCount;
		
		totalPage = totalBoard / perCount;
		totalPage += (totalBoard % perCount == 0) ? 0 : 1;
		
		section = (reqPage - 1) / perPage;
		
		begin = section * perPage + 1;
		
		end = (section + 1) * perPage;
		end = (end > totalPage) ? totalPage : end;
		
		prev = (section != 0);
		next = (end != totalPage);
	}
	
	public int getReqPage() {
		return reqPage;
	}
	public void setReqPage(int reqPage) {
		this.reqPage = reqPage;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public int getPerCount() {
		return perCount;
	}
	public void setPerCount(int perCount) {
		this.perCount = perCount;
	}
	public int getTotalBoard() {
		return totalBoard;
	}
	public void setTotalBoard(int totalBoard) {
		this.totalBoard = totalBoard;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getPerPage() {
		return perPage;
	}
	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}
	public int getSection() {
		return section;
	}
	public void setSection(int section) {
		this.section = section;
	}
	public int getBegin() {
		return begin;
	}
	public void setBegin(int begin) {
		this.begin = begin;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public boolean getPrev() {
		return prev;
	}
	public void setPrev(boolean prev) {
		this.prev = prev;
	}
	public boolean getNext() {
		return next;
	}
	public void setNext(boolean next) {
		this.next = next;
	}
	
}
