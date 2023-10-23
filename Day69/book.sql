select to_char(sysdate, 'yyyy-mm-dd') as time from dual;

select * from account order by idx desc;

desc account;

update account set userid = 'web2', userpw  = '1234', nick = '웹2', email = 'web2@gmail.com'where idx = 1029;
commit;

create table book(
    idx         number          constraint book_idx_pk primary key,
    title       varchar2(200)   not null,
    writer      varchar2(100)   not null,
    publisher   varchar2(100)   not null,
    p_date      date            default sysdate,
    price       number          not null
);

insert into 
    book(idx, title, writer, publisher, price)
    values(101, '단 한 사람', '최진영', '한겨레출판', 13500);
    
insert into 
    book(idx, title, writer, publisher, price)
    values(102, '내가 아직 쓰지 않은 것', '최승호', '문학동네', 2700);
    
insert into 
    book(idx, title, writer, publisher, price)
    values(103, '이해인의 햇빛 일기', '이해인', '열림원', 14400);
    
select * from book;
commit;

desc book;

