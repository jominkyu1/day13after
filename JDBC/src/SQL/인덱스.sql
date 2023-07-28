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


--where 조건절을 거짓으로해서 테이블 구조만 복제하고 레코드는 복제하지않는다. 복제되는 테이블에는
--제약조건과 인덱스는 복제되지 않는다.

create table emp203
as
select * from emp202 where 10=0;

select * from emp203;

insert into emp203 values (11, '신사임당님', 1000);
insert into emp203 values (12, '홍길동', 2000);
insert into emp203 values (13, '강감찬', 3000);

commit;

--중복번호가 없는 empno컬럼에 고유 인덱스를 설정
create unique index idx_emp203_empno on emp203(empno);

select table_name, index_name, column_name from user_ind_columns
where table_name = 'EMP203';

update emp203 set ename='신사임당님' where empno=13;

--중복 레코드가 존재할 수 있는 비고유 인덱스 생성
create index idx_emp203_ename on emp203(ename);

select * from emp;


-- night 계정으로 user01 사용자에게 할당된 권한등을 조회
select grantee, table_name, grantor, privilege from user_tab_privs_made;

/*  GRANTEE 컬럼: 권한이 할당된 사용자명
    TABLE_NAME : 권한이 할당된 테이블명
    GRANTOR : 권한을 준 사용자명
    PRIVILEGE : 주어진 권한
*/

revoke select on emp from user01; -- USER01 사용자의 emp테이블 조회권한 박탈

create table membertest1(
    id int generated by default as identity,
    name varchar(255),
    primary key(id)
    );
    
    
    select * from membertest1;
    
    insert into membertest1 (name) values ('홍길순');
    
create table membertest2(
    id int generated by default as IDENTITY primary key,
    id2 int generated by default as identity
    );
    