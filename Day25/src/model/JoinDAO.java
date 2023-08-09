package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.JoinVO;

public class JoinDAO extends DAO {

	public List<JoinVO> printStu() {
		
		try {
			String sql = "select A.idx as stu_num, A.name as stu_name, A.phone as stu_phone, "
						+ "B.name as dep_name, B.phone as dep_phone "
						+ "from student A inner join department B "
						+ "on A.dep_code = B.idx";
			
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<JoinVO> list = new ArrayList<JoinVO>();
			
			while(rs.next()) {
				JoinVO row = new JoinVO();
				
				row.setStu_num(rs.getInt("stu_num"));
				row.setStu_name(rs.getString("stu_name"));
				row.setStu_phone(rs.getString("stu_phone"));
				row.setDep_name(rs.getString("dep_name"));
				row.setDep_phone(rs.getString("dep_phone"));
				
				list.add(row);
			}
			
			return list;
			
		} catch (SQLException e) {
			System.err.println("printStu 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return null;
	}

	public List<JoinVO> printComStu() {
		try {
			String sql = "select A.idx as stu_num, A.name as stu_name, A.phone as stu_phone, "
						+ "B.name as dep_name, B.phone as dep_phone "
						+ "from student A inner join department B "
						+ "on A.dep_code = B.idx "
						+ "where B.name = '컴퓨터공학'";
			
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<JoinVO> list = new ArrayList<JoinVO>();
			
			while(rs.next()) {
				JoinVO row = new JoinVO();
				
				row.setStu_num(rs.getInt("stu_num"));
				row.setStu_name(rs.getString("stu_name"));
				row.setStu_phone(rs.getString("stu_phone"));
				row.setDep_name(rs.getString("dep_name"));
				row.setDep_phone(rs.getString("dep_phone"));
				
				list.add(row);
			}
			
			return list;
			
		} catch (SQLException e) {
			System.err.println("printComStu 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return null;
	}

	public List<JoinVO> printPro() {
		
		try {
			String sql = "select A.idx as pro_num, A.name as pro_name, A.phone as pro_phone, "
						+ "B.name as dep_name, B.phone as dep_phone "
						+ "from professor A inner join department B "
						+ "on A.dep_code = B.idx";
			
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs= stmt.executeQuery(sql);
			
			List<JoinVO> list = new ArrayList<JoinVO>();
			
			while(rs.next()) {
				JoinVO row = new JoinVO();
				
				row.setPro_num(rs.getInt("pro_num"));
				row.setPro_name(rs.getString("pro_name"));
				row.setPro_phone(rs.getString("pro_phone"));
				row.setDep_name(rs.getString("dep_name"));
				row.setDep_phone(rs.getString("dep_phone"));
				
				list.add(row);
			}
			
			return list;
			
		} catch (SQLException e) {
			System.err.println("printPro 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return null;
	}

	public List<JoinVO> printProStu() {
		
		try {
			String sql = "select A.idx as stu_num, A.name as stu_name, "
						+ "B.name as dep_name, C.name as pro_name "
						+ "from student A "
						+ "inner join department B on A.dep_code = b.idx "
						+ "inner join professor C on B.idx = C.dep_code";
			
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<JoinVO> list = new ArrayList<JoinVO>();
			
			while(rs.next()) {
				JoinVO row = new JoinVO();
				
				row.setStu_num(rs.getInt("stu_num"));
				row.setStu_name(rs.getString("stu_name"));
				row.setDep_name(rs.getString("dep_name"));
				row.setPro_name(rs.getString("pro_name"));
				
				list.add(row);
			}
			
			return list;
			
		} catch (SQLException e) {
			System.err.println("printProStu 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return null;
	}
	
}
