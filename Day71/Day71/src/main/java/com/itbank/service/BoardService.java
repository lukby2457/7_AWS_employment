package com.itbank.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.beans.BoardVO;
import com.itbank.model.BoardDAO;

@Service
public class BoardService {
	
	@Autowired
	private BoardDAO dao;

	public String getTest() {
		return dao.test();
	}

	public List<BoardVO> getBoards() {
		return dao.selectAll();
	}

	public BoardVO getBoard(int idx) {
		BoardVO row = dao.selectOne(idx);
		int view_count = row.getView_count();
		row.setView_count(view_count + 1);
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("view_count", view_count + 1);
		map.put("idx", idx);
		dao.updateView(map);
		
		return row;
		// return dao.selectOne(idx);
	}

	public int addBoard(BoardVO input) {
		return dao.insert(input);
	}

	public int updateBoard(BoardVO input) {
		return dao.updateBoard(input);
	}

	public int deleteBoard(int idx) {
		return dao.deleteBoard(idx);
	}
	
}
