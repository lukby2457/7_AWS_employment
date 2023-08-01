-- Data의 중복
-- ※ 아래 구문을 5번 정도 실행
insert into student values('이민준', 70, 77, 88);

-- 테이블을 출력하니 동일한 데이터가 많이 발생 (= 중복)
select * from student;

-- 중복의 문제점
-- 1. 성능 저하 및 가독성 저하

-- 2. 데이터의 연쇄 변경 및 삭제가 발생
update student
    set
        name = '김민준',
        kor = 80,
        eng = 90,
        mat = 91
    where name = '이민준';
    
delete from student where name = '김민준';

rollback;