create table per_test(
    name    varchar2(20),
    age     number,
    adult   varchar2(20)
);

declare
    v_name      varchar2(20);
    v_age       number;
    v_adult     varchar2(20) := '미성년자';
begin
    select name, extract(year from birth)
        into v_name, v_age
    from person
    where name = '유은애';
    
    v_age := extract(year from sysdate) - v_age;
    
    if v_age >= 19 then
        v_adult := '성인';
    end if;
    
    insert into per_test values(v_name, v_age, v_adult);
    commit;
    
    dbms_output.put_line('insert 성공');
end;

-- 자동 commit이 되지 않는다
rollback;