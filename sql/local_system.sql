
create user mvc
identified by 1234
default tablespace users
temporary tablespace temp;

grant connect, resource, dba to mvc;


create user homestudy
identified by 1234;

grant connect, resource, dba to homestudy;


create user NEWLEC
identified by 11111;

grant connect, resource, dba to newlec;