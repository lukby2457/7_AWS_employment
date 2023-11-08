package com.itbank.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itbank.model.AccountDAO;
import com.itbank.model.vo.AccountVO;

@Transactional	// 클래스에 지정시 모든 메서드에 적용되고
@Service
public class AccountService {
	
	@Autowired private AccountDAO dao;

	@Transactional(readOnly = true)		// 당연히 상세 설정이 우선시 됨
	public AccountVO login(AccountVO input, HttpSession session) {
		AccountVO user = dao.selectOne(input);
		
		if(user != null) {
			session.setAttribute("user", user);
		}
		
		return user;
	}

	public int signUp(AccountVO input) {
//		dao.signUp(input);
		// - 일부러 예외 발생을 위해 작성 (트랜잭션 디버깅용)
		
		return dao.signUp(input);
	}
	
}
