package model;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.PersonDTO;

public class PersonDAO extends DAO {

	public List<PersonDTO> selectAll() {
		
		try {
			String sql = "select * from person";
			
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<PersonDTO> list = new ArrayList<PersonDTO>();
			
			while(rs.next()) {
				PersonDTO row = new PersonDTO();
				
				row.setBirth(rs.getDate("birth"));
				row.setHeight(rs.getDouble("height"));
				row.setName(rs.getString("name"));
				
				list.add(row);
			}
			
			return list;
			
		} catch (SQLException e) {
			System.err.println("selectAll 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return null;
	}

	
	public int insert(PersonDTO per) {
		
		try {
			String sql = "insert into person values(?, ?, ?)";
												//  1  2  3     순으로 센다
			
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, per.getName());
			pstmt.setDouble(2, per.getHeight());
			pstmt.setDate(3, per.getBirth());
			
			int row = pstmt.executeUpdate();
			
			return row;
			// ※ executeQuery() : 테이블의 결과를 반환. select 사용시, ResultSet으로 반환
			// ※ executeUpdate() : 실행 후 행 개수를 반환. insert, update, delete 사용시
			
		} catch (SQLException e) {
			System.err.println("insert 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return 0;
	}


	public int delete(String name) {

		try {
			String sql = "delete from person where name = ?";
			
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			
			int row = pstmt.executeUpdate();
			
			return row;
			
		} catch (SQLException e) {
			System.err.println("delete 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return 0;
	}


	public int update(PersonDTO per, String name) {

		try {
			String sql = "update person "
						+ "set name = ?, height = ?, birth = ? "
						+ "where name = ?";
			
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, per.getName());
			pstmt.setDouble(2, per.getHeight());
			pstmt.setDate(3, per.getBirth());
			pstmt.setString(4, name);
			
			int row = pstmt.executeUpdate();
			
			return row;
			
		} catch (SQLException e) {
			System.err.println("update 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return 0;
	}

}
