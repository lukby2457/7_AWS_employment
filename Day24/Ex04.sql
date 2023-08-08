select * from employee order by department, idx desc;

create table emp (
    idx         number          constraint emp_idx primary key,
    name        varchar2(20)    not null,
    gender      varchar2(6)     constraint gender_chk check(gender in ('남', '여')),
    birth       date            not null,
    h_date      date            default sysdate not null,
    phone       varchar2(15)    constraint emp_phone unique not null,
    email       varchar2(150)   constraint emp_email unique not null,
    position    varchar2(20)    not null,
    salary      number          not null,
    dep_idx     number          
);

drop table emp;

-- select의 결과를 insert하기 (열 개수가 맞아야 함)
insert into emp(idx, name, gender, birth, h_date, phone, email, position, salary)
    select idx, name, gender, birth, h_date, phone, email, position, salary 
    from employee order by idx;
    
rollback;

select * from emp;
commit;
