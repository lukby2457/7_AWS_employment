-- 트리거 생성
create or replace trigger test_del                      -- 트리거명
    after delete or update on tri_test                  -- [after | before][insert|delete|update] on 테이블명
    for each row                                        -- 각 행마다 모두 적용해라 (기본옵션)
declare
    v_action  varchar2(10) := 'update';
begin
    if deleting then                                    -- deleting : 삭제 작업일 경우 '참'
        v_action := 'delete';
    elsif updating then                                 -- updating : 수정 작업일 경우 '참'
        v_action := 'update';                           -- inserting : 추가 작업일 경우 '참'
    end if;

    insert into tri_back(idx, name, age, action)        -- :old는 trigger 발생 이전 열 데이터
    values (:old.idx, :old.name, :old.age, v_action);   -- :new는 trigger 발생 이후 열 데이터
end;

select * from tri_test;