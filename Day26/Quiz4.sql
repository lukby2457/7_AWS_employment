-- 문제1 : 1 ~ 10까지의 합계를 출력
declare
    v_sum number := 0;
begin
    for i in 1..10 loop
        v_sum := v_sum + i;
    end loop;
    
    dbms_output.put_line('sum = ' || v_sum);
end;

-- 문제2 : 10 ~ 1까지의 누적곱 (= 팩토리얼)을 출력
declare
    v_mul   number := 1;
begin
    for i in 1..10 loop
        v_mul := v_mul * i;
    end loop;
    
    dbms_output.put_line(v_mul);
end;

declare
    fac number := 1;
begin
    for i in reverse 1..10 loop
        fac := fac * i;
    end loop;
    
    dbms_output.put_line(fac);
end;

-- 문제3 : 6의 약수를 모두 출력
declare
    v_num   number := 6;
    v_avg   number;
begin
    for i in 1..v_num loop
        v_avg := mod(v_num, i);
        if v_avg = 0 then
            dbms_output.put_line(i);
        end if;
    end loop;
end;