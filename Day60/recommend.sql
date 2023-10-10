select * from reply where nick = '테스트2' order by idx desc;

select R.*, B.title
    from reply R inner join board B
    on board_idx = B.idx
    where R.nick = '테스트2';
    
select idx, title, view_count from board order by view_count desc;

-----------------------------------------------------------------------

-- 추천/비추천 테이블 만들기
drop table  recommend;

create SEQUENCE recommend_seq
    start with 100
    increment by 1
    minvalue 100
    maxvalue 99999999999999999999999999
    nocache;

create table recommend (
    idx         number          default recommend_seq.nextval,
    board_idx   number,
    nick        varchar2(100),
    good        number,
    
    constraint recommend_uk1_board_idx unique(idx, board_idx, nick),
    constraint recommend_fk1_board_idx foreign key(board_idx) references board(idx) on delete cascade,
    constraint recommend_fk2_nick foreign key(nick) references account(nick) on delete set null
);
-- 테이블 만들때 primary key를 2번 적으면 기본 키를 2개 만들려는 것으로 취급

select * from recommend;

insert into recommend values(default, 2536, '유저1', 1);
insert into recommend values(default, 2536, '관리자1', 0);
insert into recommend values(default, 2540, '유저2', 1);
insert into recommend values(default, 2536, '유저2', 1);

-- 1. 2536 게시글의 추천(1) 수를 구하는 SQL
select count(*) from recommend 
    where board_idx = 2536 and good = 1;

-- 2. group by로 처리
select board_idx, count(*) from recommend
    where good = 1
    group by board_idx;
    
-- 계정 삭제시
select writer from board group by writer;
select * from recommend;

-- 1. 작업 없음
delete account where userid = 'user2';
-- 삭제가 진행되지 않음 (부모키가 없으면 안되기 때문에 무결성 제약조건 발생)

-- 2. 종속 삭제
delete account where userid = 'user2';
-- 해당 nick으로 지정된 행 모두 제거

-- 3. 널 설정
delete account where userid = 'user2';
-- 해당 nick으로 지정된 행 데이터를 모두 null로 변경
-- null유지하고 싶으면 idx를 만들어야 한다

rollback;
commit;

