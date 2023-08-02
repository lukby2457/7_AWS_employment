-- ※ 테이블명 변경 (클릭으로 변경해도 된다)
alter table student rename to test_student;

-- as = alias
select A.*, kor + eng + mat as total, (kor+eng+mat) / 3 as avg from test_student A;

-- view : 가상 테이블
-- - 실제 디스크의 용량을 차지하지 않음
-- - 실제 테이블의 일부를 보여주거나, 혹은 연산이 자주 필요한 구문에 사용
-- - 
create view test_stu_view as
    (select 
        A.*, kor + eng + mat as total, 
        round((kor+eng+mat) / 3, 2) as avg 
    from test_student A);
    
drop view test_stu_view;
    
-- view를 만들면 긴 select를 작성하지 않고, view를 출력하면 된다
select * from test_stu_view;

update test_student
    set kor = 71
    where name = '김점례';
    
update test_student
    set eng = 74
    where name = '유은애';
    
-- 테이블에 update를 해도 total, avg가 자동으로 바뀌지 않는다
-- 그래서 view를 사용한다
select * from test_student;
desc test_student;
desc test_stu_view;

commit;

