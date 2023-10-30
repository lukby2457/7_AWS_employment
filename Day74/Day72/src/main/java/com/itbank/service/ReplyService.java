package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.beans.ReplyVO;
import com.itbank.model.ReplyDAO;

@Service
public class ReplyService {
	
	@Autowired 
	private ReplyDAO dao;

	public List<ReplyVO> getReply(int idx) {
		return dao.selectReplyAll(idx);
	}
	
	public int getReplyCount(int idx) {
		return dao.selectReplyCount(idx);
	}

	public int addReply(ReplyVO input) {
		return dao.insertReply(input);
	}

}
