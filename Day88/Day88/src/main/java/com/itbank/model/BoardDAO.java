package com.itbank.model;

import java.util.List;

import com.itbank.components.Paging;
import com.itbank.model.vo.BoardVO;

public interface BoardDAO {

	List<BoardVO> selectAll(Paging p);

	int insert(BoardVO input);

	int update(BoardVO input);

	int updateTitle(BoardVO input);

	int delete(BoardVO input);

	BoardVO selectOne(int idx);

	int totalBoard();

}
