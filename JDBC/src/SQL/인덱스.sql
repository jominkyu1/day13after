/*  오라클에서 인덱스를 사용하는 목적 -> 보다 더 빠른 검색을 하기 위해
    테이블 생성시 기본키 또는 유일키  제약조건을 설정하면 오라클에서 해당 컬럼에 기본으로 인덱스를 생성해준다.
    */
    
create table emp201(
    empno int primary key,
    ename varchar2(100),
    sal int
    );
    
    insert into emp201 values (11, '홍길동', 100);
    insert into emp201 values (12, '이순신', 200);
    insert into emp201 values (13, '강감찬', 300);
    
    select * from emp201;
    
create table emp202
as
select * from emp201;


select table_name, index_name, column_name from user_ind_columns
where table_name in('EMP201', 'EMP202');
/* INDEX_NAME컬럼에는 인덱스명이 저장되어있고, emp201 원본 테이블의 기본키로 설정된 empno컬럼에만 오라클에서 제공한
기본 인덱스가 설정되어있다. 결국 복제본 테이블에는 원본의 인덱스까지는 복제되지 않는다*/

select * from emp202; -- emp202 복제테이블에는 원본테이블의 기본키 제약조건이 복제되지 않는다.

insert into emp202 values (11, '홍길순', 500);

-- emp202 복제본 테이블에 인덱스 추가
create index idx_emp22_ename
on emp202(ename);

create index idx_emp202_empno
on emp202(empno);

drop index idx_emp202_empno;