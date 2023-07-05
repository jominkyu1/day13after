create table dept05(
    deptno number(38) primary key,
    dname varchar2(100) not null
    );

insert into dept05 values(10, '관리부');
insert into dept05 values(20, '영업부');
insert into dept05 values(30, '언구부');

select * from dept05;


create table emp05(
    empno int primary key,
    ename varchar2(20),
    job varchar2(50),
    sal int,
    comm int,
    deptno number(38)
);

insert into emp05 values (11, '홍길동', '관리사원', 1500, 0, 10);
insert into emp05 values (12, '이순신', '영업사원', 1200, 120, 20);
insert into emp05 values (13, '강감찬', '영업사원', 1300, 130, 20);
insert into emp05 values (14, '신사임당', '연구원', 3000, 300, 30);

-- 사원번호 기준으로 오름차순정렬
select * from emp05 order by empno;

-- cross join (거의 사용X)
select * from dept05, emp05;


--Room 테이블 생성
create table room(
    roomno number(38) primary key,
    roomname varchar2(50) not null
);

insert into room values(404, '홍길동 샘');
insert into room values(405, '이순신 샘');

select * from room;

commit;

--학생 테이블 생성
create table st03(
    stno int primary key,
    stname varchar2(20) not null,
    roomno number(38)
);

insert into st03 values (101, '유관순 학생', 404);
insert into st03 values (102, '을지문덕 학생', 405);
insert into st03 values (103, '신사임당 학생', 405);

select * from st03 order by stno;

commit;

-- roomno 공통 칼럼을 기준으로 Equi join
select * from room, st03 where room.roomno = st03.roomno;

--신사임당 학생의 Equi join
select room.roomno, roomname, stno, stname from room, st03 where room.roomno = st03.roomno and stname='신사임당 학생';

--like 검색연산자를 사용하여 '덕' 학생이 포함된 Equi 조인검색
select room.roomno, roomname, stno, stname from room, st03 where room.roomno = st03.roomno and stname like '%덕%';

--신으로 시작하는 임이의 모르는 학생 equi 조인검색 (테이블명 별칭을 사용)
select stno, stname, r.roomno, roomname from room r, st03 s --테이블명 별칭을 r, s로 사용
where r.roomno = s.roomno
and stname like '신%';


--non equi join 검색 실습을위한 급여등급 테이블생성
create table salgrade(
    grade int primary key,
    LOSAL int not null,
    HISAL int not null
);

insert into salgrade values(1, 700, 1200);
insert into salgrade values(2, 1201, 1400);
insert into salgrade values(3, 1401, 3000);

commit; 

select * from salgrade;
select * from emp05;

--  where 조건절에서 특정 범위내의 조인 조건으로 검색하는 기법인 Non equi join

select ename, sal, grade from emp05, salgrade where sal between LOSAL and HISAL;
select e.ename, e.sal, s.grade from emp05 e, salgrade s where e.sal >= s.LOSAL and e.sal <= s.HISAL;

-- emp05와 dept05는 공통칼럼 기준 deptno에 의한 Equi 조인 + 급여등급 테이블 salgrade Non Equi 조인
-- 3개 테이블 검색 => Equi조인 + Non equi조인

select e.ename, e.sal, s.grade, d.deptno, d.dname 
from emp05 e, dept05 d, salgrade s
where e.deptno = d.deptno and e.sal between s.losal and s.hisal;










