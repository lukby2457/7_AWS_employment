-- dual : 임시 테이블. 연산자나 sql함수 결과를 출력시 사용됨
select 100 + 200, 100 - 200, round(100 / 3, 2), mod(100, 6) from dual;

-- 형변환
select 100 + '200' from dual;
select '100' + '20' from dual;

-- ※ Oracle에서는 자바처럼 이어 붙지 않는다
select 'hello' + 'world' from dual;
select concat('hello', 'world') from dual;

-- to_char() : 문자로 형변환
select to_char(100) from dual;

-- to_number() : 숫자로 형변환
select to_number('654321') from dual;

-- to_date() : 날짜로 형변환
select to_date('20230130') from dual;
select to_date('2023-06-25') from dual;

select to_date('20230222','YYYY-MM-DD') from dual;
select to_char(sysdate, 'YYYY-MM-DD') from dual;

select to_char(to_date('20230222'),'YYYY-MM-DD') from dual;

select to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS') as time from dual;






desc person;
select * from person;

insert into person values('test', 200, '3000-01-01');
delete from person where name = 'test';

commit;
rollback;

