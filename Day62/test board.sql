drop table board;

create table board (
    idx         number, 
    title       varchar2(200)   not null,
    contents    clob,
    writer      varchar2(100)   not null,
    write_date  date            default sysdate,
    img_path    clob,
    
    constraint board_pk_idx primary key(idx)
);

insert into board(idx, title, contents, writer) values(101, 'DB test', '테스트입니다', '테스트계정');
insert into board(idx, title, contents, writer) values(102, 'WEB test', '테스트입니다', '테스트계정');
insert into board(idx, title, contents, writer) values(103, 'IMG test', '테스트입니다', '테스트계정');
insert into board(idx, title, contents, writer) values(104, 'WEB Print test', '테스트입니다', '테스트계정');
insert into board(idx, title, contents, writer) values(105, 'Dummy1', '더미 데이터입니다', '더미1');
insert into board(idx, title, contents, writer) values(106, 'Dummy2', '더미 데이터입니다', '더미2');
insert into board(idx, title, contents, writer) values(107, 'Dummy3', '더미 데이터입니다', '더미3');
insert into board(idx, title, contents, writer) values(108, 'Dummy4', '더미 데이터입니다', '더미4');
insert into board(idx, title, contents, writer) values(109, 'Dummy5', '더미 데이터입니다', '더미5');

commit;

select * from board order by idx desc;

desc board;