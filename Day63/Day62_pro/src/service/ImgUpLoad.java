package service;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import beans.BoardVO;
import model.BoardDAO;

public class ImgUpLoad {
	@SuppressWarnings("deprecation")
	public int test(HttpServletRequest request) throws IOException {
		// 1. 업로드 옵션
		String save = request.getRealPath("board/img");
		String encoding = "utf-8";
		int size = 1024 * 1024 * 10;
		DefaultFileRenamePolicy drp = new DefaultFileRenamePolicy();
		
		// 2. 업로드 진행
		MultipartRequest mr;
		mr = new MultipartRequest(request, save, size, encoding, drp);
		
//		System.out.println(mr.getParameter("title"));
//		System.out.println(mr.getFile("upload"));
		
		// 3. DAO에 전달할 인자 설정
		File file = mr.getFile("upload");
		BoardVO args = new BoardVO();
		
		String fileName = (file == null) ? "default.png" : file.getName();
		
		args.setContents(mr.getParameter("contents"));
		args.setImg_path("img/" + fileName);
		args.setTitle(mr.getParameter("title"));
		args.setWriter(mr.getParameter("writer"));
		
		// 4. DAO로 DB에 등록
		BoardDAO dao = new BoardDAO();
		
		return dao.insert(args);
	}
}
