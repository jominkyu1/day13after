create table dept51(
    deptno number(38) primary key,
    dname varchar2(50)
);

insert into dept51 values (101, '영업부');
insert into dept51 values (102, '인사부');

select * from dept51;

--복제본 테이블(dept52) 생성
create table dept52 as select * from dept51;
select * from dept52;

delete from dept52;
rollback; -- commit 하기전이면 롤백 가능

delete from dept52 where deptno=101;
commit;
rollback; -- commit 된 쿼리문은 롤백 불가능

-- Auto commit 실습을 위한 복제테이블 dept53 생성
create table dept53 as select * from dept51;
select * from dept53;

delete from dept53 where deptno=102;
create table dept_copy53 as select * from dept51; -- 오토 커밋문 실행
rollback; -- dept53에서 삭제된 deptno 102 롤백 불가능

delete from dept53 where deptno=101;
truncate table dddd; -- truncate 실행실패해도 오토커밋문이므로 위에 delete문은 반영되어 롤백불가
rollback;

-- Savepoint 문 실습을 위한 레코드 4개 저장
insert into dept53 values(101, '개발부');
insert into dept53 values(102, '관리부');
insert into dept53 values(103, '인사부');
insert into dept53 values(104, '경리부');
    select * from dept53;

delete from dept53 where deptno=104;
commit;

delete from dept53 where deptno=103;
savepoint c01;

delete from dept53 where deptno=102;
savepoint c02;

delete from dept53 where deptno=101;
savepoint c03;

    select * from dept53;
    
rollback to c02;
rollback to c01;

/*  락이 걸린 무한대기상태를 만들기 위한 복제본 테이블을 생성
*/

create table dept55 as select * from dept;
select * from dept55;

--truncate문에 의한 전체 레코드 삭제
truncate table dept55;
rollback; --truncate는 auto commit이므로 롤백 불가능

