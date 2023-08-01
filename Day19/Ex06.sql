-- ※ 학원 실습 계정과 혼자서 연습하는 계정을 나누어 하면 비교하기 좋다
-- ※ 아래는 system 계정으로 진행한다
-- 계정 생성 및 삭제 (+ 권한 부여)

-- 계정 생성
create user c##user1 IDENTIFIED by hello;

-- 권한 부여
grant dba, resource, connect to c##user1;

-- 계정 삭제
drop user c##user1;

-- 패스워드 변경
alter user c##itbank IDENTIFIED by it1234;

-- 트랜젝션은 테이블 행 변환할때만 발생
-- 위 명령어들은 커밋할 필요가 없다