package com.itbank.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.itbank.model.FileDAO;
import com.itbank.model.vo.FileVO;

@Service
public class FileService {

	@Value("file:D:\\springUpload\\")
	private Resource rs;
	
	@Autowired private FileDAO dao;
	
	public File[] getDir() throws IOException {
		File dir = rs.getFile();
		
		System.out.println("존재하는가? " + dir.exists());
		System.out.println("파일인가? " + dir.isFile());
		System.out.println("폴더인가? " + dir.isDirectory() + "\n");
		
		if(dir.exists() == false) {		// 존재하지 않으면
			dir.mkdir();				// 폴더를 생성하라
		}
		
		return dir.listFiles();
	}

	public void fileUpload(MultipartFile upload) throws IOException {
		File dest = new File(rs.getFile(), upload.getOriginalFilename());
		upload.transferTo(dest);
	}

	public void changeName(MultipartFile upload, String name) throws IOException {
		String fileName;
		
		String path = upload.getOriginalFilename();
		path = path.substring(path.lastIndexOf("."));
		
		if ("".equals(name)) {	// ※ input에서 값을 작성하지 않고 보내면 null이 아닌 빈 문자열이다
			fileName = upload.getOriginalFilename();
		}
		else {
			fileName = name + path;
		}
		
		File dest = new File(rs.getFile(), fileName);
		upload.transferTo(dest);
	}

	public void fileUpload(FileVO input) throws IOException {
		MultipartFile file = input.getUpload();
		
		// 1. DB에 전달할 값을 분할
		input.setPath(rs.getFile().toString());
		input.setName(file.getOriginalFilename());
		
		// 2. 실제 위치에 업로드 진행
		File dest = new File(rs.getFile(), file.getOriginalFilename());
		file.transferTo(dest);
		
		// 3. DB 정보 등록
		int row = dao.insert(input);
	}

	public List<FileVO> getList() {
		return dao.selectAll();
	}

	public int fileDelete(int idx) throws IOException {
		// 1. DB 안에 있는 파일 이름 가져오고 파일 객체 생성
		FileVO exist = dao.selectOne(idx);
		File dest = new File(rs.getFile(), exist.getName());
		
		int row = 0;
		
		// 2. 객체가 존재하면 삭제 수행 및 DB에서 삭제
		if(dest.exists()) {
			dest.delete();
			row = dao.delete(idx);
		}
		
		return row;
	}

	public int fileUpdate(String name, int idx) throws IOException {
		// 1. DB 안에 있는 파일 정보 가져오기
		FileVO find = dao.selectOne(idx);
		int row = 0;
		
		// 2. 새로운 이름에 파일 타입 정보 붙여주기
		String fileName = name;
		String path = find.getName();
		path = path.substring(path.lastIndexOf("."));
		fileName = fileName + path;
		
		// 3. 기본 파일이름과 새 이름으로 파일 객체 생성
		File prevFile = new File(rs.getFile(), find.getName());
		File nextFile = new File(rs.getFile(), fileName);
		
		// 4. 기본 파일이름의 객체가 존재하면 새 이름으로 변경 및 DB에 정보 수정
		if(prevFile.exists()) {
			prevFile.renameTo(nextFile);
			
			FileVO input = new FileVO();
			input.setIdx(idx);
			input.setName(fileName);
			
			row = dao.update(input);
		}
		
		return row;
	}

}
