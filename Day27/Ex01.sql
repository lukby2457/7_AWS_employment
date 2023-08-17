set serveroutput on;

declare
    -- 커서 : 테이블을 가리키는 객체
    cursor cur_per is 
        select * from person;
begin
    for per in cur_per() loop
        dbms_output.put_line(per.name || per.height || per.birth);
    end loop;
end;

-- cursor는 jdbc의 resultset과 비슷하다 생각하면 된다
