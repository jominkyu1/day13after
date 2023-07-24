-- 기본키, 외래키 관계인 주종관계 테이블 생성
-- 먼저 기본키를 가진 주인테이블 생성

create table dept91(
    deptno int constraint dept91_deptno_pk primary key, --부서번호
    dname varchar2(50),
    LOC varchar2(50)
    );
    
insert into dept91 values (10, '경리부', '서울');
insert into dept91 values (20, '영업부', '부산');

--외래키가 포함된 emp91 생성
create table emp91(
    empno number(38) constraint emp91_empno_pk primary key,
    ename varchar2(50) constraint emp91_ename_nn not null,
    job varchar2(50),
    deptno number(38) constraint emp91_deptno_fk references dept91(deptno)
    );
    
insert into emp91 values (11, '홍길동', '경리부장', 10);
insert into emp91 values (12, '이순신', '영업부장', 20);

select * from dept91;
select * from emp91;

--외래키로 설정된 컬럼에 레코드가 있는 상태에서 주인키 부서번호 10번 삭제시도
delete from dept91 where deptno=10; --자식 레코드가 있으므로 삭제불가능

--emp91테이블 외래키를 삭제하지 않고 잠시 비활성화
alter table emp91 disable constraint emp91_deptno_fk;

select constraint_name, status from user_constraints where table_name='EMP91';
/*  STATUS 컬럼은 활성화 상태를 보여줌 */

--제약조건 비활성화 된 상태에서 DEPT91 테이블의 10번 부서번호 삭제
delete from dept91 where deptno=10;

select * from dept91;

--emp91_deptno_fk 외래키 제약조건 활성화 (부모키 값 추가한 후 활성화)
alter table emp91 enable constraint emp91_deptno_fk;
insert into dept91 values(10, '경리부', '서울');

/* CASCADE 옵션을 사용하기위한 주종관계 부모와 자손 테이블 생성
*/

--기본키가 있는 부서테이블 생성)
create table dept81(
    deptno number(38) constraint dept81_deptno_pk primary key,
    dname varchar2(50),
    LOC varchar2(50)
    );

insert into dept81 values (101, '관리부', '서울');
insert into dept81 values (102, '개발부', '여수');

select * from dept81 order by deptno;

--외래키가 있는 사원테이블 생성
create table emp81(
    empno number(38) constraint emp81_empno_pk primary key,
    ename varchar2(50) constraint emp81_ename_nn not null,
    job varchar2(50),
    deptno int constraint emp81_deptno_fk references dept81(deptno)
    );
    
    insert into emp81 values (7001, '이순신', '관리사원', 101);
    insert into emp81 values (7002, '강감찬', 'java 개발자', 102);
    
select constraint_name, constraint_type, table_name, r_constraint_name, status from user_constraints
where table_name in('DEPT81', 'EMP81');

/*  CASCADE 옵션을 사용하여 DEPT81테이블의 기본키 제약조건을 비활성화하면 emp81 테이블의
    외래키 제약조건까지 한번에 비활성화된다.
*/
alter table dept81 disable primary key cascade;

alter table dept81 drop primary key; -- 기본키와 외래키가 함께 비활성화 되어 있어도 기본키 삭제 불가능    
alter table dept81 drop primary key cascade; --cascade 옵션으로 기본키를 삭제하면 외래키까지 한번에 삭제