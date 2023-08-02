package model;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.PersonVO;

public class PersonDAO extends DAO {
	
	public List<PersonVO> selectAll() {
		
		try {
			String sql = "select * from person";
			
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<PersonVO> list = new ArrayList<PersonVO>();
			
			while (rs.next()) {
				PersonVO row = new PersonVO();
				
				row.name = rs.getString("name");
				row.height = rs.getDouble("height");
				row.birth = rs.getDate("birth");
				
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
}
