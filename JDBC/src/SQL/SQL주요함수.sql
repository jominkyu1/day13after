--곱셈연산
SELECT
    2 * 5
FROM
    dual;

--오늘 날짜

SELECT
    sysdate
FROM
    dual;

-- ABS (절대값) 함수

SELECT
    abs(- 100)
FROM
    dual;

-- FLOOR 소수점 이하를 버림. 반올림 안함.

SELECT
    floor(123.456)
FROM
    dual;

-- ROUND 특정자리까지 반올림 (대상, 자릿수)

SELECT
    round(34.5678, 2)
FROM
    dual;

-- TRUNC 특정자리까지 표현

SELECT
    trunc(34.5678, 2)
FROM
    dual;

-- MOD 나머지

SELECT
    mod(7, 3)
FROM
    dual;

-- UPPER 대문자로
-- LOWER 소문자로

SELECT
    upper('oracle'),
    lower('ORACLE')
FROM
    dual;

-- TRIM 공백제거 함수

SELECT
    ltrim('      Oracle')
FROM
    dual;

SELECT
    rtrim('Oracle         ')
FROM
    dual;

SELECT
    TRIM('    1   Oracle    1     ')
FROM
    dual;

-- 날짜함수를 활용

SELECT
    sysdate - 1 AS "어제날짜",
    sysdate     AS "오늘날짜",
    sysdate + 1 AS "내일날짜"
FROM
    dual;

/*  형변환 함수 종류
    to_char() : 날짜형 또는 숫자형을 문자형으로
    to_date() : 문자형을 날짜형으로
    to_number() : 문자형을 숫자형으로
*/

SELECT
    sysdate,
    to_char(sysdate, 'YYYY-MM-DD')
FROM
    dual;

/*  NVL 함수 
    레코드가 null일경우 연산불가, NVL함수를 이용해 null값을 지정값으로 치환
*/

SELECT
    *
FROM
    emp
ORDER BY
    empno;

SELECT
    sal * 12 + nvl(comm, 0)
FROM
    emp
WHERE
    empno = 12;

CREATE TABLE emp01 (
    deptno INT PRIMARY KEY,
    ename  VARCHAR2(20) NOT NULL
);

INSERT INTO emp01 VALUES (
    10,
    'miller'
);

INSERT INTO emp01 VALUES (
    20,
    'smith'
);

INSERT INTO emp01 VALUES (
    30,
    'jones'
);

SELECT
    *
FROM
    emp01;

-- 문제) 기존 테이블과 레코드를 유지한채 deptno 칼럼의 제약조건 기본키를 제거해서 중복 부서번호가 저장되게 만들어보자

ALTER TABLE emp01 DROP PRIMARY KEY;

INSERT INTO emp01 VALUES (
    20,
    'blue'
);

DESC emp01;

--DECODE (switch case와 비슷) 함수

SELECT
    deptno,
    ename,
    decode(deptno, 10, '개발부', 20, '기획부',
           30, '디자인부')
FROM
    emp01;
    
--CASE (if~else와 비슷) 함수

SELECT
    ename,
    deptno,
    CASE
        WHEN deptno = 10 THEN
            '디자인부'
        WHEN deptno = 20 THEN
            '개발부서'
        ELSE
            '경리부서'
    END
FROM
    emp01;

/*  그룹함수
    COUNT() 레코드 갯수
    SUM() 합계
    AVG() 평균
    MAX, MIN
    STDDEV 표준편차
    VARIANCE 분산
*/

--그룹함수 테이블생성

CREATE TABLE emp02 (
    deptno INT PRIMARY KEY,
    ename  VARCHAR2(20) NOT NULL,
    sal    INT,
    comm   INT,
    job    VARCHAR2(50) NOT NULL
);

DESC emp02;

SELECT
    *
FROM
    emp02
ORDER BY
    deptno;

INSERT INTO emp02 VALUES (
    20,
    'Gos',
    3000,
    500,
    '기타'
);

--전체사원의 월급의 총합

SELECT
    SUM(sal)
FROM
    emp02;

-- SUM함수는 null을 제외하고 계산

SELECT
    SUM(comm)
FROM
    emp02;

SELECT
    MAX(sal),
    MIN(sal),
    AVG(sal)
FROM
    emp02;
    
-- 보너스 수령하는 사원수와 총 사원수

SELECT
    COUNT(*)    AS "총 사원수",
    COUNT(comm) AS "보너스 받는 사원수"
FROM
    emp02;

SELECT
    deptno,
    SUM(sal)
FROM
    emp02
GROUP BY
    deptno
HAVING
    SUM(sal) > 3000;

COMMIT;

SELECT
    *
FROM
    emp02;

SELECT
    COUNT(DISTINCT job)
FROM
    emp02;

-- 부서별 최대급여 최소급여
SELECT
    deptno,
    MAX(sal)
FROM
    emp02
GROUP BY
    deptno;
    
-- 급여 평균이 2000이상인 부서만 출력
select deptno, avg(sal) from emp02 group by deptno having avg(sal)>=2000;

-- 부서별 최대급여가 1500이상인 경우 부서번호, 부서별 최대급여, 최소급여 출력
select deptno, max(sal), min(sal) from emp02 group by deptno having max(sal)>=1000;





