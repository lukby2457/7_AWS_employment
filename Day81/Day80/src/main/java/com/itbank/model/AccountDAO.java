package com.itbank.model;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.itbank.model.vo.AccountVO;

public interface AccountDAO {

	@Select("select * from account where userid = #{userid} and userpw = #{userpw}")
	AccountVO selectOne(AccountVO input);

	@Insert("insert into "
			+ "account(userid, userpw, nick, email) "
			+ "values(#{userid}, #{userpw}, #{nick}, #{email})")
	int signUp(AccountVO input);
	
}
