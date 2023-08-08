-- 외래키
-- 1. 다른 테이블의 열을 참조하는 키
-- 2. 참조하는 열에 없는 데이터면 현재 열에도 데이터가 추가되지 않음 (참조 무결성)
-- 3. 테이블을 정규화로 나눈 후 관계를 표현시 사용하는 키

select * from emp order by idx;

-- ※ 외래키 세팅 후 아래 두 코드 실행 후 비교
insert into emp values(1007, 'test', 1000);
insert into emp values(1007, 'test', 500);
-- 비교 결과
-- 1. dep_idx에 1000을 집어 넣으니 에러. 참조 중인 dep테이블 idx에 1000이 없음
-- 2. dep_idx에 500을 집어 넣으니 실행됨. 참조 중인 dep테이블 idx에 500이 있음

-- 바라보는 열 -> 부모
rollback;

