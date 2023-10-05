package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.ReplyVO;

public class ReplyDAO extends DAO {
	public List<ReplyVO> selectReplyAll(int idx) {
		String sql = "select * from reply where board_idx = ? order by idx desc";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, idx);
			
			rs = pstmt.executeQuery();
			
			List<ReplyVO> list = new ArrayList<ReplyVO>();
			
			while(rs.next()) {
				ReplyVO row = new ReplyVO();
				
				row.setBoard_idx(rs.getInt("board_idx"));
				row.setContents(rs.getString("contents"));
				row.setIdx(rs.getInt("idx"));
				row.setNick(rs.getString("nick"));
				row.setWrite_date(rs.getDate("write_date"));
				
				list.add(row);
			}
			
			return list;
			
		} catch (SQLException e) {
			System.out.println("selectReplyAll 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return null;
	}
	
	public int insert(ReplyVO input) {
		String sql = "insert into " + 
						"reply(board_idx, contents, nick) " + 
						"values(?, ?, ?)";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, input.getBoard_idx());
			pstmt.setString(2, input.getContents());
			pstmt.setString(3, input.getNick());
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("insert 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}
	
	public int delete(int idx) {
		String sql = "delete reply where idx = ?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, idx);
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("delete 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}
}
