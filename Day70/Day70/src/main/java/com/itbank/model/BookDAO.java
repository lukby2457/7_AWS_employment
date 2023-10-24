package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.itbank.model.vo.BookVO;

public interface BookDAO {
	
	@Select("select banner from v$version")
	String test();

	@Select("select * from book order by idx desc")
	List<BookVO> selectAll();

	@Insert("insert into book "
			+ "values(#{idx}, #{title}, #{writer}, #{publisher}, #{p_date}, #{price})")
	int insert(BookVO input);

	@Delete("delete book where idx = #{idx}")
	int delete(int idx);

	@Select("select * from book where idx = #{idx}")
	BookVO selectOne(int idx);

	@Update("update book set "
			+ "title = #{title}, writer = #{writer}, publisher = #{publisher}, "
			+ "p_date = #{p_date}, price = #{price} "
			+ "where idx = #{idx}")
	int update(BookVO input);

	// mybatis 인터페이스의 메서드에는 매개변수를 1개만 세팅한다
	// - 따라서 여러 값을 보낼땐, vo 혹은  map을 사용한다
}
