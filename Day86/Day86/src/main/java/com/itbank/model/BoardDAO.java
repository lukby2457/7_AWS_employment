package com.itbank.model;

import java.util.List;

import com.itbank.model.vo.BoardVO;

public interface BoardDAO {

	List<BoardVO> selectAll();

	int insert(BoardVO input);

	int update(BoardVO input);

	int updateTitle(BoardVO input);

	int delete(BoardVO input);

	BoardVO selectOne(int idx);

}
