package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.beans.AccountVO;
import com.itbank.model.AccountDAO;

@Service
public class AccountService {
	
	@Autowired private AccountDAO dao;

	public List<AccountVO> getAccounts() {
		return dao.selectAll();
	}

	public AccountVO login(AccountVO input) {
		return dao.selectOne(input);
	}

}
