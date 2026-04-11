select e.employee_id from Employees e
left join Salaries s
on e.employee_id=s.employee_id where name is null or salary is null
union all
select s.employee_id from salaries s
left join Employees e
on e.employee_id=s.employee_id where name is null or salary is null order by employee_id;