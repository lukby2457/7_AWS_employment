package service;

import beans.RecommendVO;
import model.BoardDAO;

public class Recommend {
	@SuppressWarnings("unused")
	private void debug(RecommendVO input) {
		System.out.println("idx = " + input.getBoard_idx());
		System.out.println("isCheck = " + input.getIsCheck());
		System.out.println("good = " + input.getGood());
	}
	
	public int recPro(RecommendVO input) {
//		debug(input);
		int row = 0;
		BoardDAO dao = new BoardDAO();
		int isCheck = input.getIsCheck();
		int good = input.getGood();
		
		if (isCheck == 1) {
			if (good == 1) {
				// delete
				row = dao.recDelete(input);
			}
			else {
				// update
				row = dao.recUpdate(input);
			}
		}
		else if (isCheck == 2) {
			if (good == 1) {
				// update
				row = dao.recUpdate(input);
			}
			else {
				// delete
				row = dao.recDelete(input);
			}
		}
		else {
			// insert
			row = dao.recInsert(input);
		}
		
		return row;
	}
}
