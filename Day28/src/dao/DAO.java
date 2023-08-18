package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp2.BasicDataSource;

import dto.EmpDTO;

public class DAO {
	protected String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	protected String userName = "c##itbank";
	protected String password = "it";
	
	protected BasicDataSource ds;
	
	protected Connection conn;
	protected Statement stmt;
	protected PreparedStatement pstmt;
	protected CallableStatement cstmt;
	protected ResultSet rs;
	
	public DAO() {
		ds = new BasicDataSource();
		
		ds.setUrl(url);
		ds.setUsername(userName);
		ds.setPassword(password);
		
		close();
	}

	private void close() {
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
			String sql = "select * from v$version";
			
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			rs.next();
			
			return rs.getString(2);
			
		} catch (SQLException e) {
			System.err.println("test 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return null;
	}
	
	public int sal_Up(int idx, int per) {
		try {
			String sql = "{call sal_up(?, ?, ?)";
			
			conn = ds.getConnection();
			cstmt = conn.prepareCall(sql);
			
			cstmt.setInt(1, idx);
			cstmt.setInt(2, per);
			
			cstmt.registerOutParameter(3, Types.INTEGER);
			
			cstmt.execute();
			
			int result = cstmt.getInt(3);
			
			return result;
			
		} catch (SQLException e) {
			System.err.println("sal_Up 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return 0;
	}
	
	public List<EmpDTO> selectAll() {
		try {
			String sql = "select idx, name, salary, department "
						+ "from employee";
			
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<EmpDTO> list = new ArrayList<EmpDTO>();
			
			while(rs.next()) {
				EmpDTO row = new EmpDTO();
				
				row.setDepartment(rs.getString("department"));
				row.setIdx(rs.getInt("idx"));
				row.setName(rs.getString("name"));
				row.setSalary(rs.getInt("salary"));
				
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
	
	public int abs(int num) {
		try {
			String sql = "select abso(?) from dual";
			
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			
			rs = pstmt.executeQuery();
			
			rs.next();
			
			return rs.getInt(1);
			
		} catch (SQLException e) {
			System.err.println("abs 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return 0;
	}
	
	public int abso(int num) {
		try {
			String sql = "{? = call abso(?)}";
			
			conn = ds.getConnection();
			cstmt = conn.prepareCall(sql);
			
			cstmt.setInt(2, num);
			cstmt.registerOutParameter(1, Types.INTEGER);
			cstmt.execute();
			
			int result = cstmt.getInt(1);
			
			return result;
			
		} catch (SQLException e) {
			System.err.println("abso 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return 0;
	}
	
	public int rev(int num) {
		try {
			String sql = "select rev(?) as reverse from dual";
			
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			rs = pstmt.executeQuery();
			
			rs.next();
			
			return rs.getInt("reverse");
			
		} catch (SQLException e) {
			System.err.println("rev 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return 0;
	}
	
	public int reve(int num) {
		try {
			String sql = "{? = call rev(?)}";
			
			conn = ds.getConnection();
			cstmt = conn.prepareCall(sql);
			
			cstmt.setInt(2, num);
			cstmt.registerOutParameter(1, Types.INTEGER);
			cstmt.execute();
			
			int result = cstmt.getInt(1);
			
			return result;
			
		} catch (SQLException e) {
			System.err.println("reve 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return 0;
	}
}
