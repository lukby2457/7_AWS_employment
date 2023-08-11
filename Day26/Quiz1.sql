-- 연습)
-- employee 테이블에서 사원번호 20230102인 
-- 사람의 이름, 성별, 직급, 부서, 봉급을 sqldeveloper 콘솔에 출력해보세요
-- ※ 출력 형태는 자유롭게

select 
    name, gender, position, department, salary 
    from employee 
    where idx = 20230102;

set serveroutput on;

declare
    v_name      varchar2(20);
    v_gender    varchar2(6);
    v_position  varchar2(20);
    v_dep       varchar2(50);
    v_salary    number;
begin
    select
        name, gender, position, department, salary
        into v_name, v_gender, v_position, v_dep, v_salary
        from employee
        where idx = 20230102;
        
    dbms_output.put_line('이름 : ' || v_name);
    dbms_output.put_line('성별 : ' || v_gender);
    dbms_output.put_line('직급 : ' || v_position);
    dbms_output.put_line('부서 : ' || v_dep);
    dbms_output.put_line('봉급 : ' || v_salary);
end;