package model;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.EmployeeVO;

public class EmployeeDAO extends DAO {
	
	private EmployeeVO mapper(ResultSet rs) throws SQLException {
		EmployeeVO row =  new EmployeeVO();
		
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

	public List<EmployeeVO> selectAll() {
		
		try {
			String sql = "select * from employee order by idx desc";
			
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<EmployeeVO> list = new ArrayList<EmployeeVO>();
			
			while(rs.next()) {
				EmployeeVO row = mapper(rs);
				
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

	public String countAll() {
		
		try {
			String sql = "select count(name) from employee";
			
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			rs.next();
			
			return rs.getString("count(name)");
			
		} catch (SQLException e) {
			System.err.println("countAll 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return null;
	}

	public List<EmployeeVO> salary() {
		
		try {
			String sql = "select sum(salary) as sum, max(salary) as max, "
					+ "min(salary) as min from employee";
			
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<EmployeeVO> list = new ArrayList<EmployeeVO>();
			
			while(rs.next()) {
				EmployeeVO row = new EmployeeVO();
				
				row.setSum(rs.getInt("sum"));
				row.setMax(rs.getInt("max"));
				row.setMin(rs.getInt("min"));
				
				list.add(row);
			}
			
			return list;
			
		} catch (SQLException e) {
			System.err.println("salary 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return null;
	}

	public List<EmployeeVO> positionSalary() {

		try {
			String sql = "select position, sum(salary) as sum, "
					+ "max(salary) as max, min(salary) as min from employee "
					+ "group by position order by sum desc";
			
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<EmployeeVO> list = new ArrayList<EmployeeVO>();
			
			while(rs.next()) {
				EmployeeVO row = new EmployeeVO();
				
				row.setPosition(rs.getString("position"));
				row.setSum(rs.getInt("sum"));
				row.setMax(rs.getInt("max"));
				row.setMin(rs.getInt("min"));
				
				list.add(row);
			}
			
			return list;
			
		} catch (SQLException e) {
			System.err.println("positionSalary 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return null;
	}

	public List<EmployeeVO> departmentSalary() {
		
		try {
			String sql = "select department, sum(salary) as sum, max(salary) as max, "
					+ "min(salary) as min from employee group by department "
					+ "having sum(salary) >= 10000";
			
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<EmployeeVO> list = new ArrayList<EmployeeVO>();
			
			while(rs.next()) {
				EmployeeVO row = new EmployeeVO();
				
				row.setDepartment(rs.getString("department"));
				row.setSum(rs.getInt("sum"));
				row.setMax(rs.getInt("max"));
				row.setMin(rs.getInt("min"));
				
				list.add(row);
			}
			
			return list;
			
		} catch (SQLException e) {
			System.err.println("departmentSalary 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return null;
	}
	
}
