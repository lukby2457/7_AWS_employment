package model;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.AccountVO;

public class AccountDAO extends DAO {
	private AccountVO mapper(ResultSet rs) throws SQLException {
		AccountVO row = new AccountVO();
		
		row.setEmail(rs.getString("email"));
		row.setIdx(rs.getInt("idx"));
		row.setJoin_date(rs.getDate("join_date"));
		row.setNick(rs.getString("nick"));
		row.setUserid(rs.getString("userid"));
		row.setUserpw(rs.getString("userpw"));
		
		return row;
	}
	
	public List<AccountVO> selectAll() {
		String sql = "select * from account order by idx desc";
		try {
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<AccountVO> list = new ArrayList<AccountVO>();
			
			while(rs.next()) {
				list.add(mapper(rs));
			}
			
			return list;
			
		} catch (SQLException e) {
			System.out.println("selectAll 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return null;
	}
	
	public AccountVO selectOne(AccountVO input) {
		String sql = "select * from account where userid = ? and userpw = ?";
		try {
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, input.getUserid());	// set자료형(index, 데이터);
			pstmt.setString(2, input.getUserpw()); 	// index는 1부터 시작한다
			
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
	
	public int insert(AccountVO input) {
		String sql = "insert into "
						+ "account(userid, userpw, nick, email) "
						+ "values(?, ?, ?, ?)";
		try {
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, input.getUserid());
			pstmt.setString(2, input.getUserpw());
			pstmt.setString(3, input.getNick());
			pstmt.setString(4, input.getEmail());
			
			int row = pstmt.executeUpdate();
			
			return row;
			
		} catch (SQLException e) {
			System.out.println("insert 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return 0;
	}
	
	public int delete(int idx) {
		String sql = "delete account where idx = ?";
		try {
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, idx);
			
			int row = pstmt.executeUpdate();
			
			return row;
			
		} catch (SQLException e) {
			System.out.println("delete 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return 0;
	}
	
	public int update(AccountVO input) {
		String sql = "update account " + 
						"set " + 
							"userpw = ?, " + 
							"nick = ?, " + 
							"email = ? " + 
						"where idx = ?";
		try {
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, input.getUserpw());
			pstmt.setString(2, input.getNick());
			pstmt.setString(3, input.getEmail());
			
			pstmt.setInt(4, input.getIdx());
			
			int row = pstmt.executeUpdate();
			
			return row;
			
		} catch (SQLException e) {
			System.out.println("update 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return 0;
	}
}
