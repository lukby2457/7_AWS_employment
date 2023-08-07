package dbcp;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.PersonVO;

class PersonDAO extends DAO {
	private PersonVO mapper(ResultSet rs) throws SQLException {
		PersonVO row = new PersonVO();
		
		row.setBirth(rs.getDate("birth"));
		row.setHeight(rs.getDouble("height"));
		row.setName(rs.getString("name"));
		
		return row;
	}

	public List<PersonVO> selectAll() {
		
		try {
			String sql = "select * from person";
			
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<PersonVO> list = new ArrayList<PersonVO>();
			
			while(rs.next()) {
				PersonVO row = mapper(rs);
				
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

	public int insert(PersonVO input) {
		
		try {
			String sql = "insert into person values(?, ?, ?)";
			
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, input.getName());
			pstmt.setDouble(2, input.getHeight());
			pstmt.setDate(3, input.getBirth());
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.err.println("insert 예외 : " + e.getMessage());
		} finally {
			close();
		}
		return 0;
	}

	public int delete(String name) {
		
		try {
			String sql = "delete from person where name = ?";
			
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.err.println("delete 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return 0;
	}

	public int update(PersonVO input, String name) {
		
		try {
			String sql = "update person " + 
							"set " + 
								"name = ?," + 
								"height = ?," + 
								"birth = ? " + 
							"where name = ?";
			
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, input.getName());
			pstmt.setDouble(2, input.getHeight());
			pstmt.setDate(3, input.getBirth());
			pstmt.setString(4, name);
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.err.println("update 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return 0;
	}
}

public class Ex02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PersonDAO dao = new PersonDAO();
		
		// 1. select
		printList(dao.selectAll());
		
		// 2. insert
		PersonVO input = getInstance(sc);
		int row = dao.insert(input);
		System.out.println(row != 0 ? "성공" : "실패");
		
		// 3. delete
		String name = getName(sc);
		row = dao.delete(name);
		System.out.println(row != 0 ? "성공" : "실패");
		
		// 4. update
		name = getName(sc);
		input = getInstance(sc);
		row = dao.update(input, name);
		System.out.println(row != 0 ? "성공" : "실패");
		
		printList(dao.selectAll());
		sc.close();
	}
	
	private static void printList(List<PersonVO> list) {
		for(PersonVO row : list) {
			System.out.println(row);
		}
		
	}

	private static String getName(Scanner sc) {
		System.out.print("\n이름 입력 : ");
		String name = sc.next();
		
		return name;
	}

	private static PersonVO getInstance(Scanner sc) {
		PersonVO vo = new PersonVO();
		
		System.out.print("\n이름 입력 : ");
		vo.setName(sc.next());
		
		System.out.print("신장 입력 : ");
		vo.setHeight(sc.nextDouble());
		
		System.out.print("생일 입력 : ");
		vo.setBirth(Date.valueOf(sc.next()));
		
		return vo;
	}
}
