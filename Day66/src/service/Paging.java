package service;

public class Paging {
	private int reqPage;		// 사용자가 요청한 페이지 (기능 부분)
	private int offset;			// 가져올 페이지의 시작점
	private int perBoard = 15;	// 한 페이지에 출력할 게시글의 수
	private int totalBoard;		// 총 게시글 수
	
	private int totalPage;		// 총 페이지 수 (사용자 편의 부분)
	private int perPage = 10;	// 한 화면에 출력할 페이지 번호 수 
	private int section;		// 페이지 범위를 구분할 index 번호 
	private int begin, end;		// section의 첫번째, 마지막 페이지 번호
	private boolean prev, next;	// 이전, 다음 버튼을 표시할 조건
	
	public Paging(int reqPage, int totalBoard) {
		this.reqPage = reqPage;
		this.totalBoard = totalBoard;
		
		offset = (reqPage - 1) * perBoard;					// perBoard만큼 게시글을 가져올 지점 계산 (기능 부분)
		
		totalPage = totalBoard / perBoard;					// 게시글 수 / 페이지 출력 게시글 수 (사용자 편의 부분)
		totalPage += (totalBoard % perBoard == 0) ? 0 : 1;	// 페이지 출력 게시글 수를 나누었을 때 나머지가 있으면 1추가
		
		section = (reqPage - 1) / perPage;					// 페이지 구분 번호 계산
		begin = section * perPage + 1;						// 구분번호 * 페이지 번호 + 1
		end = (section + 1) * perPage;						// (구분번호 + 1) * 페이지 번호
		end = (end > totalPage) ? totalPage : end;			// end가 페이지 번호보다 크면 페이지 번호를 출력하게 변경
		
		prev = section != 0;								// 첫 페이지 구분 번호이면 이전 버튼 필요x
		next = end != totalPage;							// 마지막 페이지가 아닐때까지 다음 버튼 필요
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
	public int getPerBoard() {
		return perBoard;
	}
	public void setPerBoard(int perBoard) {
		this.perBoard = perBoard;
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
