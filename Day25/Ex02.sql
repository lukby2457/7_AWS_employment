-- 교수 정보
insert into professor values(2001, '김민철', '남', 100, '010-8765-1234', 'k@naver.com');
insert into professor values(2002, '이미현', '여', 300, '010-6767-3412', 'l@daum.net');

select * from professor order by idx;

commit;

-- 연습1 : 교수의 정보를 출력 (단, 교수 번호, 교수 이름, 교수 연락처, 전공 이름, 전공 연락처)
select A.idx, A.name, A.phone, B.name as dep_name, B.phone as dep_phone
    from professor A inner join department B
    on A.dep_code = B.idx;

-- 연습2 : 물리학 교수의 정보를 출력 (단, 교수 번호, 교수 이름, 교수 연락처, 전공 이름, 전공 연락처)
select A.idx, A.name, A.phone, B.name as dep_name, B.phone as dep_phone
    from professor A inner join department B
    on A.dep_code = B.idx
    where B.name = '물리학';
    
-- multi join
-- 학생 정보를 출력 (단, 학번, 학생이름, 전공 이름, 전공 교수 이름) stuA, depB, proC
select A.idx, A.name, B.name as dep_name, C.name as pro_name
    from student A 
    inner join department B on A.dep_code = B.idx
    inner join professor C on B.idx = C.dep_code;