package com.itbank.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.itbank.model.BoardDAO;
import com.itbank.model.vo.BoardVO;

@Service
public class BoardService {
	
	@Value("file:D:\\boardImg\\")
	private Resource rs;
	
	@Autowired private BoardDAO dao;

	public List<BoardVO> getLists() {
		return dao.selectAll();
	}

	public BoardVO getBoard(int idx) throws IOException {
		return dao.selectOne(idx);
	}

	public int insertBoard(BoardVO input) throws IOException {
		// 최신글 삭제 후 insert 할 때 문제 발생 가능성 있음 (insert 후 idx 불러오는 방식으로 수정)
		int row = 0;
		Integer idx = dao.selectIdx() + 1;
	
		MultipartFile imgFile = input.getImgFile();
//		System.out.println(imgFile.isEmpty());
		
		if(!imgFile.isEmpty()) {
			File dir = new File(rs.getFile(), Integer.toString(idx));	// insert 전에 파일 생성하기 위해
			dir.mkdir();
			
			File dest = new File(dir, imgFile.getOriginalFilename());
			imgFile.transferTo(dest);
			input.setImg(imgFile.getOriginalFilename());
		}
		else {
			input.setImg("");
		}
		
		row = dao.insert(input);
		
		return row;
	}

	public int deleteBoard(int idx) throws IOException {
		BoardVO board = dao.selectOne(idx);
		int row = 0;
		
		String img = board.getImg();
		File dir = new File(rs.getFile(), String.valueOf(idx));
		
		if(img != null) {
			File dest = new File(dir, img);
			dest.delete();
			dir.delete();
		}
		
		row = dao.delete(idx);
		
		return row;
	}

	public int updateBoard(BoardVO input) throws IOException {
		int row = 0;
		MultipartFile imgFile = input.getImgFile();
		File dir = new File(rs.getFile(), Integer.toString(input.getIdx()));
		
		File prevFile = new File(dir, input.getImg());
		File nextFile = new File(dir, imgFile.getOriginalFilename());
		
		if(prevFile.exists()) {
			if(!imgFile.isEmpty()) {
				prevFile.delete();
				imgFile.transferTo(nextFile);
				input.setImg(imgFile.getOriginalFilename());
			}
			else {
				prevFile.delete();
				dir.delete();
				input.setImg("");
			}
		}
		else {
			if(!imgFile.isEmpty()) {
				dir.mkdir();
				imgFile.transferTo(nextFile);
				input.setImg(imgFile.getOriginalFilename());
			}
			else {
				input.setImg("");
			}
		}
		
		row = dao.update(input);
		
		return row;
	}

}
