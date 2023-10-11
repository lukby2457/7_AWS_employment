package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import beans.BoardVO;
import beans.RecommendVO;
import beans.ReplyVO;
import service.Paging;

public class BoardDAO extends DAO {
	private BoardVO mapper(ResultSet rs) throws SQLException {
		BoardVO row = new BoardVO();
		
		row.setContents(rs.getString("contents"));
		row.setIdx(rs.getInt("idx"));
		row.setTitle(rs.getString("title"));
		row.setView_count(rs.getInt("view_count"));
		row.setWrite_date(rs.getDate("write_date"));
		row.setWriter(rs.getString("writer"));
		row.setCnt(rs.getInt("cnt"));
		
		return row;
	}
	
	private int getTotalBoard(String type, String search) {
		String sql = "select count(*) as count from board "
					+ "where " + type + " like '%" + search + "%'";
		
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			rs.next();
			
			return rs.getInt("count");
			
		} catch (SQLException e) {
			System.out.println("getTotalBoard 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}
	
	public Map<String, Object> selectAll(int reqPage, String type, String search, String order) {
		int totalBoard = getTotalBoard(type, search);
		
		Paging p = new Paging(reqPage, totalBoard);	
//		System.out.println(totalBoard + ", " + totalPage);
		
		String sql = "select * from boardview " + 
						"where " + type + " like '%" + search + "%' " + 
						"order by " + order + " desc " + 
						"offset ? rows " + 
						"fetch first ? rows only";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, p.getOffset());
			pstmt.setInt(2, p.getPerBoard());
			
			rs = pstmt.executeQuery();
			
			List<BoardVO> list = new ArrayList<BoardVO>();
			
			while(rs.next()) {
				list.add(mapper(rs));
			}
			
			List<Integer> plistInt = new ArrayList<>();
			plistInt.add(p.getBegin());
			plistInt.add(p.getEnd());
			
			List<Boolean> plistBo = new ArrayList<>();
			plistBo.add(p.getPrev());
			plistBo.add(p.getNext());
			
			Map<String, Object> result = new HashMap<String, Object>();
			result.put("list", list);
			result.put("paging", p);
			
			return result;
			
		} catch (SQLException e) {
			System.out.println("selectAll 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return null;
	}
	
	public Map<String, Object> selectOne(int idx) {
		String sql = "select * from boardview "
					+ "where idx = ?";
		
		ReplyDAO rdao = new ReplyDAO();
		
		List<ReplyVO> rps = rdao.selectReplyAll(idx);
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, idx);
			
			rs = pstmt.executeQuery();
			
			rs.next();
			
			result.put("board", mapper(rs));
			result.put("rps", rps);
				
			return result;
			
		} catch (SQLException e) {
			System.out.println("selectOne 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return null;
	}
	
	public int delete(int idx) {
		String sql = "delete board where idx = ?";
		
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
	
	public int insert(BoardVO input) {
		String sql = "insert into "
						+ "board(title, contents, writer) "
						+ "values(?, ?, ?)";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, input.getTitle());
			pstmt.setString(2, input.getContents());
			pstmt.setString(3, input.getWriter());
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("insert 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		
		return 0;
	}
	
	public int update(BoardVO input) {
		String sql = "update board "
						+ "set title = ?, contents = ? "
						+ "where idx = ?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, input.getTitle());
			pstmt.setString(2, input.getContents());
			pstmt.setInt(3, input.getIdx());
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("update 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}
	
	public int update_view(int idx, int view_count) {
		String sql = "update board "
						+ "set view_count = ? "
						+ "where idx = ?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, view_count);
			pstmt.setInt(2, idx);
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("update_view 예외  : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}
	
	public List<BoardVO> search(String type, String search) {
		String sql = "select * from board "
					+ "where " + type + " like '%" + search + "%' "
					+ "order by idx desc";
		
//		System.out.println(sql);
		
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<BoardVO> list = new ArrayList<BoardVO>();
			
			while(rs.next()) {
				list.add(mapper(rs));
			}
			
			return list;
			
		} catch (SQLException e) {
			System.out.println("search 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return null;
	}
	
	public int isChecked(String nick, int idx) {
		String sql = "select good from recommend where board_idx = ? and nick = ?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, idx);
			pstmt.setString(2, nick);
			
			rs = pstmt.executeQuery();
			
			rs.next();
			
			return rs.getInt("good");
			
		} catch (SQLException e) {
//			System.out.println("isChecked 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}
	
	public int getGood(int idx, int good) {
		String sql = "select count(*) as cnt from recommend " + 
						"where board_idx = ? and good = ?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, idx);
			pstmt.setInt(2, good);
			
			rs = pstmt.executeQuery();
			
			rs.next();
			
			return rs.getInt("cnt");
			
		} catch (SQLException e) {
			System.out.println("getGood 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}
	
	public int getBad(int idx, int good) {
		String sql = "select count(*) as cnt from recommend " + 
						"where board_idx = ? and good = ?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, idx);
			pstmt.setInt(2, good);
			
			rs = pstmt.executeQuery();
			
			rs.next();
			
			return rs.getInt("cnt");
			
		} catch (SQLException e) {
			System.out.println("getGood 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}
	
	public int recInsert(RecommendVO input) {
		String sql = "insert into recommend values(?, ?, ?)";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, input.getBoard_idx());
			pstmt.setString(2, input.getNick());
			pstmt.setInt(3, input.getGood());
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("recInsert 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}
	
	public int recDelete(RecommendVO input) {
		String sql = "delete recommend "
						+ "where board_idx = ? and nick = ?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, input.getBoard_idx());
			pstmt.setString(2, input.getNick());
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("recDelete 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}
	
	public int recUpdate(RecommendVO input) {
		String sql = "update recommend "
						+ "set good = ? "
						+ "where board_idx = ? and nick = ?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, input.getGood());
			pstmt.setInt(2, input.getBoard_idx());
			pstmt.setString(3, input.getNick());
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("recUpdate 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}
}
