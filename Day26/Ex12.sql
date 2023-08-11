-- 커서
declare
    -- 커서 : 테이블을 가리키는 객체
    cursor cur_per is 
        select * from person;
begin
    for per in cur_per() loop
        dbms_output.put_line(per.name || per.height || per.birth);
    end loop;
end;

-- 다양한 커서가 있으니 따로 공부