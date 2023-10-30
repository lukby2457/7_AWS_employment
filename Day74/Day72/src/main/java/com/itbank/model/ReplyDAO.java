package com.itbank.model;

import java.util.List;

import com.itbank.beans.ReplyVO;

public interface ReplyDAO {

	List<ReplyVO> selectReplyAll(int idx);
	
	int selectReplyCount(int idx);

	int insertReply(ReplyVO input);
	
}
