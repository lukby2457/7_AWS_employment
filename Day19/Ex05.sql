-- create : DB 객체를 생성하는 명령어
create table test (
    name    varchar2(20),
    height  number,
    birth   date,
    email   varchar2(50)
);

-- alter : 테이블의 열 정보를 변경
-- 1. alter table 테이블명 modify 열 자료형 - 열 수정 (주의 필요)
alter table test modify name varchar2(30);

-- 2. alter table 테이블명 add 열 자료형 - 열 추가
alter table test add address varchar2(150);

-- 3. alter table 테이블명 drop column 열 - 열 삭제
alter table test drop column email;

-- 4. alter table 테이블명 rename column 기존 열 to 변경 열 - 열 이름 변경
alter table test rename column address to ads;

desc test;

-- drop : DB 객체를 제거
drop table test;