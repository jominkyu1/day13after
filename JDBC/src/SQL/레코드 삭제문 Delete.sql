select * from dept01;
select * from dept05;

--Updatesql문에서 생성한 table dept01의 deptno(부서번호) 40 삭제
delete from dept01 where deptno=40;

-- 경리부(10) 부서번호에 해당하는 dept05 레코드 삭제 (서브쿼리문)
delete from dept05 where deptno=(select deptno from dept01 where dname='경리부');