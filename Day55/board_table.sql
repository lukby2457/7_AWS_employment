create sequence board_idx
    start with 1001
    increment by 1
    minvalue 1001
    maxvalue 999999999999999999999999999
    nocache;

drop table board;

create table board (
    idx         number              default board_idx.nextval,
    title       varchar2(300)       not null,
    contents    clob                not null,   
    writer      varchar2(100)       not null,
    view_count  number              default 0,
    write_date  date                default sysdate,
    
    constraint board_idx primary key(idx),
    constraint board_writer foreign key (writer) references account(nick)
);

-- 1. 테이블에 게시글 내용을 채운다
insert into 
    board(title, contents, writer) 
    values('안녕하세요', '안녕하세요. 관리자1입니다', '관리자1');

insert into 
    board(title, contents, writer) 
    values('가입 인사 입니다', '가입 완료해서 인사글 남깁니다', '유저1');

insert into 
    board(title, contents, writer) 
    values('테스트', '테스트 게시글입니다', '테스트1');
    
insert into 
    board(title, contents, writer) 
    values('테스트', '테스트 게시글입니다', '테스트2');

commit;

select * from board;

-- 2. Day55 프로젝스 home.jsp에 테이블 목록을 전체 출력

desc board;