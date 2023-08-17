-- 아래 프로시저가 실행되게 한다
-- 전달된 employee의 idx의 급여를 n% 인상
create or replace procedure quiz3(
    inc     number
) as
begin
    update employee
        set salary = salary * (1 + (inc / 100));
    commit;
end;

exec quiz3(10);
select name, salary from employee;
rollback;