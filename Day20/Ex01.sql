create sequence account_seq
    start with 1003
    increment by 1
    minvalue 1001
    maxvalue 999999999999999999
    nocache;
    
-- ※ 아래는 잘못 만들었을 경우 사용해서 지우세요
drop sequence account_seq;

-- ※ 아래는 테이블의 열 정보를 변경 (힘들면 그냥 클릭을 바꾸자)
alter table account modify idx number default account_seq.nextval;

insert into 
    account(userid, userpw, nick, email)
    values('root', 'qwe123', '관리자1', 'root@gmail.com');
    
select * from account order by idx desc;

commit;