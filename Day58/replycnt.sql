select * from reply order by idx desc;

create view ReplyCnt as
    select board_idx, count(board_idx) as cnt
        from reply
        group by board_idx;

create view boardview as
    select B.*, nvl(R.cnt, 0) as cnt 
        from board B left outer join replycnt R
        on B.idx = R.board_idx;
    
    
select * from boardview    
    where title like '%%'
    order by idx desc;
-- group by는 행개수에 유의

select * from account order by idx desc;

