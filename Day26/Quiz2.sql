-- person 테이블에서 한 사람의 이름과 생일을 가져와서
-- 성인/미성년자로 구분해서 출력 (19)
declare
    v_name      varchar2(20);
    v_birth     date;
    v_cur       date := sysdate;
    v_age       number;
    v_pos       varchar2(20);
begin
    select name, birth
        into v_name, v_birth
        from person
    where name = '박철수';
    
    v_age := trunc((v_cur - v_birth)/365);
    
    v_age := v_age - 5;
    
    if v_age >= 19 then
        v_pos := '성인';
    else
        v_pos := '미성년자';
    end if;
    
    dbms_output.put_line(v_name || '님은 ' || v_pos || '입니다');
end;