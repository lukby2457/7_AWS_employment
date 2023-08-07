package dbcp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp2.BasicDataSource;

//명령어 하나 수행할 때 마다 connection을 하나 만들고
// 수행이 끝나면 connection을 닫는 작업이 불편하다
// -> DBCP (Database Connection Pooling)
// connection을 미리 만들어서 pool에 넣어놓고
// 연결이 필요하면 pool에서 꺼내고
// 닫을땐 연결을 pool에 반납하는 형식이다

class DAO {
	String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	String userName = "c##itbank";
	String password = "it";
	
	BasicDataSource ds;
	
	Connection conn;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	DAO() {
		ds = new BasicDataSource();
		
		// 필수 속성 주입 : url, id/pw
		ds.setUrl(url);
		ds.setUsername(userName);
		ds.setPassword(password);
		
		// 보조 속성 (= 필요없으면 생략해도 됨)
		ds.setMaxTotal(10);			// 최대 연결 개수
		ds.setMaxIdle(5);			// 최대 유휴 연결 개수 (= 상시 활성화 되어있을 개수)
		ds.setMaxWaitMillis(1000);	// 연결 최대 사용시 대기할 시간 (-1을 주면 무한히 대기)
		
		close();
	}
	
	void close() {
		// DBCP를 사용하게 되면 close() 메서드는 실제로 Connection을 닫지 않는다
		// close()가 되면 Connection Pool에 반납하게 됨
		
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

public class Ex01 {
	public static void main(String[] args) {
		DAO dao = new DAO();
		
		System.out.println(dao.test());
	}
}
