package com.itbank.model;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.itbank.beans.AccountVO;

@Repository
public class HomeDAO {

	@Autowired
	private JdbcTemplate jt;
	
	private RowMapper<AccountVO> rowMapper = (ResultSet rs, int rowNum) -> {
		AccountVO row = new AccountVO();
		
		row.setEmail(rs.getString("email"));
		row.setIdx(rs.getInt("idx"));
		row.setJoin_date(rs.getDate("join_date"));
		row.setNick(rs.getString("nick"));
		row.setUserid(rs.getString("userid"));
		row.setUserpw(rs.getString("userpw"));
		
		return row;
	};
	
	public String time() {
		String sql = "select to_char(sysdate, 'yyyy-mm-dd') as time from dual";
		return jt.queryForObject(sql, String.class);
	}
	
	public List<AccountVO> selectAll() {
		String sql = "select * from account order by idx desc";
		return jt.query(sql, rowMapper);
		// query() :  복수 행 조회
	}

	public AccountVO selectOne(int idx) {
		String sql = "select * from account where idx = ?";
		return jt.queryForObject(sql, rowMapper, idx);
		// queryForObject() :  단건 행 조회
	}

	public int insert(AccountVO input) {
		String sql = "insert into "
					+ "account(userid, userpw, nick, email)"
					+ "values(?, ?, ?, ?)";
		return jt.update(sql, 
				input.getUserid(), input.getUserpw(), 
				input.getNick(), input.getEmail());
		// update() : 테이블에 행 삽입/삭제/수정을 수행
	}

	public int update(AccountVO input) {
		String sql = "update account "
					+ "set "
						+ "userid = ?, userpw = ?, nick = ?, email = ? "
					+ "where idx = ?";
		return jt.update(sql, 
				input.getUserid(), input.getUserpw(),
				input.getNick(), input.getEmail(), input.getIdx());
	}

	public int delete(int idx) {
		String sql = "delete account where idx = ?";
		return jt.update(sql, idx);
	}
	
}
