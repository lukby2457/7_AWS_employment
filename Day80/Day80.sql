insert into board(contents) values('1');
insert into board(contents) values('1');
insert into board(contents) values('1');
insert into board(contents) values('1');
insert into board(contents) values('1');

rollback;

desc board;

delete board where idx >= 2596 and idx <= 2600;
commit;

desc reply;

select * from reply order by idx desc;

-- 가장 최신 게시글 번호 (= 마지막에 추가된 행)
select idx from board 
    order by idx desc
    fetch first row only;

