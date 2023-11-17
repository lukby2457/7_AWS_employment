package com.itbank.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.components.Paging;
import com.itbank.model.BoardDAO;
import com.itbank.model.vo.BoardVO;

@Service
public class BoardService {
	
	@Autowired private BoardDAO dao;

	public Map<String, Object> getBoards(int reqPage) {
		Paging p = new Paging(reqPage, dao.totalBoard());
		
		List<BoardVO> list = dao.selectAll(p);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("list", list);
		map.put("p", p);
		
		return map;
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
