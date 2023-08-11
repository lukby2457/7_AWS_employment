-- pl/sql 조건문
declare
    v_age       number := 19;
    v_result    varchar(20);
begin
    -- <, >, <=, >=, =, !=
    if v_age >= 19 then
        v_result := '성인';
    else                        -- else는 then이 없다
        v_result := '미성년자';
    end if;
    
    dbms_output.put_line('당신은 ' || v_result || '입니다');
end;