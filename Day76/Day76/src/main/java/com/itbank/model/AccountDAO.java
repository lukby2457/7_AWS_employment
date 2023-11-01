package com.itbank.model;

import java.util.List;

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

}
