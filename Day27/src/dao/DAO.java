package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import org.apache.commons.dbcp2.BasicDataSource;

public class DAO {
	protected String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	protected String userName = "c##itbank";
	protected String password = "it";
	
	protected BasicDataSource ds;
	
	protected Connection conn;
	protected Statement stmt;
	protected PreparedStatement pstmt;
	protected CallableStatement cstmt;	// 프로시저 호출시 사용할 statement
	protected ResultSet rs;
	
	public DAO() {
		ds = new BasicDataSource();
		
		ds.setUrl(url);
		ds.setUsername(userName);
		ds.setPassword(password);
		
		close();
	}
	
	protected void close() {
		try {
			if(rs != null)		rs.close();
			if(cstmt != null)	cstmt.close();
			if(pstmt != null)	pstmt.close();
			if(stmt != null)	stmt.close();
			if(conn != null)	conn.close();
		} catch (SQLException e) {}
	}
	
	public String test() {
		try {
			String sql = "select banner from v$version";
			
			conn = ds.getConnection();
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

	public int proTest() {
		try {
			String sql = "{call test4(?, ?, ?)}";
			//						  1, 2, 3
			// 3번은 무조건 변수로 주어야 한다
			
			conn = ds.getConnection();
			cstmt = conn.prepareCall(sql);
			
			cstmt.setInt(1, 10);
			cstmt.setInt(2, 3);
			
			cstmt.registerOutParameter(3, Types.INTEGER);
			// out 매개변수로 지정
			
			cstmt.execute();
			// 지정한 프로시저를 실행
			
			int result = cstmt.getInt(3);
			// get자료형 형태로 가져온다
			
			return result;
			
		} catch (SQLException e) {
			System.err.println("proTest 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return 0;
	}
}
