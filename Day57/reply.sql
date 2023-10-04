select * from board order by idx desc;

select * from board where title like '%웹%' order by idx desc;

select count(*) as count from board where title like '%웹%';

----------------------------------------------------------------------
create sequence reply_seq
    start with 101
    INCREMENT by 1
    minvalue 101
    maxvalue 999999999999999999999999999
    nocache;
    
create table reply (
    idx         number          default reply_seq.nextval,          
    board_idx   number          not null,
    contents    clob            not null,
    nick        varchar2(100)   not null,
    write_date  date            default sysdate,
    
    constraint reply_idx primary key(idx),
    constraint board_fk_idx foreign key(board_idx) references board(idx),
    constraint account_fk_nick foreign key(nick) references account(nick)
);

insert into 
    reply(board_idx, contents, nick)
    values(2541, '댓글 테스트 입니다', '테스트3');
    
insert into 
    reply(board_idx, contents, nick)
    values(2540, '다른글 테스트 입니다', '테스트4');
    
insert into 
    reply(board_idx, contents, nick)
    values(2541, '하이~', '유저1');
    
commit;

select * from reply where board_idx = 2541 order by idx desc;

select A.*, B.contents as reply, B.nick, B.write_date as w_date 
    from board A 
    left outer join reply B 
    on A.idx = B.board_idx
    where A.idx = 2541
    order by B.idx desc;
    
desc reply;

