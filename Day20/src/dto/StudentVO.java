package dto;

/*
	-- test_student 테이블 --
	NAME    VARCHAR2(50) 
	KOR     NUMBER       
	ENG     NUMBER       
	MAT     NUMBER
	  
	-- test_stu_view 뷰 --
	TOTAL    NUMBER       
	AVG      NUMBER 
 */

public class StudentVO {
	private String name;
	private int kor, eng, mat, total;
	private double avg;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	@Override
	public String toString() {
		String format = "%s (국 : %d, 영 : %d, 수 : %d)";
		format = String.format(format, name, kor, eng, mat);
		return format;
	}
}
