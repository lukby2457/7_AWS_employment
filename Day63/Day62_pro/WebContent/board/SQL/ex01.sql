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

-- 게시글 9개정도 추가 후 페이지에 제목과 작성자 출력