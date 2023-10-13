package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.BoardVO;

public class BoardDAO extends DAO {
	private BoardVO mapper(ResultSet rs) throws SQLException {
		BoardVO row = new BoardVO();
		
		row.setContents(rs.getString("contents"));
		row.setIdx(rs.getInt("idx"));
		row.setImg_path(rs.getString("img_path"));
		row.setTitle(rs.getString("title"));
		row.setWrite_date(rs.getDate("write_date"));
		row.setWriter(rs.getString("writer"));
		
		return row;
	}
	
	public List<BoardVO> selectAll() {
		String sql = "select * from board order by idx desc";
		
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<BoardVO> list = new ArrayList<>();
			
			while (rs.next()) {
				list.add(mapper(rs));
			}
			
			return list;
			
		} catch(SQLException e) {
			System.out.println("selectAll 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return null;
	}

	public BoardVO selectOne(int idx) {
		String sql = "select * from board "
				+ "where idx = ?";
		
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

	public int insert(BoardVO args) {
		String sql = "insert into "
				+ "board(title, contents, writer, img_path) "
				+ "values(?, ?, ?, ?)";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, args.getTitle());
			pstmt.setString(2, args.getContents());
			pstmt.setString(3, args.getWriter());
			pstmt.setString(4, args.getImg_path());
			
			return pstmt.executeUpdate();
			
		} catch(SQLException e) {
			System.out.println("insert 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}
}
