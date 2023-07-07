--테이블명: guestbook
--  컬럼명: g_no, g_name, g_title, g_cont, g_date
 -- 자료형과 크기: number(38), varchar2(50), varchar2(200),varchar2(4000),date
 -- 제약조건: primary key, not null, not null, not null, null
  
  
CREATE TABLE guestbookT(
    g_no number(38) primary key,
    g_name varchar2(50) not null,
    g_title varchar2(200) not null,
    g_cont varchar2(4000) not null,
    g_date date null
    );

    
select * from guestbookT;
desc guestbook2;

[문항3] 다음과 같은 emp테이블을 생성합니다.
컬럼명 데이터타입 길이 제약조건 컬럼설명
empno number 10 primary key 사원번호
ename varchar2 50 not null 사원명
sal number 38 not null 월급
deptno number 10 null 부서번호
emp 사원 테이블을 생성하는 쿼리문을 기술하시고 생성한 테이블에 적절한 
레코드가 저장되었다는 가정하에 사원번호를 기준으로 내림차순 정렬하는 쿼리문을 기술하시오.


CREATE TABLE empTest(
    empno number(10) primary key, --사원번호
    ename varchar2(50) not null, --사원명
    sal number(38) not null, --월급
    deptno number(10) null --부서번호
    );
    
INSERT INTO empTest VALUES(10, '홍길동', 2500, 10);
INSERT INTO empTest VALUES(11, '유관순', 3000, 10);

SELECT * FROM empTest ORDER BY empno DESC;

