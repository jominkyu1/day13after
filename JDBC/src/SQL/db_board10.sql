-- 
CREATE TABLE tbl_board10(
    bno number(38) primary key, -- 글번호
    bname varchar2(50) not null, -- 글쓴이
    btitle varchar2(200) not null, -- 글제목
    bcont varchar2(4000) not null, -- 글내용
    bhit number(38) default 0, -- default 0 제약조건을 설정하면 기본값 0저장
    bdate date 
);

select * from tbl_board10 order by bno desc; -- bno(글번호)를 기준으로 내림차순 정렬

--bno_seq10 번호 발생기 시퀀스 생성
create sequence bno_seq10 start with 1 increment by 1 nocache; -- nocache 임시메모리 미사용

--시퀀스 번호값 확인
select bno_seq10.nextval from dual;

insert into tbl_board10 (bno, bname, btitle, bcont, bdate) values (bno_seq10.nextval, '홍길동', '글제목123', '내용123', sysdate);

COMMIT;

