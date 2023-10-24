package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.beans.AccountVO;
import com.itbank.components.SHA512;
import com.itbank.model.HomeDAO;

@Service
public class HomeService {
	
	// @는 하나만 적용된다
	@Autowired private HomeDAO dao;
	@Autowired private SHA512 hash;
	
	public String getTime() {
		return dao.time();
	}
	
	public List<AccountVO> getAccounts() {
		return dao.selectAll();
	}

	public AccountVO getAccount(int idx) {
		return dao.selectOne(idx);
	}

	public int write(AccountVO input) {
		String pw = hash.getHash(input.getUserpw());
		input.setUserpw(pw);
		
		return dao.insert(input);
	}

	public int update(AccountVO input) {
		String pw = hash.getHash(input.getUserpw());
		input.setUserpw(pw);
		
		return dao.update(input);
	}

	public int delete(int idx) {
		return dao.delete(idx);
	}
	
}
