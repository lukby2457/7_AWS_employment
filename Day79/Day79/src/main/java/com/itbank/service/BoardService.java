package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.beans.BoardVO;
import com.itbank.model.BoardDAO;

@Service
public class BoardService {
	
	@Autowired private BoardDAO dao;

	public List<BoardVO> getLists() {
		return dao.selectAll();
	}

	public BoardVO getList(int idx) {
		return dao.selectOne(idx);
	}

	public int addBoard(BoardVO input) {
		return dao.insert(input);
	}

	public Object updateBoard(BoardVO input) {
		return dao.update(input);
	}
	
	public int deleteBoard(int idx) {
		return dao.delete(idx);
	}
	
}
