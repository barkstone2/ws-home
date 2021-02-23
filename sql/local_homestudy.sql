
create table board(
bNo number not null primary key,
bSubject varchar2(50) not null,
bContent varchar2(500) not null,
bWriter varchar2(50) not null,
wDate timestamp default sysdate not null,
bPw varchar2(50),
bHit number default 0 not null,
bReplyCount number default 0 not null,
thumbsUpCount number default 0 not null,
thumbsDownCount number default 0 not null
);

create sequence seq_board
start with 1
increment by 1
MINVALUE 1;
