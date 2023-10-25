package com.itbank.model;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.itbank.beans.BoardVO;

public interface BoardDAO {

	String test();

//	@Select("select * from board "
//			+ "order by idx desc "
//			+ "offset 0 rows "
//			+ "fetch next 10 rows only")
	List<BoardVO> selectAll();

//	@Select("select * from board where idx = #{idx}")
	BoardVO selectOne(int idx);

//	@Update("insert into "
//			+ "board(title, writer, contents) "
//			+ "values(#{title}, #{writer}, #{contents})")
	int insert(BoardVO input);

//	@Update("update board set "
//				+ "title = #{title}, contents = #{contents}, writer = #{writer} "
//			+ "where idx = #{idx}")
	int updateBoard(BoardVO input);

//	@Update("delete board where idx = #{idx}")
	int deleteBoard(int idx);

	@Update("update board set "
			+ "view_count = #{view_count} where idx = #{idx}")
	int updateView(Map<String, Integer> map);

}
