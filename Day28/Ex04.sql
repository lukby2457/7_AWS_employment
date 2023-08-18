create or replace trigger tri_insert
    before insert on tri_test
    for each row
declare
    
begin
    if :new.idx < 1000 then
        raise_application_error(-20001, '1000 이상의 번호를 입력하세요');
        -- 예외를 발생시키는 구문. 구문이 취소된다
    end if;
end;

insert into tri_test values(1005, '김미영', 42);

insert into tri_test values(900, '김철수', 24);

select * from tri_test;
commit;