select * from dept81;

--dept81_copy 복제본 테이블 생성
create table dept81_copy
as
select * from dept81;

select * from dept81_copy;

create table emp_copy(
    empno number(38) primary key,
    ename varchar2(100),
    job varchar2(100),
    sal int,
    comm int,
    deptno int
    );
    
insert into emp_copy values (201, '홍길동', '관리사원', 100, 10, 101 );
insert into emp_copy values (202, '이순신', '개발사원', 200, 20, 102 );

select * from emp_copy;

--emp_view30 가상테이블 뷰 생성 (resource, connect 권한으로 불가능)
--관리자 사용자로 grant create view to 사용자;
create view emp_viw30
as
select empno, ename, deptno from emp_copy where deptno=101;

select * from emp_viw30;

--생성된 뷰 이름과 뷰 내용 확인
select view_name, text from user_views;

insert into emp_viw30 values (203, '강감찬', 102);
select * from emp_copy; -- 뷰를 통해 레코드 저장 가능

/*  가상 테이블 뷰를 사용하는 목적)
    1. 복잡한 쿼리문 단순화 가능
    2. 실제 테이블을 뷰를 통해서 숨길 수 있다. (보안면에서 유리)
*/

create table dept86(
    deptno int constraint dept86_deptno_pk primary key,
    dname varchar2(200) constraint dept86_dname_nn not null,
    LOC varchar2(50)
    );
    
insert into dept86 values ( 10, '영업부', '서울' );
insert into dept86 values ( 20, '인사부', '인천 송도' );

select * from dept86;

commit;

--dept86을 참조하는 외래키 테이블 생성
create table emp86(
    empno int constraint emp86_empno_pk primary key,
    ename varchar2(100) constraint emp86_ename_nn not null,
    sal int,
    job varchar2(50),
    comm int,
    deptno int constraint emp86_deptno_fk references dept86(deptno)
    );
    
    insert into emp86 values ( 101, '이순신', 3000, '영업사원', 300, 10 );
    insert into emp86 values ( 102, '강감찬', 6000, '영업과장', 600, 10 );
    insert into emp86 values ( 103, '홍길동', 5000, '인사과장', 0, 20 );
    
--deptno86의 공통컬럼(deptno)과 부서번호가 10인경우 equi 조인
select * from dept86, emp86 where dept86.deptno = 10 and emp86.deptno = 10 order by empno;

--복잡한 조인문 쿼리문을 가상 테이블 뷰를 통해 단순화
create view join_view
as
select empno, ename, job, sal, comm, dept86.deptno, dname
from dept86, emp86 
where dept86.deptno = 10 and emp86.deptno = 10 order by empno;

select * from join_view;
-- view 삭제 명령어 drop view 테이블명;


-- or replace 옵션 실습을 위한 뷰 생성
create view re_view
as
select empno, ename from emp86;

select * from re_view;

-- replace 옵션으로 sal추가
create or replace view re_view
as
select empno, ename, sal from emp86;

-- force 옵션을 사용해서 기존테이블이 없어도 뷰를 생성
create or replace force view for_view
as
select empno, ename from abc;

select * from for_view;

select view_name from user_views;

-- with check option(뷰를 생성할 때 조건제시에 사용된 컬럼값 변경 못하게) 실습
create or replace view view_check
as
select empno, ename, deptno from emp86 where deptno=20 with check option;

select * from view_check;

update view_check
set deptno=10 where empno=103;
/*  20번 부서번호는 뷰 생성시 with check option을 사용해서 뷰를통한 20번 붜번호 수정 못함
*/

--with read only 옵션을 사용한 뷰 생성
create or replace view only_view
as
select empno, ename
from emp86 where deptno=20 with read only;

select * from only_view;

update only_view set ename='홍길순' where empno=103; -- readonly 수정불가


-- rowNum 컬럼 실습
create table emp92(
    empno int primary key,
    ename varchar2(100),
    sal int
    );
    
insert into emp92 values (1, '홍길동', 1000);
insert into emp92 values (2, '이순신', 2000);
insert into emp92 values (3, '강감찬', 3000);

--rowNum은 값이 insert된 순서를 반환  
select rowNum, empno, ename, sal from emp92 order by empno asc;  
select rowNum, empno, ename, sal from emp92 order by empno desc;  


--저장공간이 필요 없는 가상테이블 뷰를 이용하여 rowNum 컬럼 순번을 변경
create or replace view row_view
as
select empno, ename, sal from emp92 order by empno desc;

select ename from row_view where rownum=1;