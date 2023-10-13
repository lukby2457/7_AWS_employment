select * from board order by idx desc;

create sequence board_idx
    start with 110
    increment by 1
    minvalue 101
    maxvalue 9999999999999999999999999999
    nocache;
    
insert into 
    board(title, contents, writer, img_path) 
    values('Dummy7', '더미 데이터입니다', '더미7', default);
    
commit;



