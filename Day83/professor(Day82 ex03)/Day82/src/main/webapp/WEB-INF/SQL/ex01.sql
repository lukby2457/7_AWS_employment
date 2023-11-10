create sequence file_seq
    start with 1001
    increment by 1
    minvalue 1001
    maxvalue 9999999999999999
    nocache;
    
create table upload (
    idx         number          default file_seq.nextval,
    name        varchar2(300)   not null,
    path        varchar2(900)   not null,
    uploader    varchar2(150)   not null,
    memo        varchar2(150),
    
    constraint upload_pk_idx primary key(idx)
);

alter table upload add upload_date date default sysdate;

desc upload;

insert into 
    upload(name, path, uploader, memo)
    values('세션.pdf', 'E:/springUpload/', '홍길동', '메세지~');
    
select * from upload;
