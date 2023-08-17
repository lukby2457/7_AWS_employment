-- 1. employee 테이블에서 이름이 '박수진'의 정보를 출력 (이름, 직급, 부서만)
declare
    v_name          varchar2(20);
    v_position      varchar2(20);
    v_department    varchar2(50);
begin
    select name, position, department
    into v_name, v_position, v_department
    from employee
    where name = '박수진';
    
    dbms_output.put_line(v_name);
    dbms_output.put_line(v_position);
    dbms_output.put_line(v_department);
end;

-- 2. person 테이블에서 홍진호가 '성인/미성년자'인지 판별해서 출력
declare
    v_name      varchar2(20);
    v_age       number;
    v_adult     varchar2(20) := '미성년자';
begin
    select name, extract(year from birth)
    into v_name, v_age
    from person
    where name = '홍진호';

    v_age := extract(year from sysdate) - v_age;
    
--    dbms_output.put_line(v_age);

    if v_age >= 19 then
        v_adult := '성인';
    end if;
    
    dbms_output.put_line(v_name || '님은 ' || v_adult || '입니다.');
end;

-- 3. employee 전체 테이블에서 기술부의 연봉을 10% 인상
declare
    cursor emp_cur is
        select * from employee where department = '기술부';
    v_salary    number;
begin
    for emp in emp_cur loop
        v_salary := emp.salary;
        v_salary := v_salary * 1.1;
        
        update employee
            set salary = v_salary
        where idx = emp.idx;
    end loop;
end;

select name, salary, department
from employee
where department = '기술부';