-- 1. student 테이블 생성
create table student (
    idx         number          constraint stduent_idx primary key,
    name        varchar2(50),
    grade       number          not null,
    dep_code    number          not null,
    gender      varchar2(6)     constraint gender_check check(gender in ('남', '여')),
    birth       date            not null,
    address     varchar2(150),
    phone       varchar2(15)    constraint student_uk1_phone unique not null,
    email       varchar2(100)   constraint student_uk2_email unique not null
);

-- 2. 아차, 특정 열에 속성을 빼먹은 것을 수정
alter table student modify name varchar2(50) not null;

-- 3. 시퀀스 생성
create sequence student_seq 
    start with 20000101
    increment by 1
    minvalue 20000101
    maxvalue 999999999999999999999999
    nocache;
    
-- 4. 지정 열에 시퀀스를 기본값으로 변경
alter table student modify idx number default student_seq.nextval;

-- 5. department(전공) 테이블 생성
create table department(
    idx     number          constraint department_idx primary key,
    name    varchar2(50)    constraint department_uk1_name unique not null,
    d_date  date            not null,
    phone   varchar2(15)    constraint department_uk2_phone unique not null,
    email   varchar2(100)   constraint department_uk3_email unique not null
);

-- 6. student(dep_code) --> department(idx)를 참조하게 외래키를 지정
alter table student 
    add constraint student_fk1_dep_code 
    foreign key(dep_code) references department(idx);
    
-- 교수 테이블 생성
create table professor (
    idx         number          constraint pro_idx primary key,
    name        varchar2(50)    not null,
    gender      varchar2(6)     constraint pro_gender_chk check(gender in ('남', '여')),
    dep_code    number          not null,
    phone       varchar2(15)    constraint pro_uk1_phone unique not null,
    email       varchar2(100)   constraint pro_uk2_email unique not null,
    
    constraint pro_fk1_dep_code foreign key(dep_code) references department(idx)
);

-- 1. 외래키가 걸려있기 때문에 전공 테이블을 먼저 좀 채워야 한다
insert into department values(100, '물리학', '1995-01-02', '02-123-4567', 'phy@naver.com');
insert into department values(200, '경영학', '1996-02-01', '02-534-3434', 'hello@gmail.com');
insert into department values(300, '컴퓨터공학', '1999-01-01', '02-432-1313', 'com@daum.net');
insert into department values(400, '영어문학', '1995-03-03', '02-111-4566', 'eng@icloud.com');
insert into department values(500, '역사학', '1995-01-01', '02-222-1234', 'hi@gmail.com');
commit;

insert into student values(default, '홍길동', 80, 300, '남', '2001-05-05', '부산 광역시', '010-1234-5678', 'h@naver.com');
insert into student values(default, '김민지', 90, 100, '여', '2000-01-25', '서울 특별시', '010-3434-1212', 'k@naver.com');
insert into student values(default, '이민수', 68, 400, '남', '2003-07-18', '대구 광역시', '010-5656-9999', 'l@naver.com');

-- 연습1 : 학생의 정보를 출력 (단, 학번, 이름, 연락처, 학과명, 학과 연락처)
select A.idx, A.name, A.phone, B.name as dep_name, B.phone as dep_phone
    from student A
    inner join department B
    on A.dep_code = b.idx;
    
-- 연습2 : 컴공인 학생의 정보를 출력 (단, 학번, 이름, 연락처, 학과명, 학과 연락처)
select A.idx, A.name, A.phone, B.name as dep_name, B.phone as dep_phone
    from student A
    inner join department B
    on A.dep_code = b.idx
    where b.name = '컴퓨터공학';
    
-- 연습3 : 학생의 정보를 출력. 학생이 없는 학과도 출력(단, 학번, 이름, 연락처, 학과명, 학과 연락처)  
select A.idx, A.name, A.phone, B.name as dep_name, B.phone as dep_phone
    from student A
    right outer join department B
    on A.dep_code = b.idx;