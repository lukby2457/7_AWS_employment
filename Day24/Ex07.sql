-- savepoint [이름]
-- 1. 트랜잭션의 현재 상태를 저장할 수 있다
-- 2. commit을 하거나 그냥 rollback시 savepoint는 모두 제거됨
-- 3. rollback to (savepoint명)
-- 4. 뒤로 갔다가 앞으로 돌아오는건 불가능

insert into test_student values('박지영',70,77,78);
savepoint s1;

insert into test_student values('김민수',88,87,78);
savepoint s2;

insert into test_student values('이현우',78,98,67);
savepoint s3;

delete from test_student where name = '김민수';

rollback;
rollback to s1;
rollback to s2;
rollback to s3;

commit;