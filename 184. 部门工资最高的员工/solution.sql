select d.Name as Department, e.Name as Employee, Salary
from Employee as e
inner join Department as d
on e.DepartmentId = d.id
where e.Salary=(Select max(Salary) from Employee where e.DepartmentId=d.Id)

select d.Name as Department,e.Name as Employee,e.Salary
from Department d,Employee e
where e.DepartmentId=d.Id and e.Salary=(Select max(Salary) from Employee where DepartmentId=d.Id)

select d.Name as Department,e.Name as Employee,Salary 
from Employee e join Department d on e.DepartmentId=d.Id 
where (e.Salary,e.DepartmentId) in (select max(Salary),DepartmentId from Employee group by DepartmentId) 
