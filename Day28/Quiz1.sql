-- Quiz
-- 1. sal_up이라는 프로시저를 생성한다
-- 2. sal_up은 employee의 idx와 연봉 상승률(n%)를 전달하면
--    해당 idx의 사원의 연봉을 n% 증가 시키는 프로시저이다
-- 3. 그 후 증가된 연봉을 반환한다
set serveroutput on;

create or replace procedure sal_up(
    p_idx       in  number,
    p_per       in  number,
    result      out number
)as 
    v_salary    number;
begin
    select salary
    into v_salary
    from employee
    where idx = p_idx;
    
    v_salary := v_salary * (1 + (p_per / 100));
    
    result := v_salary;
    
    update employee
        set salary = result
    where idx = p_idx;
    
    commit;
end;



declare
    result  number;
begin
    sal_up(20230104, 10, result);
    
    dbms_output.put_line('증가된 연봉은 ' || result);
end;