create table Student(
  id int  primary key ,
  username varchar(32) not null default '' comment '收款名称',
  sex int  not null default 0 comment '创建者id',
  score int  not null default 0 comment '创建者id'
);
create index uk_cid_name on Student (username);
