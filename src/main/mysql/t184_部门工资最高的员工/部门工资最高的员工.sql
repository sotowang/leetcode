select d.Name as Department,e.Name as Employee, e.Salary
from Employee e , Department d
where  e.DepartmentId = d.Id
  and
        (e.Salary,e.DepartmentId) in
        (select max(Salary) m,e.DepartmentId from Employee e group by e.DepartmentId) order by e.Salary;