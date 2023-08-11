-- employee 테이블에서 직급이 '사원'인 직원의 연봉을 10% 인상 시켜본다
declare
    cursor emp_cur is
        select * from employee where position = '사원';
    v_salary    number;
begin
    for emp in emp_cur() loop
        v_salary := emp.salary;
        
        v_salary := v_salary * 1.1;
        
--        dbms_output.put_line(v_idx || v_name || v_position || v_salary);
        update employee 
            set salary = v_salary 
        where idx = emp.idx; 
    end loop;
    
    commit;
end;

rollback;