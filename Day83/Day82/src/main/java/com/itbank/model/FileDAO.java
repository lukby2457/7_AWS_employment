package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.itbank.model.vo.FileVO;

public interface FileDAO {

	@Insert("insert into "
			+ "upload(name, path, uploader, memo) "
			+ "values(#{name}, #{path}, #{uploader}, #{memo})")
	int insert(FileVO input);

	@Select("select * from upload order by idx desc")
	List<FileVO> selectAll();

	@Select("select * from upload where idx = #{idx}")
	FileVO selectOne(int idx);
	
	@Delete("delete upload where idx = #{idx}")
	int delete(int idx);

	@Update("update upload set name = #{name} where idx = #{idx}")
	int update(FileVO input);

}
