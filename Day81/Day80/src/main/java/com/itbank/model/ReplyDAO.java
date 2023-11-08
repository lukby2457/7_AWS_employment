package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.itbank.model.vo.ReplyVO;

public interface ReplyDAO {
	
	@Select("select * from reply where board_idx = #{idx} order by idx desc")
	List<ReplyVO> selectAll(int idx);

}
