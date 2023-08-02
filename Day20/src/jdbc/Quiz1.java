package jdbc;

import java.util.List;

import dto.AccountVO;
import model.AccountDAO;

public class Quiz1 {
	public static void main(String[] args) {
		// Account 테이블을 모두 출력
		AccountDAO dao = new AccountDAO();
		
//		System.out.println(dao.test() + "\n");
		
		List<AccountVO> list = dao.selectAll();
		
		System.out.println("계정번호\t아이디\t비밀번호\t닉네임\t이메일\t\t가입일자");
		System.out.println("----------------------------------------------------------");
		
		for(AccountVO row : list) {
			System.out.println(row.toString());
		}
		
	}
}
