-- delete : 행 삭제
-- 구문 : delete from 테이블명 where 조건;
delete from person where name = '홍진호';

-- 범위로 한번에 제거시, 어떤 데이터가 제거되는지 알아차리기 어렵다
-- 따라서, 범위 조건을 select에 한번 사용해보고 디버깅 후 제거하는 것이 바람직
select * from person where height >= 170;
delete from person where height >= 170;

-- 조건을 생략하면 모든 행이 제거된다
delete from person;

select * from person;
rollback;

-- update : 행 수정
-- 구문 : update 테이블명 set 열1 = 값1, 열2 = 값2 ... where 조건;
update person set name = '홍길동' where name = '홍진호';

update person
    set 
        name = '김민서',
        height = 162.5,
        birth = '00/05/26'    
    where name = '김민지';