package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.itbank.beans.AccountVO;

public interface AccountDAO {

	@Select("select to_char(sysdate, 'yyyy-mm-dd') from dual")
	String test();
	
	@Select("select * from account where idx = #{idx}")
	AccountVO test1(int idx);
	
	@Select("select * from account order by idx desc")
	List<AccountVO> selectAll();

	@Select("select * from account where userid = #{userid} and userpw = #{userpw}")
	AccountVO selectOne(AccountVO input);

	int insert(AccountVO input);

	@Delete("delete account where idx = #{idx}")
	int delete(int idx);

	int update(AccountVO input);

	@Select("select userid from account where email = #{email}")
	String findID(String email);

}
