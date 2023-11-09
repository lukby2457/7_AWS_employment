package com.itbank.service;

import java.io.File;
import java.io.IOException;

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
		
		input.setPath(rs.getFilename());
		input.setName(file.getOriginalFilename());
		
		System.out.println(rs.getFilename());
		System.out.println(input.getName());
		
		int row = dao.insert(input);
	}

}
