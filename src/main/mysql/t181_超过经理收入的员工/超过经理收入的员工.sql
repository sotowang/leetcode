# Write your MySQL query statement below
select e1.Name as 'Employee' from Employee as e1  where Salary>(select e2.Salary from Employee as e2 where e2.Id = e1.ManagerId);