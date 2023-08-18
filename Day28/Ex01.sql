-- 함수(function) : 일정 코드를 실행 후 결과 값을 반환하는 구문

-- 프로시저 vs 함수
-- 1. 공통점
-- - 일정 길이의 코드를 저장하고 재사용하는 방식
-- - 매개변수를 받아서 코드를 작성할 수 있다
-- 2. 차이점
-- - 프로시저는 매개변수에 in, out을 설정 가능. 함수는 무조건 in으로 설정. out은 안됨
-- - 프로시저는 반환값이 없어도 되지만, 함수는 무조건 가져야 함
-- - 프로시저는 exec 같은 구문으로만 실행된다
-- - 함수는 select 구문에서 주로 사용된다

create or replace function adder(
    n1  number,
    n2  number
)return number 
as
    result  number;
begin
    result := n1 + n2;
    
    return result;
end;

-- exec adder(10, 5);   단독으로는 실행 불가능

-- select 구문내에서 사용
select adder(10, 5) from dual;
select name, adder(idx, salary) from employee;

-- 프로시저 구문 내에서도 사용 가능
declare
    sal_1   number;
    sal_2   number;
    result  number;
begin
    select salary into sal_1 from employee where idx = 20230109;
    select salary into sal_2 from employee where idx = 20230105;
    
    result := adder(sal_1, sal_2);
    
    dbms_output.put_line('결과 : ' || result);
end;