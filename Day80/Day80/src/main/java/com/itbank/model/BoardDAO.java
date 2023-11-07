package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.itbank.components.Paging;
import com.itbank.model.vo.BoardVO;

public interface BoardDAO {
	
	@Select("select count(*) from board")
	int countAll();
	
	@Select("select to_char(sysdate, 'yyyy-mm-dd') from dual")
	String test();

	@Select("select * from board "
			+ "order by idx desc "
			+ "offset #{offset} rows "
			+ "fetch first #{perCount} rows only")
	List<BoardVO> selectAll(Paging p);

	@Insert("insert into board(contents) values('1')")
	void testInsert();

	@Select("select * from board where idx = #{idx}")
	BoardVO selectOne(int idx);

	@Insert("insert into "
			+ "board(title, writer, contents) "
			+ "values(#{title}, #{writer}, #{contents})")
	int insert(BoardVO input);

	@Select("select idx from board "
			+ "order by idx desc "
			+ "fetch first row only")
	int selectLastIdx();

}
