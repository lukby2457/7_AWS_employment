-- 연습)
-- employee 테이블에서 사원번호 20230102인 
-- 사람의 이름, 성별, 직급, 부서, 봉급을 sqldeveloper 콘솔에 출력해보세요
-- ※ 출력 형태는 자유롭게
declare
    v_name      varchar2(20);
    v_gender    varchar2(6);
    v_position  varchar2(20);
    v_dep       varchar2(20);
    v_salary    number;
begin
    select
        name, gender, position, department, salary
        into v_name, v_gender, v_position, v_dep, v_salary
        from employee
        where idx = 20230102;
        
    dbms.output.put_line('이름 : ' || v_name);
    dbms.output.put_line();
    dbms.output.put_line();
    dbms.output.put_line();
    dbms.output.put_line();
end;