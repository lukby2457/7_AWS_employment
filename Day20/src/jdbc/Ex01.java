package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
	JDBC : Java DataBase Connectivity
	- Java 언어를 이용해서 DB 접근을 지원하는 라이브러리
	- Oracle DB를 접근하기 위해선 ojdbc를 사용
 */

public class Ex01 {
	public static void main(String[] args) {
		// 1. 접속을 위한 준비물
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
		String user = "c##itbank";
		String password = "it";
		
		Connection conn = null;		// DB에 연결을 생성하고 유지하는 객체
		Statement stmt = null;		// SQL 구문을 실행할 객체
		ResultSet rs = null;				// table의 결과를 가진 집합 (= Set)
		
		try {
			Class.forName(driver);	// 해당 클래스가 제대로 준비 되어있는지 테스트용 구문 (생략 가능)
			
			String sql = "select banner from v$version";	// 문자열 안에 ;를 넣지 않는다 (넣으면 에러 발생)
			
			conn = DriverManager.getConnection(url, user, password);	// 1. 연결을 생성
			stmt = conn.createStatement();								// 2. SQL 실행 객체 생성
			rs = stmt.executeQuery(sql);								// 3. 실행 결과를 rs 객체에 저장
			
			rs.next();	// 맨 윗줄에서 한칸 내린다
			
			String banner = rs.getString("banner");	// 문자열로  banner를 가져온다
			
			System.out.println("banner = " + banner);
			
		} catch (ClassNotFoundException | SQLException e) {
			System.err.println("예외 발생 : " + e.getMessage());
			
		} finally {
			try {
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
				if (conn != null) conn.close();
				
			} catch (Exception e) {}
		}
	}
}
