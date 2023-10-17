package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import beans.BoardVO;

public class BoardDAO extends DAO {
	private BoardVO mapper(ResultSet rs) throws SQLException {
		BoardVO row = new BoardVO();
		
		row.setContents(rs.getString("contents"));
		row.setIdx(rs.getInt("idx"));
		row.setTitle(rs.getString("title"));
		row.setView_count(rs.getInt("view_count"));
		row.setWrite_date(rs.getDate("write_date"));
		row.setWriter(rs.getString("writer"));
		
		return row;
	}

	public Map<String, Object> selectAll() {
		String sql = "select * from board " + 
						"order by idx desc " + 
						"offset 0 rows " + 
						"fetch first 10 rows only";
		
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			Map<String, Object> map = new HashMap<String, Object>();
			
			List<BoardVO> list = new ArrayList<BoardVO>();
			
			while(rs.next()) {
				list.add(mapper(rs));
			}
			
			map.put("list", list);
			
			return map;
			
		} catch (SQLException e) {
			System.out.println("selectAll 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return null;
	}

	public BoardVO selectOne(int idx) {
		String sql = "select * from board where idx = ?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, idx);
			
			rs = pstmt.executeQuery();
			
			rs.next();
			
			return mapper(rs);
			
		} catch (SQLException e) {
			System.out.println("selectOne 예외 : " + e.getMessage());
			
		} finally {
			close();
		}

		return null;
	}

	public int insert(BoardVO input) {
		String sql = "insert into "
						+ "board(title, writer, contents) "
						+ "values(?, ?, ?)";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, input.getTitle());
			pstmt.setString(2, input.getWriter());
			pstmt.setString(3, input.getContents());
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("insert 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}
}
