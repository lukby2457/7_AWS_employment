-- 프로시저 삭제
drop procedure test;

-- 아래 프로시저가 실행되게 한다
-- 전달된 employee의 idx의 급여를 10% 인상
create or replace procedure quiz2(
    p_idx number
) as
    v_salary    number;
begin
    select salary
    into v_salary
    from employee
    where idx = p_idx;
    
    v_salary := v_salary * 1.1;
    
    update employee
        set salary = v_salary
    where idx = p_idx;
    
    commit;
end;


exec quiz2(20230109);

select idx, name, salary from employee where idx = 20230109 or idx = 20230102;
select idx, name, salary from employee where idx in (20230102, 20230109);

rollback;
commit;