select banner from v$version;

select * from person;

select * from account;
desc account;

update account
    set userpw = '1234567'
    where userpw = '123456';
    
update account
    set userpw = 'qwe@123'
    where userpw = 'qwe123';

commit;