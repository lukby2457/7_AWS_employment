package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dto.AccountVO;

public class AccountDAO {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private String user = "c##itbank";
	private String password = "it";
	
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public AccountDAO() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.err.println("생성자 예외 : " + e.getMessage());
		}
	}
	
	private void close() {
		try {
			if(rs != null)		rs.close();
			if(pstmt != null)	pstmt.close();
			if(stmt != null)	stmt.close();
			if(conn != null)	conn.close();
		} catch (SQLException e) {}
	}
	
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

	public String test() {
		
		try {
			String sql = "select banner from v$version";
			
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			rs.next();
			
			return rs.getString("banner");
			
		} catch (SQLException e) {
			System.err.println("test 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return null;
	}
	
	public List<AccountVO> selectAll() {
		
		try {
			String sql = "select * from account order by idx desc";
			
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<AccountVO> list = new ArrayList<AccountVO>();
			
			while(rs.next()) {
				AccountVO row = mapper(rs);
				
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

	public int insert(AccountVO acc) {
		
		try {
			String sql = "insert into "
						+ "account(userid, userpw, nick, email) "
						+ "values(?, ?, ?, ?)";
			
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, acc.getUserid());
			pstmt.setString(2, acc.getUserpw());
			pstmt.setString(3, acc.getNick());
			pstmt.setString(4, acc.getEmail());
			
			int row = pstmt.executeUpdate();
			
			return row;
			
		} catch (SQLException e) {
			System.err.println("insert 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return 0;
	}

	public int delete(int idx) {
		
		try {
			String sql = "delete from account where idx = ?";
			
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, idx);
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.err.println("delete 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return 0;
	}

	public int update(AccountVO acc, int idx) {
		
		try {
			String sql = "update account " + 
							"set " + 
								"userid = ?, " +
								"userpw = ?, " +
								"nick = ?, " + 
								"email = ? " + 
							"where idx = ?";
			
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, acc.getUserid());
			pstmt.setString(2, acc.getUserpw());
			pstmt.setString(3, acc.getNick());
			pstmt.setString(4, acc.getEmail());
			pstmt.setInt(5, idx);
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.err.println("update 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return 0;
	}

	public List<AccountVO> selectOne(int idx) {
		
		try {
			String sql = "select * from account where idx = ?";
			
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			
			rs = pstmt.executeQuery();
			
			List<AccountVO> list = new ArrayList<AccountVO>();
			
			rs.next();
			
			AccountVO row = mapper(rs);
			
			list.add(row);
			
			return list;
			
		} catch (SQLException e) {
			System.err.println("selectOne 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return null;
	}

}
