create sequence dept_deptno_seq
start with 1
increment by 1
nocache;


select sequence_name, max_value, increment_by from user_sequences;


create sequence dept_test
start with 10
increment by 10
maxvalue 30;

select dept_test.nextval from dual; 

-- dept_test 시퀀스 최대값을 30에서 1000으로 수정
alter sequence dept_test maxvalue 1000;