--SEL_BOARD10 저장 프로시저 생성

create or replace procedure sel_board10 --or replace 옵션은 기존의 저장프로시저가 존재할경우 지우고 재 생성
(
    vno in tbl_board10.bno%type, --vno 변수타입은 tbl_board10테이블의 bno 컬럼 타입을 따라간다.
    --in 값을 입력받아서 전달할때 사용
    vname out tbl_board10.bname%type,
    --out btitle 컬럼 레코드값을 되돌려 받을 때 사용
    vtitle out tbl_board10.btitle%type,
    vcont out tbl_board10.bcont%type
)

is
begin -- begin ~ end사이에 실제 실행할 sql문이 들어간다.
    select bname, btitle, bcont into vname, vtitle, vcont from tbl_board10 where bno=vno;
end; -- begin ~ end => PL-SQL문
/