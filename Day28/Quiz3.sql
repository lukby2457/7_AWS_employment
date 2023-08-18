-- 1. Account 테이블 삭제시 실행할 Account_del 트리거를 작성한다
-- - delete 작업시 account_back이라는 테이블에 삭제할 데이터를 insert한다
create table account_back(
    userid      varchar2(20)    not null,
    userpw      varchar2(20)    not null,
    nick        varchar2(100)   not null,
    email       varchar2(100)   not null,
    join_date   date,
    del_date    date            default sysdate,
    action      varchar2(10)
);

drop table account_back;

create or replace trigger account_del
    after delete or update on account
    for each row
declare
    v_action    varchar2(10);
begin
    if deleting then
        v_action := 'delete';
    elsif updating then
        v_action := 'update';
    end if;
    
    insert into account_back(userid, userpw, nick, email, join_date, action)
    values(:old.userid, :old.userpw, :old.nick, :old.email, :old.join_date, v_action);
end;
-- 2. 작성 후 트리거 테스트
delete from account where idx = 1006;
delete from account where idx = 1008;
update account set email = 'itbank@kakao.com' where idx = 1002;

select * from account;
select * from account_back;
rollback;
commit;
