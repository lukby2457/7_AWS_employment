create table test (
    gender  varchar2(6) constraint test_gender check(gender in ('남', '여'))  not null
);

drop table test;

insert into test values('남');
insert into test values('여');
insert into test values('뭐');
insert into test values('몰');

-- ※ not null을 지정하지 않으면 null값도 들어간다
insert into test values(null);

select * from test;