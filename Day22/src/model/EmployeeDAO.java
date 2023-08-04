package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dto.EmployeeDTO;
import dto.EmployeeExDTO;

public class EmployeeDAO {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private String user = "c##itbank";
	private String password = "it";

	private Connection conn;
	private Statement stmt;
	private ResultSet rs;

	public EmployeeDAO() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.err.println("생성자 예외 : " + e.getMessage());
		}
	}

	private void close() {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();

		} catch (Exception e) {
		}
	}

	private EmployeeDTO mapper(ResultSet rs) throws SQLException {
		EmployeeDTO row = new EmployeeDTO();

		row.setBirth(rs.getDate("birth"));
		row.setDep_create(rs.getDate("dep_create"));
		row.setDep_email(rs.getString("dep_email"));
		row.setDep_phone(rs.getString("dep_phone"));
		row.setDepartment(rs.getString("department"));
		row.setEmail(rs.getString("email"));
		row.setGender(rs.getString("gender"));
		row.setH_date(rs.getDate("h_date"));
		row.setIdx(rs.getInt("idx"));
		row.setName(rs.getString("name"));
		row.setPhone(rs.getString("phone"));
		row.setPosition(rs.getString("position"));
		row.setSalary(rs.getInt("salary"));

		return row;
	}

	public List<EmployeeDTO> selectAll() {

		try {
			String sql = "select * from employee order by idx desc";

			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			List<EmployeeDTO> list = new ArrayList<EmployeeDTO>();

			while (rs.next()) {
				EmployeeDTO row = mapper(rs);

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
	
	public int totalRow() {
		
		try {
			String sql = "select count(*) as rc from employee";
			
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			rs.next();
			
			return rs.getInt("rc");
			
		} catch (SQLException e) {
			System.err.println("totalRow 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return 0;
	}
	
	public EmployeeExDTO summary() {
		
		try {
			String sql = "select sum(salary) as sum, max(salary) as max, "
						+ "min(salary) as min from employee";
			
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			rs.next();
			
			EmployeeExDTO row = new EmployeeExDTO();
			
			row.setSum(rs.getInt("sum"));
			row.setMax(rs.getInt("max"));
			row.setMin(rs.getInt("min"));
			
			return row;
			
		} catch (SQLException e) {
			System.err.println("summary() 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return null;
	}

	public List<EmployeeExDTO> selectPosition() {
		
		try {
			String sql = "select position, sum(salary) as sum, "
						+ "max(salary) as max, min(salary) as min "
						+ "from employee group by position "
						+ "order by sum(salary) desc";
			
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<EmployeeExDTO> list = new ArrayList<EmployeeExDTO>();
			
			while(rs.next()) {
				EmployeeExDTO row = new EmployeeExDTO();
				
				row.setPosition(rs.getString("position"));
				row.setSum(rs.getInt("sum"));
				row.setMax(rs.getInt("max"));
				row.setMin(rs.getInt("min"));
				
				list.add(row);
			}
			
			return list;
			
		} catch (SQLException e) {
			System.err.println("selectPosition() 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return null;
	}

	public List<EmployeeExDTO> selectDep() {
		
		try {
			String sql = "select department, sum(salary) as sum, " + 
						"max(salary) as max, min(salary) as min " + 
						"from employee " + 
						"group by department " + 
						"having sum(salary) >= 10000";
			
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<EmployeeExDTO> list = new ArrayList<EmployeeExDTO>();
			
			while(rs.next()) {
				EmployeeExDTO row = new EmployeeExDTO();
				
				row.setDepartment(rs.getString("department"));
				row.setSum(rs.getInt("sum"));
				row.setMax(rs.getInt("max"));
				row.setMin(rs.getInt("min"));
				
				list.add(row);
			}
			
			return list;
			
		} catch (SQLException e) {
			System.err.println("selectDep() 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return null;
	}
}
