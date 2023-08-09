package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp2.BasicDataSource;

public class DAO {
	protected String driver = "oracle.jdbc.driver.OracleDriver";
	protected String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	protected String userName = "c##test";
	protected String password = "1";
	
	protected BasicDataSource ds;
	
	protected Connection conn;
	protected Statement stmt;
	protected PreparedStatement pstmt;
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
			if(pstmt != null)	pstmt.close();
			if(stmt != null)	stmt.close();
			if(conn != null)	conn.close();
			
		} catch(Exception e) {}
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
}
