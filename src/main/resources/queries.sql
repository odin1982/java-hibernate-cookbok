select * from employee;
select * from department;
select * from tbl_escuela;
select * from estudiante;
select * from email;
select * from degree;
select * from teacher;

select
        this_.id as id1_1_1_,
        this_.department as departme5_1_1_,
        this_.emp_code as emp_code2_1_1_,
        this_.firstname as firstnam3_1_1_,
        this_.salary as salary4_1_1_,
        department2_.id as id1_0_0_,
        department2_.deptName as deptname2_0_0_ 
    from
        employee this_ 
    left outer join
        department department2_ 
            on this_.department=department2_.id 
    order by
        this_.firstname desc;