drop view acc_jo_brd;
drop table board_back;
drop table board;
drop table account;

-- 문제1)
create table account(
    idx     number          constraint account_idx primary key,
    userid  varchar2(20)    constraint account_userid unique not null,
    userpw  varchar2(20)    not null,
    nick    varchar2(50)    constraint account_nick unique not null,
    jdate   date            default sysdate
);

-- 문제2)
insert into account values(20231001, 'itbank', 'it12', '구름달', '23/02/13');
insert into account values(20231002, 'user', '1234', '별똥별', '23/02/14');
insert into account values(20231003, 'hong22', '2222', '콩콩', '23/02/22');
select * from account order by idx desc;
commit;
-- 문제3)
update account set nick = '은하수' where idx = 20231002;
select * from account where idx = 20231002;

-- 문제4)
delete from account where userid = 'hong22';
select * from account;

-- 문제5)
create table board(
    idx         number          constraint board_idx primary key,
    title       varchar2(50)    not null,
    contents    varchar2(100)   not null,
    writer      varchar2(50)    ,  
    wdate       date            default sysdate,
    
    constraint board_writer_fk foreign key(writer) references account(nick) on delete cascade
);

-- 문제6)
insert into board values(1000, '안녕하세요', 'hello~', '은하수', '23/02/14');
insert into board values(1001, '오늘 점심은', '햄버거나 먹을까?', '은하수', '23/02/14');
insert into board values(1002, '퇴근~', '차가 막히네...', '구름달', '23/02/14');
select * from board order by idx desc;
commit;

-- 문제7)
select * from board where writer = '은하수' order by idx desc;

-- 문제8)
select a.idx, a.userid, a.nick, b.idx, b.title
    from account A inner join board B
    on A.nick = B.writer;
    
-- 문제9)
create view acc_jo_brd as
(select 
    a.idx, a.userid, a.nick, b.idx as b_idx, b.title
from account A inner join board B
on A.nick = B.writer);

select * from acc_jo_brd;

-- 문제10)
create table board_back(
    idx         number          ,
    title       varchar2(50)    not null,
    contents    varchar2(100)   not null,
    writer      varchar2(50)    ,  
    wdate       date            ,
    ddate       date            default sysdate
);

create or replace trigger brd_del
    after delete on board
    for each row
declare

begin
    insert into board_back(idx, title, contents, writer, wdate)
    values (:old.idx, :old.title, :old.contents, :old.writer, :old.wdate);
end;

-- 문제11)
delete from board where idx = 1001;
select * from board;
select * from board_back;