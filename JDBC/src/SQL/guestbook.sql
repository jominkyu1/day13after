--오라클 한줄 주석문 기호
/* 오라클 한줄 이상 주석 */

--guestbook 테이블생성
create table guest(
    gno number(38) primary key, --방명록 번호
    gname varchar2(20) not null, -- 글쓴이
    gtitle varchar2(200) not null, -- 글제목
    gcont varchar2(4000) not null, --글내용
    gdate date --등록날짜
);

--생성된 guest 테이블 컬럼 목록을 확인
SELECT * FROM guest;

/* 오라클 자료형 종류
    1. number(38) : 최대 자릿수가 38자까지인 정수숫자를 저장할 수 있는 정수숫자형
    2. varchar2 : 가변문자형
    3. date : 날짜 타입
    
    
    제약조건이란? 테이블 컬럼에 저장되는 자료에 어떠한 제한을 거는것
    제약조건 종류
    1. primary key(기본키): 중복 자료 저장 금지, null 저장 금지
    2. not null: 중복 자료 저장 허용, null 저장 금지
    
    각 컬럼에 저장된 한 행의 자료 집합을 레코드라 한다.
    
    오라클 시퀀스 객체의 특징)
    1. 번호 발생기. 시퀀스는 정수 숫자형으로 선언되고 기본키 제약조건으로 선언된
        컬럼 필드에 사용됨
    2. 중복자료가 없고 null이 없는 컬럼에 저장되는 값으로 정수 번호값으로 활용하면된다
*/

-- guno_seq라는 시퀀스 객체 생성

create sequence guno_seq
start with 1   --1부터 시작
increment by 1 --1씩증가
nocache; --임시메모리 미사용

-- 생성된 guno_seq 시퀀스 번호값 확인
select guno_seq.nextval as "시퀀스번호값" from dual;

/* 시퀀스명.nextval로 다음 시퀀스 번호값을 확인
    as "시퀀스번호값" 쿼리문은 검색되는 임시 컬럼 별칭명 (실제 컬럼이 생성되지않음)
    dual은 오라클 설치시 설치되는 임시 테이블로 오라클 연산,함수,시퀀스 등 값을 확인하는 용도로 사용
*/

/*  DML조작어 중에서 레코드 저장문인 INSERT 문법구조
    insert into 테이블명 (컬럼목록) values(값);
    insert 문에서 컬럼 목록을 생략하면 테이블 생성시 생성한 컬럼순번대로 자료가 저장됨
    전체 컬럼에 레코드저장시에는 컬럼목록 생략
*/

insert into guest values(guno_seq.nextval, '홍길동', '방명록제목01', '방명록내용01', sysdate);
-- 쿼리문에서 문자열은 작은 따옴표로 처리함. 대소문자 구분X
insert into guest values(guno_seq.nextval, '이순신', '방명록제목02', '방명록내용02', sysdate);
--  sysdate는 오라클 날짜함수

select sysdate as "오늘날짜" from dual;

/* 래코드 검색 문법 형식
    SELECT 검색목록 FROM 테이블명 WHERE 조건식 ORDER BY 기준필드(컬럼)명 ASC
    
    ORDER BY는 정렬문(ASC생략가능, 오름차순 | DESC는 내림차순)
    오름차순 정렬규칙)
    1. 숫자는 작은숫자부터
    2. 한글은 가나다순
    3. 영어는 알파벳순
*/

SELECT * FROM guest ORDER BY gno DESC; --큰 숫자순으로 정렬

/*  레코드 수정문 문법 형식)
    update 테이블명 set 컬럼명 = 수정할 값 where 조건;
*/

UPDATE guest set gtitle='수정제목01', gcont='수정내용01' where gno=11;
SELECT gtitle, gcont FROM guest WHERE gno=11;


/*  레코드 삭제문 형식 문법)
    DELETE FROM 테이블명;
    where 조건식이 없으면 전체 레코드 삭제. 주의
    
    delete from 테이블명 where 조건
    조건에 맞는 레코드만삭제
*/



--    문제1. ) 시퀀스를 사용하지 않고 다음과 같은 레코드를 저장
--    21, 을지문덕, 제목21, 내용21, 현재날짜
insert into guest values('21', '을지문덕', '제목21', '내용21', sysdate);
--    문제2. ) 21번행을 출력
select * from guest where gno=21;
--    문제3. ) 21번을 기준으로 이름을 강감찬, 제목을 수정제목21, 내용을 수정내용21로 변경
update guest set gname='강감찬', gtitle='수정제목21', gcont='수정내용21' where gno=21;
