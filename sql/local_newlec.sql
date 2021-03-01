
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


insert into notice values(seq_notice.nextval,'力格1','郴侩1', default, default, default, '1');
insert into notice values(seq_notice.nextval,'力格2','郴侩2', default, default, default, '1');
insert into notice values(seq_notice.nextval,'力格3','郴侩3', default, default, default, '1');
insert into notice values(seq_notice.nextval,'力格4','郴侩4', default, default, default, '1');
insert into notice values(seq_notice.nextval,'力格5','郴侩5', default, default, default, '1');
insert into notice values(seq_notice.nextval,'力格6','郴侩6', default, default, default, '1');
insert into notice values(seq_notice.nextval,'力格7','郴侩7', default, default, default, '1');

insert into notice values(seq_notice.nextval,'力格8','郴侩8', default, default, default, '1');
insert into notice values(seq_notice.nextval,'力格9','郴侩9', default, default, default, '1');
insert into notice values(seq_notice.nextval,'力格10','郴侩10', default, default, default, '1');
insert into notice values(seq_notice.nextval,'力格11','郴侩11', default, default, default, '1');
insert into notice values(seq_notice.nextval,'力格12','郴侩12', default, default, default, '1');
insert into notice values(seq_notice.nextval,'力格13','郴侩13', default, default, default, '1');
insert into notice values(seq_notice.nextval,'力格14','郴侩14', default, default, default, '1');
insert into notice values(seq_notice.nextval,'力格15','郴侩15', default, default, default, '1');
insert into notice values(seq_notice.nextval,'力格16','郴侩16', default, default, default, '1');
insert into notice values(seq_notice.nextval,'力格17','郴侩17', default, default, default, '1');
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

