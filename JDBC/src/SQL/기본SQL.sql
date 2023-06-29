/* 사용 용도에 따른 SQL문 종류
    1. 데이터 정의어(DDL 문): 데이터베이스 관리자가 데이터베이스의 논리적 구조를 정의할때 사용하는 언어
    ex) create, alter(테이블 수정), drop(테이블 삭제), rename(테이블명 변경)
    
    2. 데이터 조작어(DML 문): 테이블 컬럼에 저장된 한 행의 자료집합인 레코드를 다룰때 사용하는 언어
    ex) insert, update(레코드 수정), delete(레코드 삭제)
    
    3. 데이터 제어어(DCL 문): 접근권한 부여 또는 취소할때 사용하는 언어
    ex) grant(접근 권한부여), revoke(권한 취소), 
    
    4. 트랜잭션 처리어(TCL 문): commit(정상적인 쿼리문 성공 반영), rollback(쿼리문 실행취소) 
    
    5. 데이터 질의어(검색, DQL 문): select문
    
*/

-- DDL문을 사용한 dept01 부서테이블 생성
create table dept01 (
    deptno number(38) primary key, -- 부서번호
    dname varchar2(50) not null, -- 부서명
    loc varchar2(20) not null -- 부서지역
);

-- 테이블 구조확인 명령어
DESC dept01;
DESCRIBE dept01;

--loc 컬럼크기를 20->30으로 변경
ALTER TABLE dept01 MODIFY loc varchar2(30);

--레코드 저장
INSERT INTO dept01 VALUES (50, '총무부', '서울');

--레코드 검색
SELECT * FROM dept01;

-- 50번 부서의 지역을 서울->부산으로 변경
UPDATE dept01 SET loc = '부산' WHERE deptno=50;

-- 50번 부서 레코드 삭제
DELETE FROM dept01 WHERE deptno=50;

-- dept01 테이블명변경
RENAME dept01 TO dept02;

-- 10부서 저장
INSERT INTO dept02 VALUES (10, '개발부', '판교');
SELECT * FROM dept02;

-- 잘 쓰지 않지만 truncate문으로 전체레코드 삭제
TRUNCATE TABLE dept02;

--dept02 테이블 삭제
DROP TABLE dept02;

--night 사용자로 사용가능한 테이블 정보를 확인
SELECT * FROM TAB;



    /*  산술연산자 종류)
        +, -, *, /, 
        
        sysdate : 오라클 날짜함수
    */
    
--오늘날짜확인
select sysdate as "오늘날짜" from dual; -- dual테이블은 오라클 임시테이블 (테스트용으로 주로 사용)

select (10+10) as "더하기", 
        (10*10) as "곱하기",
        (10/3) as "나누기" from dual;
        
--emp 사원테이블 생성
CREATE TABLE emp (
    empno int primary key, -- 사원번호, 원래 오라클에서는 int자료형 없으나 int타입으로 지정시 number(38)로 저장됨
    ename varchar2(20) not null, --사원명
    sal number(38) not null, --급여
    comm number(38), --보너스
    deptno number(38) not null-- 부서번호
);

SELECT * FROM emp ORDER BY empno desc; --내림차순

INSERT INTO emp VALUES (11, '홍길동', 1000, 100, 10);
INSERT INTO emp (empno, ename, sal, deptno) VALUES (12, '이순신', 1500, 10);

--연봉계산
SELECT ename, sal*12+comm as "연봉" from emp; 

--연산식에 null이 있을경우 NVL() 함수 사용하여 null을 0으로 변경
SELECT ename as "이름", sal*12+NVL(comm, 0) as "연봉" from emp;




INSERT INTO emp VALUES (13, '신사임당', 2000, 200, 10);

SELECT deptno FROM emp;

 -- distinct 예약어는 중복 레코드를 한번만 나오게 한다.
SELECT DISTINCT deptno FROM emp;


/*  오라클 SQL Developer는 insert, update, delete문 수행 후 쿼리문이 오라클에 자동반영되는 오토커밋이 아니다
    그러므로 반드시 이 3가지 쿼리문 수행 후에는 트랜젝션 commit명령어로 성공 반영하여 쿼리문을 정상 수행되게 해야함  
*/
COMMIT;

select * from emp order by empno desc;

select * from emp where sal>=1500;

/* 오라클 비교연산자 종류
    =(같다), >, <, >=, <=, 
    <>, !=, ^= (다르다 3가지)
*/

-- 10번부서번호 레코드 검색
SELECT * FROM emp WHERE deptno=10; 

/*
    SQL문은 영문 대소문자를 구분하지 않는다. 하지만 영문자 레코드 자료는 대소문자를 구분한다.
*/

INSERT INTO emp VALUES (14, 'ford', 3000, 300, 30 );

SELECT * FROM emp WHERE ename='Ford';   -- Ford 검색 불가능
SELECT * FROM emp WHERE ename='ford';   -- ford 검색 가능

/* 논리 연산자 종류
    1. AND : 두가지 조건 모두 만족
    2. OR   : 한가지만 만족
    3. NOT : ~가 아닌경우에만
*/

SELECT * FROM emp WHERE ename='이순신' AND deptno=10;
SELECT * FROM emp WHERE deptno=10 OR deptno=20;

SELECT * FROM emp WHERE NOT deptno=10;
SELECT * FROM emp WHERE deptno != 10;
SELECT * FROM emp WHERE deptno <> 10;
SELECT * FROM emp WHERE deptno ^= 10;

select * from emp order by empno desc;

--급여 1500~3000
SELECT * FROM emp WHERE sal>=1500 AND sal<=3000;

--급여 1500이하거나 3000이상
SELECT * FROM emp WHERE sal>=3000 OR sal<=1500;

--보너스가 100이거나 200이거나 null인 경우
SELECT * FROM emp WHERE comm<=200 OR comm IS NULL ;

/*  컬럼명 between A and B 연산 특징)
    특정 범위의 값을 조회하기 위해 사용.
    A에는 범위의 최소값 B에는 범위의 최대값.
*/

--급여 1000~2000
SELECT * FROM emp WHERE sal BETWEEN 1000 and 2000;

--문제) 급여가 1500에서 2500사이가 아닌 사원
SELECT * FROM emp WHERE sal NOT BETWEEN 1000 and 2000;

/*  IN 연산의 특징)
    예를 들면 보너스가 300혹은 500혹은 1000인 사원을 물어 볼때는 특정 컬럼의 값이 여러 개의 값 중에서 하나 인지를 물어봐야 하는데
    이때 사용하는 연산자가 in 연산자이다
    
    사용형식) 컬럼명 in(A, B, C)
    특정 컬럼의 값이 A, B, C 중에 하나만 만족하면 출력되도록 하는 표현을 할 때 사용
    IN 연산자는 or연산자로 대체 가능.
*/

select * from emp order by empno desc;

SELECT * FROM emp WHERE SAL IN(1000, 1500, 2000);
SELECT * FROM emp WHERE sal=1000 OR sal=1500 OR sal=2000;

--문제) 보너스가 100,200, null이 아닌 사원을 논리연산자와 비교연산자 등을 사용해서 구해보기
SELECT * FROM emp WHERE comm != 100 AND comm != 200 AND comm IS NOT NULL;
SELECT * FROM emp WHERE comm NOT BETWEEN 100 and 200 AND comm IS NOT NULL;

--문제) IN 연산자를 사용하여 급여가 1000, 2000, 3000이 아닌 사원
SELECT * FROM emp WHERE sal NOT IN(1000, 2000, 3000);
SELECT * FROM emp WHERE NOT (sal=1000 or sal=2000 or sal=3000);

SELECT * FROM emp WHERE sal ^= 1000 and sal != 2000 and sal <> 3000;

/*  like 검색 연산자)
    1. 검색하려는 값을 정확히 모를 경우에 와일드카드 문자인 %, _와 함께 사용
    2. 와일드 카드 문자 종류
        % : 하나 이상의 임의의 모르는 문자와 매핑대응
        _ : 임의의 모르는 하나의 문자와 매핑 대응
*/

-- f로 시작하는 사원명 검색
SELECT * FROM emp WHERE ename LIKE 'f%';

--r을 포함하는 사원을 검색
SELECT * FROM emp WHERE ename LIKE '%r%'; -- 가장 많이 사용

--문제) _ 와일드 카드 문자와 like 검색 키워드를 사용하여  순신으로 끝나는 사원인 이순신 검색
SELECT * FROM emp WHERE ename LIKE '_순신';

--홍길동 제외 검색
SELECT * FROM emp WHERE ename NOT LIKE('_길_');

--ORDER BY를 이용한 정렬
--  ASC : 오름차순 (생략가능, 123 abc 가나다)
--  DESC : 내림차순

SELECT * FROM emp ORDER BY empno DESC;
SELECT * FROM emp ORDER BY ename DESC;
