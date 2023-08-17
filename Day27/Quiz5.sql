-- employee의 아무나 2명의 연봉을 가져온다
-- 그 후 앞서 ex07에서 만들었던 test4() 프로시저에 두 연봉을 전달
-- 결과로 받은 값을 화면에 출력
declare
    v_sal1    number;
    v_sal2    number;
    result    number;
begin
    select salary
    into v_sal1
    from employee
    where idx = 20230109;
    
    select salary
    into v_sal2
    from employee
    where idx = 20230104;
    
    test4(v_sal1, v_sal2, result);
    
    dbms_output.put_line(result);
end;

select salary
    from employee 
    where idx = 20230109 or idx = 20230104;
    
    
    
declare
    result number;
begin
    test4(3, 5, result);
end;