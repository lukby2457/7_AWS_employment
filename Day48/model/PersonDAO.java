package model;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import dto.PersonVO;

public class PersonDAO extends DAO {
	private PersonVO mapper(ResultSet rs) throws SQLException {
		PersonVO row = new PersonVO();
		
		Date date = rs.getDate("birth");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		String birth = sdf.format(date);
		
		row.setBirth(birth);
		row.setHeight(rs.getDouble("height"));
		row.setName(rs.getString("name"));
		
		return row;
	}
	
	public List<PersonVO> selectAll() {
		String sql = "select * from person";
		try {
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<PersonVO> list = new ArrayList<PersonVO>();
			
			while(rs.next()) {
				PersonVO row = mapper(rs);
				
				list.add(row);
			}
			
			return list;
			
		} catch (SQLException e) {
			System.out.println("selectAll 예외 : " + e.getMessage());
		} finally {
			close();
		}
		return null;
	}
	
	public List<PersonVO> selectOne(String name) {
		String sql = "select * from person where name like '%" + name + "%'";
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<PersonVO> list = new ArrayList<PersonVO>();
			
			while(rs.next()) {
				PersonVO row = mapper(rs);
				
				list.add(row);
			}
			
			return list;
		} catch (SQLException e) {
			System.out.println("selectOne 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return null;
	}

	public int insert(PersonVO per) {
		String sql = "insert into person values(?, ?, ?)";
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			// stmt = conn.createStatement();
			
			// int row = stmt.executeUpdate(sql);
			
			// return row;
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, per.getName());
			pstmt.setDouble(2, per.getHeight());
			pstmt.setDate(3, per.getBirth());
			
			int row = pstmt.executeUpdate();
			
			return row;
			
		} catch (SQLException e) {
			System.out.println("insert 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return 0;
	}
	
	public int delete(String name) {
		String sql = "delete person where name = ?";
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			
			int row = pstmt.executeUpdate();
			
			return row;
			
		} catch (SQLException e) {
			System.out.println("delete 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return 0;
	}
	
	public int update(PersonVO per, String pname) {
		String sql = "update person set name = ?, height = ?, birth = ? where name = ?";
		try {
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, per.getName());
			pstmt.setDouble(2, per.getHeight());
			pstmt.setDate(3, per.getBirth());
			
			pstmt.setString(4, pname);
			
			int row = pstmt.executeUpdate();
			
			return row;
		} catch (SQLException e) {
			System.out.println("update 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return 0;
	}
}
