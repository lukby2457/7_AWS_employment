create sequence img_board_seq
    start with 10001
    increment by 1
    minvalue 10001
    maxvalue 99999999999999
    nocache;
    
create table img_board (
    idx         number          default img_board_seq.nextval,
    title       varchar2(200)   not null,
    contents    clob            not null,
    writer      varchar2(150)   not null,
    write_date  date            default sysdate,
    view_count  number          default 0,
    img         varchar2(300),
    
    constraint img_board_pk_idx primary key(idx)
);

-- img는 이미지 이름만 저장

desc img_board;

insert into 
    img_board(title, contents, writer, img)
    values('테스트', 'DB에서 만들어서 테스트 하는 페이지 입니다', '테스트1', '');
    
insert into 
    img_board(title, contents, writer, img)
    values('테스트', 'DB에서 img이름으로 테스트 하는 페이지 입니다', '테스트1', '포워드.png');
    
commit;

select * from img_board order by idx desc;