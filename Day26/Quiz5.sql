-- 1. person 테이블에서 height가 큰 사람의 이름을 출력
declare
    v_name    varchar2(20);
    cursor  cur_per is
        select height from person;
    v_max   number := 0;
begin
    for per in cur_per() loop
        if per.height > v_max then
            v_max := per.height;
        end if;
    end loop;
    
    select name into v_name from person where height = v_max;
    
    dbms_output.put_line(v_name || v_max);
end;

-- 2. person 테이블의 모든 행의 나이를 판별해서 per_test에 이름, 나이, 성인/미성년자를 기입
delete from per_test;
commit;

select * from person;

set serveroutput on;

declare
    v_name      varchar2(20);
    v_birth     number;
    v_age       number;
    v_msg       varchar2(20);
    cursor cur_per is
        select * from person;
begin
    for per in cur_per() loop
        v_name := per.name;
        v_birth := extract(year from per.birth);
        
        v_age := extract(year from sysdate) - v_birth;
        
        if v_age >= 19 then
            v_msg := '성인';
        else
            v_msg := '미성년자';
        end if;
        
--        dbms_output.put_line(v_name || v_age || v_msg);
       
        insert into per_test values(v_name, v_age, v_msg);
    end loop;
    
    commit;
end;

rollback;