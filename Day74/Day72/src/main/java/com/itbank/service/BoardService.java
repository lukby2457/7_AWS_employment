package com.itbank.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.beans.BoardVO;
import com.itbank.components.Paging;
import com.itbank.model.BoardDAO;

@Service
public class BoardService {
	
	@Autowired
	private BoardDAO dao;
	
	@Autowired
	private Paging p;

	public String getTest() {
		return dao.test();
	}

	public Map<String, Object> getBoards(Integer page) {
		Map<String, Object> map = new HashMap<String, Object>();
		
		if(page == null) {page = 1;}
		
		int totalBoard = dao.getTotalBoard();
		p = new Paging(page, totalBoard);
		
		map.put("paging", p);
		map.put("list", dao.selectAll(p));
		return map;
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
	}

	public int addBoard(BoardVO input) {
		return dao.insert(input);
	}

	public int updateBoard(BoardVO input) {
		return dao.update(input);
	}

	public int deleteBoard(int idx) {
		return dao.delete(idx);
	}
	
}
