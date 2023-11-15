package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.BoardDAO;
import com.itbank.model.vo.BoardVO;

@Service
public class BoardService {
	
	@Autowired private BoardDAO dao;

	public List<BoardVO> getBoards(int reqPage) {
		// 여기에 Paging 코드 작성
		
		return dao.selectAll();
	}

	public int insertBoard(BoardVO input) {
		return dao.insert(input);
	}

	public int updateBoard(BoardVO input) {
		return dao.update(input);
	}

	public int updateTitle(BoardVO input) {
		return dao.updateTitle(input);
	}

	public int deleteBoard(BoardVO input) {
		return dao.delete(input);
	}

	public BoardVO getBoard(int idx) {
		return dao.selectOne(idx);
	}
	
}
