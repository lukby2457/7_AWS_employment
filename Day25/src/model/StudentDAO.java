package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.StuJoinDepVO;

public class StudentDAO extends DAO {
	
	private StuJoinDepVO mapper(ResultSet rs) throws SQLException {
		StuJoinDepVO row = new StuJoinDepVO();
		
		row.setAddress(rs.getString("address"));
		row.setBirth(rs.getDate("birth"));
		row.setD_date(rs.getDate("d_date"));
		row.setDep_code(rs.getInt("dep_code"));
		row.setDep_email(rs.getString("dep_email"));
		row.setDep_name(rs.getString("dep_name"));
		row.setDep_phone(rs.getString("dep_phone"));
		row.setEmail(rs.getString("email"));
		row.setGender(rs.getString("gender"));
		row.setGrade(rs.getInt("grade"));
		row.setIdx(rs.getInt("idx"));
		row.setName(rs.getString("name"));
		row.setPhone(rs.getString("phone"));
		
		return row;
	}
	
	public List<StuJoinDepVO> selectSJD(boolean where) {
		// join은 view를 만들어서 처리하는 것이 왠만하면 좋다
		String sql = "select A.*, B.name as dep_name, B.d_date, "
					+ "B.phone as dep_phone, B.email as dep_email "
					+ "from student A inner join department B "
					+ "on A.dep_code = b.idx";
		
		if(where) {
			sql += " where B.name = '컴퓨터공학'";
		}
		
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<StuJoinDepVO> list = new ArrayList<StuJoinDepVO>();
			
			while(rs.next()) {
				list.add(mapper(rs));
			}
			
			return list;
			
		} catch (SQLException e) {
			System.err.println("selectSJD 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return null;
	}

}
