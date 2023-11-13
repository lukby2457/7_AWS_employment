package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.itbank.model.vo.BoardVO;

public interface BoardDAO {

	@Select("select * from img_board order by idx desc")
	List<BoardVO> selectAll();

	@Select("select * from img_board where idx = #{idx}")
	BoardVO selectOne(int idx);

	@Select("select idx from img_board order by idx desc fetch first rows only")
	Integer selectIdx();
	
	@Insert("insert into "
			+ "img_board(title, contents, writer, img) "
			+ "values(#{title}, #{contents}, #{writer}, #{img})")
	int insert(BoardVO input);

	@Delete("delete img_board where idx = #{idx}")
	int delete(int idx);

	@Update("update img_board set "
				+ "title = #{title}, "
				+ "contents = #{contents}, "
				+ "writer = #{writer}, "
				+ "img = #{img} "
			+ "where idx = #{idx}")
	int update(BoardVO input);


}
