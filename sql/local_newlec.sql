CREATE TABLE NOTICE
( ID NUMBER NOT NULL,
TITLE NVARCHAR2(100) NOT NULL,
WRITER_ID NVARCHAR2(50) NOT NULL,
CONTENT CLOB,
REGDATE TIMESTAMP (6) DEFAULT systimestamp NOT NULL,
HIT NUMBER DEFAULT 0 NOT NULL,
FILES NVARCHAR2(1000),
PUB NUMBER(1,0) DEFAULT 0 NOT NULL,
CONSTRAINT "NOTICE_PK" PRIMARY KEY ("ID")
)

insert into notice values(1,'test','testId','this is test', default, default, '', default);
commit;