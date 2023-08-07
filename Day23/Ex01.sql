show user;

-- 사원 테이블 (사원번호, 이름, 부서 번호)
create table emp (
    idx         number          constraint emp_idx primary key,
    name        varchar2(20)    not null,
    dep_idx     number
);

-- 부서 테이블 (부서 번호, 부서 이름, 부서 연락처)
create table dep (
    idx     number              constraint dep_idx primary key,
    name    varchar2(20),
    phone   varchar2(20)
);

-- 사원 테이블 채우기
insert into emp values(1001, '홍길동', 100);
insert into emp values(1002, '김민지', 200);
insert into emp values(1003, '박수철', 300);
insert into emp values(1004, '강호동', null);
insert into emp values(1005, '유재석', 100);
insert into emp values(1006, '이경규', null);
commit;

-- 부서 테이블 채우기
insert into dep values(100, '생산부', '051-123-5678');
insert into dep values(200, '개발부', '051-343-7878');
insert into dep values(300, '총무부', '051-567-1234');
insert into dep values(400, '영업부', '051-654-9876');
insert into dep values(500, '회계부', '051-121-0099');
commit;

select a.*, b.name, b.phone
    from emp a inner join dep b
    on a.dep_idx = b.idx;
-- Oracle DB = RDB (Relation DB)