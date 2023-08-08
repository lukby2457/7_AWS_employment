select idx, name, dep_idx from emp order by idx;

update emp set dep_idx = 400 where idx = 20230102;
update emp set dep_idx = 100 where idx = 20230103;
update emp set dep_idx = null where idx = 20230104;
update emp set dep_idx = 100 where idx = 20230105;
update emp set dep_idx = 300 where idx = 20230106;
update emp set dep_idx = 300 where idx = 20230107;
update emp set dep_idx = 200 where idx = 20230108;
update emp set dep_idx = 400 where idx = 20230109;
update emp set dep_idx = 100 where idx = 20230110;
update emp set dep_idx = 300 where idx = 20230111;

commit;

