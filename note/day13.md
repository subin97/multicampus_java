# Day 13
***
### 관계형 Database
> 테이블 형태로 database를 정리한 것. 속도는 느리나 가장 검증되어 있어 가장 많이 쓰이는 형태이다.

### 자료의 범위
레코드(튜플)<file<database<databank

### 도메인
> 필드를 제외한 열(속성)의 집합

### delete vs. drop
delete : 필드(구조물) 은 남겨두고 레코드만 삭제  
drop : 구조와 레코드 모두 삭제
~~~sql
delete test;  
-- delete 테이블명 : 테이블 내의 레코드 모두 삭제
~~~
~~~sql
drop table test;  -- table 자체 삭제
~~~

### 되돌리기
~~~sql
update professor set name='이도연';        -- 전체 레코드 수정
rollback;       -- 되돌리기
~~~
- rollback 과 commit 은 dml명령(select, insert, update, delete)에서만 사용

### 예제
1. 교수 테이블 이용 - 직책에서 정교수를 전임교수로 전체 변경

~~~sql
update professor set position='전임교수' where position='정교수';
~~~

2. pay가 300이하인 사람들의 급여를 5퍼센트 인상하시오

~~~sql
update professor set pay=pay*1.05 where pay<=300;
~~~

3. home page없는 교수들 출력해서 null 표시 삭제

~~~sql
update professor set hpage=' ' where hpage is null;
~~~

4. bonus에서 null 처리 되어 있는 사람 0으로 표시

~~~sql
update professor set bonus=0 where bonus is null;
~~~

5. emp2 테이블 이용 - 취미가 술인 사람들을 찾아서 음주가무로 변경

~~~sql
update emp2 set hobby='음주가무' where hobby='술';
~~~

6. 이씨 성 가진 모든 사람들 중에 계약직인 사람들을 인턴직으로 변경

~~~sql
update emp2 set emp_type='인턴직' where name like '이%' and emp_type='계약직';
~~~
