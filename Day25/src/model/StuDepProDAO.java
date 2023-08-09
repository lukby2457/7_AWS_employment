package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// view를 참조할 DAO (※ 테이블과 동일)
public class StuDepProDAO extends DAO {
	
	public List<Map<String, Object>> selectAll() {
		String sql = "select idx, name, dep_name, pro_name from stu_dep_pro";
		
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<Map<String, Object>> list = new ArrayList<>();
			
			while(rs.next()) {
				Map<String, Object> row = new HashMap<>();
				
				row.put("idx", rs.getInt("idx"));
				row.put("name", rs.getString("name"));
				row.put("dep_name", rs.getString("dep_name"));
				row.put("pro_name", rs.getString("pro_name"));
				
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
