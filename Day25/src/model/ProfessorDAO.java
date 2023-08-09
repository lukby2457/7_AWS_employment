package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// sql 한 줄을 map으로 받는다
// map의 줄들을 list로 묶어서 처리한다

public class ProfessorDAO extends DAO {
	
	public List<Map<String, Object>> selectPJD() {
		
		String sql = "select A.idx, A.name, A.phone, "
					+ "B.name as dep_name, B.phone as dep_phone "
					+ "from professor A inner join department B "
					+ "on A.dep_code = b.idx";
		
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<Map<String, Object>> list = new ArrayList<>();
			
			while(rs.next()) {
				Map<String, Object> row = new HashMap<>();
				
				row.put("idx", rs.getInt("idx"));
				row.put("name", rs.getString("name"));
				row.put("phone", rs.getString("phone"));
				row.put("dep_name", rs.getString("dep_name"));
				row.put("dep_phone", rs.getString("dep_phone"));
				
				list.add(row);
			}
			
			return list;
			
		} catch (SQLException e) {
			System.err.println("selectPJD 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return null;
	}
}
