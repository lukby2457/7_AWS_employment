package com.itbank.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.beans.AccountVO;
import com.itbank.components.SHA512;
import com.itbank.model.AccountDAO;

@Service
public class AccountService {
	
	@Autowired private AccountDAO dao;
	@Autowired private SHA512 hash;

	public List<AccountVO> getAccounts() {
		return dao.selectAll();
	}

	public Map<String, Object> login(AccountVO input, HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		String msg = "입력 정보를 다시 확인해 주세요";
		int row = 0;
		
		input.setUserpw(hash.getHash(input.getUserpw()));
		
		input = dao.selectOne(input);
		
		if (input != null) {
			session.setAttribute("user", input);
			msg = input.getNick() + "님 로그인";
			row = 1;
		}
		
		map.put("msg", msg);
		map.put("row", row);
		
		return map;
	}

	public int signUp(AccountVO input) {
		input.setUserpw(hash.getHash(input.getUserpw()));
		
		return dao.insert(input);
	}

	public int signOut(int idx) {
		return dao.delete(idx);
	}

	public int change(AccountVO input) {
		input.setUserpw(hash.getHash(input.getUserpw()));
		
		return dao.update(input);
	}

	public String findId(String email) {
		List<String> ids = dao.findID(email);
		String result = "";
		
		for (String id : ids) {
			result += id + "\\n";
		}
		
		return result;
	}

	public String findPw(AccountVO input) {
		input = dao.selectAcc(input);
		String msg = "존재하지 않는 계정 정보";
		
		if (input != null) {
			msg = RandomStringUtils.randomAlphanumeric(8);
			
			input.setUserpw(hash.getHash(msg));
			dao.update(input);
		}
		
		return msg;
	}

}
