CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    Declare offset_val int;
     set offset_val=N-1;

  RETURN (
      
     select distinct salary from Employee order by salary desc limit offset_val,1
       );
END