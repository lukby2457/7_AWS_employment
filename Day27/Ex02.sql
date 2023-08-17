-- 프로시저
-- SQL구문과 프로그래밍 문장을 조합해서 사용하는 코드 블록 (= 여태 배운 pl구문)
-- 이를 저장해서 사용하는 것이 '저장된 프로시저'라고 한다
-- ※ 자바로 치면 void형 메서드로 생각하면 좋다
-- 함수 : 무조건 값을 반환
-- 프로시저 : 값을 반환x (void)

-- 프로시저 생성(ex02.sql)
create or replace procedure test as

begin
    for i in 1..5 loop
        dbms_output.put_line(i || ' : Hello World!!!');
    end loop;
end;

-- 실행은 ex03.sql에서