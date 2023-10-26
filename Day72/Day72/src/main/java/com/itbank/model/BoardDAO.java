package com.itbank.model;

import java.util.List;
import java.util.Map;

import com.itbank.beans.BoardVO;
import com.itbank.components.Paging;

public interface BoardDAO {

	String test();

	List<BoardVO> selectAll(Paging p);

	BoardVO selectOne(int idx);

	int insert(BoardVO input);

	int update(BoardVO input);

	int delete(int idx);

	int updateView(Map<String, Integer> map);

	int getTotalBoard();

}
