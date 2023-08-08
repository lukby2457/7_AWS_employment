-- student table 생성
create table student(
    idx         NUMBER          constraint stu_idx_pk primary key,
    name        varchar2(50)    ,
    grade       number          not null,
    dep_code    number          not null,
    gender      varchar2(6)     constraint stu_chk check(gender in('남','여')),
    birth       date            not null,
    address     varchar2(150)   ,
    phone       varchar2(15)    constraint stu_phone_uk unique not null,
    email       varchar2(100)   constraint stu_email_uk unique not null
);

-- student table name에 not null 지정
alter table student modify name varchar2(50) not null;

-- student_sequence 생성
create sequence stu_seq
    start with 200001
    increment by 1
    minvalue 090112
    maxvalue 999999999999
    nocache;

-- student idx에 sequence 지정
alter table student modify idx number default stu_seq.nextval;

-- department table 생성
create table department(
    idx         number          constraint dep_idx_pk primary key,
    name        varchar2(50)    constraint dep_name_uk unique not null,
    dep_create  date            not null,
    phone       varchar2(15)    constraint dep_phone_uk unique not null,
    email       varchar2(100)   constraint dep_email_uk unique not null
);

-- professor table 생성
create table professor(
    idx         number          constraint pro_idx_pk primary key,
    name        varchar2(50)    not null,
    gender      varchar2(6)     constraint pro_chk check(gender in('남','여')),
    dep_code    number          not null,
    phone       varchar2(15)    not null,
    email       varchar2(100)   not null
);

-- student dep_code 외래키 department idx 지정
alter table student add constraint stu_fk1_dep_code
    foreign key(dep_code) references department(idx);

-- professor dep_code 외래키 department idx 지정
alter table professor add constraint pro_fk1_dep_code
    foreign key(dep_code) references department(idx);

-- insert student
insert into student values(170112, '김진우', 2, 101, '남', '98/04/28', '서울특별시', '010-8468-7632', 'kjw@gmail.com');
insert into student values(100112, '김점례', 4, 101, '여', '91/07/17', '서울특별시', '010-3261-1081', 'kjl@naver.com');
insert into student values(090112, '김은혜', 4, 102, '여', '90/02/10', '서울특별시', '010-9358-0810', 'keh@kakao.com');
insert into student values(190112, '허진우', 1, 102, '남', '00/01/08', '서울특별시', '010-4321-0132', 'hjw@gmail.com');
insert into student values(170112, '김재현', 3, 101, '남', '98/07/31', '서울특별시', '010-0861-1062', 'kjh@kakao.com');
insert into student values(160112, '김성윤', 3, 102, '남', '97/11/24', '서울특별시', '010-8403-0161', 'ksy@naver.com');
insert into student values(180112, '유은애', 2, 101, '여', '99/09/17', '서울특별시', '010-3480-1208', 'yee@kakao.com');
insert into student values(150112, '김뚜띠', 2, 201, '남', '96/09/17', '서울특별시', '010-6510-0132', 'kdd@gmail.com');
insert into student values(190108, '감블러', 1, 201, '남', '00/09/17', '서울특별시', '010-0465-0610', 'gbr@kakao.com');
insert into student values(170042, '견자희', 3, 201, '여', '98/09/17', '서울특별시', '010-4602-0106', 'gzh@naver.com');
commit;

-- insert department
insert into department values(100, '경영대학', '94/06/27', '051-627-5000', 'busi_col@gmail.com');
insert into department values(101, '경영학과', '94/07/01', '051-627-5001', 'busi_man@gmail.com');
insert into department values(102, '경영정보학과', '96/10/28', '051-627-5002', 'busi_mis@gmail.com');
insert into department values(200, '행정대학', '89/02/01', '051-627-3000', 'admi_col@gmail.com');
insert into department values(201, '행정학과', '89/02/02', '051-627-3001', 'admi_adm@gmail.com');
commit;

-- insert professor
insert into professor values(070001, '이문기', '남', 100, '010-3456-7890', 'lmg@naver.com');
insert into professor values(120501, '박주영', '여', 101, '010-5454-7676', 'pjy@gmail.com');
insert into professor values(171010, '최종철', '남', 102, '010-3456-7890', 'cjc@kakao.com');
insert into professor values(191201, '김은희', '여', 101, '010-1580-6486', 'keh@naver.com');
insert into professor values(010001, '최은결', '여', 200, '010-8944-6002', 'ceg@gmail.com');
insert into professor values(100201, '박철종', '남', 201, '010-8940-1305', 'pcj@kakao.com');
commit;

select * from student;