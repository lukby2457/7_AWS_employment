select * from recommend;

insert into recommend values(2541, '테스트1', 1);
insert into recommend values(2541, '테스트4', 1);
insert into recommend values(2541, '테스트2', 2);

commit;

select count(*) from recommend where board_idx = 2541 and good = 1;

-- 변경사항
-- 1. idx는 제거(시퀀스도 제거), board_idx와 nick을 묶어서 uk
--      - 같은 닉네임을 가진 사람이 추천을 2번 할 수 있다
-- 2. nick의 fk에 있는 set null을 cascade로 변경 

update recommend set good = 2 where board_idx = 2536 and nick = '유저2';

desc recommend;

-- 참고
-- view_count와 recommend를 비교하면서 테이블 분리를 참고하는 것이 좋다