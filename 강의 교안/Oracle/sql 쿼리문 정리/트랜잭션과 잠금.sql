/*
 1.오라클은 여러명의 사용자가 동시에 하나의 테이블에
 접근하여 DML(insert,update,delete) 조작시 특정 사용자
 가 자원을 독점하지 못하게 하기 위해서 락(잠금)을 발
 생시킨다.
 2.이러한 락을 해제 할려면 트랜잭션을 처리해야한다.
 곧 commit,rollback 처리를 해야 한다.
 
*/
락이 걸려 무한 대기 상태 실습)

select * from dept;

복제본 테이블 dept55)
 create table dept55
 as
 select * from dept;
 
 select * from dept55;
 
 /*
   3.데드락(Dead Lock) 이란?
     가.서로 락 즉 잠금 상태가 되어져서 무한 대기 상태
     인 경우를 Dead Lock이라 한다. 오라클에서 dead
     lock이 걸리면 자원을 사용할 수 없는 상태가 된다.
     
     나. 이러한 데드락이 발생하면 오라클은 기본으로
     오라클을 사용하지 못하는 상황을 방지하기 위해서
     다음과 같은 메시지를 보내면서 비 정상적인 종료를
     하게 한다.
     
       메시지 ) ORA-00060:자원 대기중 교착 상태가 검
       출되었습니다. 
 */
 
 
 
 
 
 