-- 프로시저 실행1*
-- 다른 구문과 섞어 사용할때
begin
    test();
end;

-- 실행2
-- 단독으로 실행할때
execute test();

-- 실행3*
exec test();