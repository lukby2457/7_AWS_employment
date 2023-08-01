-- 1. Student 테이블을 작성
-- 열 정보
-- - 이름 : 문자열 (50 byte)
-- - 국어 : 숫자
-- - 영어 : 숫자
-- - 수학 : 숫자

-- 2. Student 테이블에 행을 3개 정도 추가
insert into student values('김진우',70,80,90);
insert into student values('김은혜',50,95,80);
insert into student values('유은애',75,70,70);
insert into student(name) values('김점례');
insert into student(name) values('허진우');

commit;
rollback;

-- 3. 추가 후 조회
select * from student;

-- 4. 아무 학생을 선택해서 국 영 수 점수 수정
update student
    set
        kor = 70,
        eng = 55,
        mat = 65
    where name = '김점례';

-- 5. 아무 학생을 선택해서 정보 제거
delete from student where name = '허진우';



