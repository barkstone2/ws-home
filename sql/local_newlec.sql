
drop table notice;
CREATE TABLE NOTICE(
ID NUMBER NOT NULL,
TITLE NVARCHAR2(100) NOT NULL,
CONTENT CLOB,
REGDATE TIMESTAMP (6) DEFAULT systimestamp NOT NULL,
HIT NUMBER DEFAULT 0 NOT NULL,
PUB NUMBER(1,0) DEFAULT 0 NOT NULL,
memberID number NOT NULL,
CONSTRAINT "NOTICE_PK" PRIMARY KEY ("ID")
);

alter table notice add CONSTRAINT fk_notice_memberId
   FOREIGN KEY (memberID)
   REFERENCES member(id);
   
drop sequence seq_notice;
create sequence seq_notice;


insert into notice values(seq_notice.nextval,'����1','����1', default, default, default, '1');
insert into notice values(seq_notice.nextval,'����2','����2', default, default, default, '1');
insert into notice values(seq_notice.nextval,'����3','����3', default, default, default, '1');
insert into notice values(seq_notice.nextval,'����4','����4', default, default, default, '1');
insert into notice values(seq_notice.nextval,'����5','����5', default, default, default, '1');
insert into notice values(seq_notice.nextval,'����6','����6', default, default, default, '1');
insert into notice values(seq_notice.nextval,'����7','����7', default, default, default, '1');

insert into notice values(seq_notice.nextval,'����8','����8', default, default, default, '1');
insert into notice values(seq_notice.nextval,'����9','����9', default, default, default, '1');
insert into notice values(seq_notice.nextval,'����10','����10', default, default, default, '1');
insert into notice values(seq_notice.nextval,'����11','����11', default, default, default, '1');
insert into notice values(seq_notice.nextval,'����12','����12', default, default, default, '1');
insert into notice values(seq_notice.nextval,'����13','����13', default, default, default, '1');
insert into notice values(seq_notice.nextval,'����14','����14', default, default, default, '1');
insert into notice values(seq_notice.nextval,'����15','����15', default, default, default, '1');
insert into notice values(seq_notice.nextval,'����16','����16', default, default, default, '1');
insert into notice values(seq_notice.nextval,'����17','����17', default, default, default, '1');
commit;

select * from notice;


create table member(
id number unique not null,
name nvarchar2(100) primary key not null,
pwd nvarchar2(100) not null,
email nvarchar2(100)
);
create sequence seq_member;
select * from member;

insert into member values(seq_member.nextval, 'newlec', '111', '');
commit;

create or replace view NoticeView
as
select n.*, m.name member_Name from notice n
join member m on n.memberId = m.id;

select * 
from
(
select rownum rn, nv.*
from(
    select * 
    from noticeView 
    order by regdate desc) nv
)
where rn between 1 and 10;

select * from 
noticeListView
where rn=(select rn from noticeListView where id=16)-1;

create or replace view noticeListView
as
select rownum rn, a.* from
(select * from notice
order by regdate desc) a;

