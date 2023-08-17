-- 아래 구문이 실행되게 프로시저를 생성
-- ※ person 테이블에서 전달된 이름을 찾아 열정보를 출력
create or replace procedure quiz1(
    p_name   varchar2
) as
    v_name      varchar2(20);
    v_height    number;
    v_birth     date;
begin
    select name, height, birth
    into v_name, v_height, v_birth
    from person
    where name = p_name;
    
    dbms_output.put_line(v_name || ' ' || v_height || ' ' || v_birth);
end;


exec quiz1('홍진호');