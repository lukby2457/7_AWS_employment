create sequence employee_seq
    start with 20230101
    increment by 1
    minvalue 20000000
    maxvalue 999999999999999999999
    nocache;

create table employee(
    idx         number          default employee_seq.nextval constraint employee_idx  primary key,
    name        varchar2(20)    not null,
    gender      varchar2(6)     constraint employee_gender  check(gender in ('남', '여')),
    birth       date            not null,
    h_date      date            default sysdate not null,
    phone       varchar2(15)    constraint employee_phone    unique  not null,
    email       varchar2(150)   constraint employee_email    unique  not null,
    position    varchar2(20)    not null,
    salary      number          not null,
    department  varchar2(50),
    dep_create  date,
    dep_phone   varchar2(15),
    dep_email   varchar2(150)
);

alter table employee modify department varchar2(50);

drop table employee;

-- 하이픈(-)을 넣어서 저장하면 후에 통신할때 에러가 날수도 있다
-- 이를 방지하고자 -를 빼거나 3개로 나누어 입력 후 합쳐서 보관하는 경우도 있다
insert into employee
    values(default, '홍길동', '남', '96/03/12', default, '010-1234-5678',
    'hong@naver.com', '사원', 3000, '마케팅', '01/12/01', '02-123-5678', 'mar@naver.com');
    
select * from employee;

rollback;

-- AI로 자동 생성한 구문
INSERT INTO employee (name, gender, birth, h_date, phone, email, position, salary, department, dep_create, dep_phone, dep_email)
VALUES ('홍길동', '남', '1990-05-15', '2020-03-10', '010-1234-5678', 'john.doe@gmail.com', '부장', 8000, '총무부', '2020-02-01', '02-9876-5432', 'ops_dept@gmail.com');

INSERT INTO employee (name, gender, birth, h_date, phone, email, position, salary, department, dep_create, dep_phone, dep_email)
VALUES ('이영희', '여', '1985-11-30', '2018-07-20', '010-9876-5432', 'jane.smith@gmail.com', '사원', 7000, '개발부', '2018-05-15', '02-1234-5678', 'eng_dept@gmail.com');

INSERT INTO employee (name, gender, birth, h_date, phone, email, position, salary, department, dep_create, dep_phone, dep_email)
VALUES ('김철수', '남', '1995-09-25', '2022-01-05', '010-4444-5555', 'mike.john@gmail.com', '대리', 5000, '경리부', '2021-12-01', '02-1111-2222', 'finance_dept@gmail.com');

INSERT INTO employee (name, gender, birth, h_date, phone, email, position, salary, department, dep_create, dep_phone, dep_email)
VALUES ('이미영', '여', '1988-12-18', '2019-11-01', '010-5555-6666', 'sarah.lee@gmail.com', '과장', 6000, '개발부', '2019-09-10', '02-7777-8888', 'hr_dept@gmail.com');

INSERT INTO employee (name, gender, birth, h_date, phone, email, position, salary, department, dep_create, dep_phone, dep_email)
VALUES ('김영호', '남', '1987-08-20', '2015-06-25', '010-2222-3333', 'robert.kim@gmail.com', '차장', 10000, '기술부', '2015-05-01', '02-3333-4444', 'ops_dept@gmail.com');

INSERT INTO employee (name, gender, birth, h_date, phone, email, position, salary, department, dep_create, dep_phone, dep_email)
VALUES ('박수진', '여', '1993-04-12', '2021-09-15', '010-6666-7777', 'emily.park@gmail.com', '사원', 4000, '기술부', '2021-08-01', '02-8888-9999', 'eng_dept@gmail.com');

INSERT INTO employee (name, gender, birth, h_date, phone, email, position, salary, department, dep_create, dep_phone, dep_email)
VALUES ('천민수', '남', '1992-07-27', '2017-03-12', '010-9999-0000', 'michael.chen@gmail.com', '대리', 4500, '경리부', '2016-12-01', '02-0000-1111', 'finance_dept@gmail.com');

INSERT INTO employee (name, gender, birth, h_date, phone, email, position, salary, department, dep_create, dep_phone, dep_email)
VALUES ('왕소피아', '여', '1996-02-03', '2023-01-02', '010-7777-8888', 'sophia.wang@gmail.com', '사원', 3000, '총무부', '2020-02-01', '02-9876-5432', 'ops_dept@gmail.com');

INSERT INTO employee (name, gender, birth, h_date, phone, email, position, salary, department, dep_create, dep_phone, dep_email)
VALUES ('장우진', '남', '1989-10-09', '2014-08-20', '010-1111-2222', 'william.zhang@gmail.com', '사원', 8000, '개발부', '2019-09-10', '02-7777-8888', 'hr_dept@gmail.com');

INSERT INTO employee (name, gender, birth, h_date, phone, email, position, salary, department, dep_create, dep_phone, dep_email)
VALUES ('류지민', '여', '1997-06-21', '2022-05-10', '010-8888-9999', 'olivia.liu@gmail.com', '사원', 5500, '기술부', '2021-08-01', '02-8888-9999', 'eng_dept@gmail.com');


-- AI가 부서를 동일하게 못채워 줌...
-- update로 일괄 변경하도록 하자
update employee set dep_create = '2020-02-01', dep_phone = '02-8888-9999', dep_email = 'ops_dept@gmail.com' where department = '총무부';

update employee set dep_create = '2016-12-01', dep_phone = '02-7777-8888', dep_email = 'finance_dept@gmail.com' where department = '경리부';

update employee set dep_create = '2019-09-10', dep_phone = '02-9876-5432', dep_email = 'hr_dept@gmail.com' where department = '개발부';

update employee set dep_create = '2021-08-01', dep_phone = '02-0000-1111', dep_email = 'eng_dept@gmail.com' where department = '기술부';
    
commit;

select * from employee order by department;

-- 사원 테이블 : 집계함수 사용에 용이