-- employee의 이름과 고용일을 가져와서 n년차를 출력하세요
declare
    v_name      varchar2(20);
    v_h_date    date;
    v_cur       date := sysdate;
    v_result    number;
begin
    select
        name, h_date
        into v_name, v_h_date
        from employee
        where idx = 20230106;
    
    v_result := trunc((v_cur - v_h_date)/365);
    
    dbms_output.put_line(v_name || '님의 연차는 ' || v_result || '년차 입니다');
end;

-- 년,월,일 추출 함수
select
    extract(year from sysdate) as year,
    extract(month from sysdate) as month,
    extract(day from sysdate) as day
from dual;

declare
    v_name      varchar2(20);
    v_hyear     number;
    v_cyear     number := extract(year from sysdate);
    v_result    number;
begin
    select
        name, extract(year from h_date)
        into v_name, v_hyear
        from employee
        where idx = 20230106;
    
    v_result := v_cyear - v_hyear;
    
    dbms_output.put_line(v_name || '님의 연차는 ' || v_result || '년차 입니다');
end;
