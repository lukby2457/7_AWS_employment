package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.itbank.model.vo.BookVO;

public interface BookDAO {

	@Select("select banner from v$version")
	String test();

	@Select("select * from book order by idx desc")
	List<BookVO> selectAll();

	@Select("select * from book where idx = #{idx}")
	BookVO selectOne(int idx);

	@Insert("insert into book "
			+ "values(#{idx}, #{title}, #{writer}, #{publisher}, #{p_date}, #{price})")
	int insert(BookVO input);
}
