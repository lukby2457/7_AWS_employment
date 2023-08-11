-- 1. stu_test 테이블을 생성 (idx, name, grade, graduate)
create table stu_test(
    idx         number,
    name        varchar2(50),
    grade       number,
    graduate    varchar2(20)
);

select idx, name, grade
from student
where idx = 90112;

-- 2. pl/sql 구문으로 학생의 학년(grade)에 따라서 
-- 4학년이면 졸업 예정, 아니면 졸업 불가
declare
    v_idx         number;
    v_name        varchar2(50);
    v_grade       number;
    v_graduate    varchar2(20) := '졸업 불가';
begin
    select idx, name, grade
        into v_idx, v_name, v_grade
    from student
    where idx = 100112;
    
    if v_grade = 4 then
        v_graduate := '졸업 예정';
    end if;
    
    insert into stu_test values(v_idx, v_name, v_grade, v_graduate);
    commit;
end;