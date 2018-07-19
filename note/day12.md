# Day 12
***
### Oracle Database 설치/ 환경설정
- 계정 생성/변경  
cmd창에
~~~
sqlplus "/as sysba"
~~~
계정 생성
~~~
create user 계정명 identified by 비밀번호;
~~~
권한부여
~~~
grant connect, resource to 계정
~~~
유저를 변경해서 스크립트 진행
~~~
conn 계정명/비밀번호
~~~
계정 바꾸기
~~~
alter user system identified by 비밀번호;
~~~
계정 확인
~~~
show user;
~~~

### SQL의 종류
- DDL
  - Data Definition Language
  - Database 구조 정의(Create, Alter, Drop)
- DQL
  - Data Query Language
  - 데이터검색(select)
- DML
  - Data Manipulation Language
  - 데이터 변경/추가(Insert, Update, Delete)
- DCL
  - Data Control Language
  - 권한지정, 제거(Grant/Revoke)


### SQL 명령어
- table create
> 형식:  
create table 테이블명 (필드명 자료형, 필드명 자료형(크기), ...);

~~~sql
create table test(
    no number,
    name varchar2(10) not null -- not null : option
);
~~~

- 테이블 구조 확인

~~~sql
desc test;
-- test table의 구조 확인
~~~

- 데이터 추가
> 형식:  
insert into 테이블명 values(값1, "값2", ...);

~~~sql
insert into test values(1, 'subin');
~~~
varchar2 타입의 데이터가 들어가야 할 자리에 스트링을 넣어줄 때 double quotation mark 대신 **single quotation mark를 사용해야 에러가 나지 않음**

- 테이블 확인

~~~sql
select * from tab;
~~~

- 현재 날짜

~~~sql
select sysdate from dual;
--가상의 table dual
~~~

- 제약조건(constraint)
> 형식 :  
create table 테이블명( 컬럼명 데이터 타입 constraint 제약조건이름 제약조건)

~~~sql
create table userlist (
    id varchar2(10) constraint id_pk primary key,
    name varchar2(10) not null
    -- id_pk : 제약조건 이름
);
~~~

- select문(조회/검색)

~~~sql
select * from emp2;
select empno, name from emp2; --원하는 필드(컬럼)만 조회
~~~
~~~sql
select birthday as 생년월일, deptno as "부서 번호", emp_type 타입, position
from emp2;
-- as: 컬럼 이름 바꾸어 출력(as 생략 가능)
-- 공백 있을 시에 double quotation mark로 묶어줌
~~~

- 중복제거(distinct)

~~~sql
select distinct grade from student; --distinct : 중복 제거
~~~


- 조건검색(where)

~~~sql
select name, position
from professor  -- select, from 은 필수사항, where은 선택사항
where position='정교수';
~~~
~~~sql
-- 조건 여러개 검색
select name, position
from professor  
where position='정교수' and id='sweety'; -- and, or연산으로 조건 추가
~~~

- like 연산자
> 모든 : %  
한 문자 : _

~~~sql
select name from professor where name like '__';
-- 이름이 두 글자인 사람만 출력
~~~

### 예제
1. 이름이 '김영조'인 사람 출력
~~~sql
select *
from professor
where name='김영조';
~~~
2. '김'씨 성 가진 사람 출력
~~~sql
select *
from professor
where name='김%';
~~~
3. 이름이 두 글자인 사람 출력
~~~sql
select *
from professor
where name='__';
~~~
4. id에 s나 a 글자가 들어가는 사람을 출력
~~~sql
select *
from professor
where id like '%s%' or id like '%a%';
~~~
5. 전임강사 출력
~~~sql
select *
from professor
where position='전임강사';
~~~
6. multi table 생성하기 필드는 name, age, address
~~~sql
create table multi(
    name varchar2(10),
    age number,
    address varchar2(20)
);
~~~
7. multi table에 레코드 3개이상 넣기
~~~sql
insert into multi values('subin',22,'서울 송파구');
insert into multi values('sujeong',22,'서울 서초구');
insert into multi values('jihye',23,'서울 강남구');
insert into multi values('yeji',21,'경기도 천안시');
~~~
