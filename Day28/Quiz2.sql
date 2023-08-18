-- 1. 절대값을 반환하는 함수
create or replace function abso(
    n1  number
) return number
as
    result number;
begin
    if n1 < 0 then
        result := n1 * (-1);
    else
        result := n1;
    end if;
    
    return result;
end;

-- 해설
create or replace function abs(
    num number
) return number
as
    result number;
begin
    if(num < 0)  then
        result := num * -1;
    end if;
    
    return result;
    
end;

select abso(1) from dual;
select abso(-2) from dual;

-- 2. 전달한 수를 거꾸로 만들어 반환하는 함수
create or replace function rotate(
    p_num     number
) return number
as
    num     number;
    rev     number := 0;
begin
    num := p_num;
    while num != 0 loop
        rev := rev * 10 + mod(num, 10);
        num := trunc(num / 10);
    end loop;
    
    return rev;
end;

-- 해설
create or replace function rev (
    num     number
)return number
as
    n       number := num;
    rev     number := 0;
begin
    while(n != 0) loop
        rev := rev * 10 + mod(n, 10);
        n := trunc(n / 10);
    end loop;
    
    return rev;
end;

select rotate(1024), rev(5678) from dual;