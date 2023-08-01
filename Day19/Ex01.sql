-- 계정 생성
create user c##itbank identified by it;
-- 12부터 일반 계정은 c##을 붙여야 한다

-- 생성 한 계정에 권한 부여
grant dba,resource,connect to c##itbank;