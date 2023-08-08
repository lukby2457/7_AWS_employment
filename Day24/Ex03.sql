alter table test_emp drop constraint fk1_dep_idx;

alter table emp drop constraint emp_fk1_dep_idx;

alter table emp add constraint emp_fk1_dep_idx
    foreign key(dep_idx) references dep(idx);
    
select * from emp order by idx;

-- join : 관계가 있는 두 테이블을 엮어서 조회하는 방식

-- 1. Inner Join : 두 테이블의 겹치는 부분 (A와 B의 교집합)
select A.*, B.name, B.phone
    from emp A
    inner join dep B
    on a.dep_idx = b.idx;
--    where b.name = '생산부';
    
-- 2. Left Outer Join : 겹치는 부분과 왼쪽(A) 테이블의 모든 내용
select A.*, B.name, B.phone
    from emp A
    left outer join dep B
    on A.dep_idx = b.idx;
    
-- 3. Rigth Outer Join : 겹치는 부분화 오른쪽(B) 테이블의 모든 내용
select A.*, B.name, B.phone
    from emp A
    right outer join dep B
    on A.dep_idx = b.idx;
    
-- 4. Full Outer Join : Join되는 부분과 안 되는 부분 모두
select A.*, B.name, B.phone
    from emp A
    full outer join dep B
    on A.dep_idx = b.idx;
    
-- 5. Cross Join : 모든 열과 한번씩 Join
select A.*, B.name, B.phone
    from emp A cross join dep B;
