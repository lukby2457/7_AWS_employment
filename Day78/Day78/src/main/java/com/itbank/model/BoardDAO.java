package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.itbank.beans.BoardVO;

public interface BoardDAO {

	List<BoardVO> selectAll();

	@Select("select * from board where idx = #{idx}")
	BoardVO selectOne(int idx);

	int insert(BoardVO input);

}
