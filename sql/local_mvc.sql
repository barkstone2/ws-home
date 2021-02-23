
create table mvc_board(
    bid number(4) primary key,
    bName varchar2(20),
    bTitle varchar2(100),
    bContent varchar2(300),
    bDate Date default sysdate,
    bHit number(4) default 0,
    bGroup number(4),
    bStep number(4),
    bIndent number(4)
);
drop sequence seq_mvc_board;
create sequence seq_mvc_board;
