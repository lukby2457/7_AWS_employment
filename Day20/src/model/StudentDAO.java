package model;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.StudentVO;

public class StudentDAO extends DAO {

	public List<StudentVO> selectAll() {
		
		try {
			String sql = "select * from test_stu_view";
			
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<StudentVO> list = new ArrayList<StudentVO>();
			
			while(rs.next()) {	// mapping : DB에 있는 정보를 Java에 연결시킨다
				StudentVO row = new StudentVO();
				
				row.setEng(rs.getInt("eng"));
				row.setKor(rs.getInt("kor"));
				row.setMat(rs.getInt("mat"));
				row.setName(rs.getString("name"));
				row.setTotal(rs.getInt("total"));
				row.setAvg(rs.getDouble("avg"));
				
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
	
	public List<StudentVO> selectAllView() {
		return null;
	}
	
}
