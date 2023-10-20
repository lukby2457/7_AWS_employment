package com.itbank.model;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.itbank.model.VO.DepartmentVO;
import com.itbank.model.VO.PersonVO;

@Repository	// 저장소 관련 (DB)을 처리하는 Spring Bean
public class Ex04DAO {

	@Autowired
	private JdbcTemplate jt;
	
	public String banner() {
		String sql = "select banner from v$version";
		return jt.queryForObject(sql, String.class);	// 1개 호출
	}

	public List<PersonVO> selectAll() {
		String sql = "select * from person";
		
		RowMapper<PersonVO> rowMapper = (ResultSet rs, int rowNum) -> {
			PersonVO row = new PersonVO();
			
			row.setBirth(rs.getDate("birth"));
			row.setHeight(rs.getDouble("height"));
			row.setName(rs.getString("name"));
			
			return row;
		};									// jdbc.core
		
		return jt.query(sql, rowMapper);	// sql, rowMapper
	}

	public List<DepartmentVO> selectDeptAll() {
		String sql = "select * from department";
		
		RowMapper<DepartmentVO> rowMapper = (ResultSet rs, int rowNum) -> {
			DepartmentVO row = new DepartmentVO();
			
			row.setDep_create(rs.getDate("dep_create"));
			row.setEmail(rs.getString("email"));
			row.setIdx(rs.getInt("idx"));
			row.setName(rs.getString("name"));
			row.setPhone(rs.getString("phone"));
			
			return row;
		};
		
		return jt.query(sql, rowMapper);
	}
	
}
