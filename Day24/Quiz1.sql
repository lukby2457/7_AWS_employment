alter table emp add constraint emp_fk1_dep_idx
    foreign key(dep_idx) references dep(idx);
-- 문제1. 모든 사원의 정보를 출력
-- 단, 부서의 정보도 같이 출력되고 
-- 부서가 없는 사람은 출력x
select A.*, B.name, B.c_date, B.phone, B.email 
    from emp A
    inner join dep B
    on a.dep_idx = b.idx;

-- 문제2. 모든 사원의 정보를 출력
-- 단, 부서의 정보도 같이 출력
-- 부서가 없는 사람은 출력x
-- 출력할 정보는 사원번호, 사원이름, 부서이름
select A.idx, A.name, B.name
    from emp A
    inner join dep B
    on a.dep_idx = b.idx;
    
-- 계속 join테이블을 보고 싶으면 view로 만들어서 사용한다

-- 문제3. 모든 사원의 정보를 출력
-- 단, 부서의 정보도 같이 출력
-- 부서가 없는 사람도 출력
-- 출력할 정보는 사원번호, 사원이름, 부서이름 
select A.idx, A.name, B.name as dep_name
    from emp A
    left outer join dep B
    on a.dep_idx = b.idx;

-- 문제4. 부서가 기술부인 모든 사원의 정보를 출력
-- 단, 부서의 정보도 같이 출력
-- 부서가 없는 사람은 출력x
-- 출력할 정보는 부서이름, 사원번호, 사원이름
select B.name as dep_name, A.idx, A.name
    from emp A
    right outer join dep B
    on a.dep_idx = b.idx
    where B.name = '기술부';

-- inner : 무조건 겹치는것만
-- right : 사람이 없는 부서도
    
-- ANSI Join, Oracle Join 비교해보기