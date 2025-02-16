# Write your MySQL query statement below
SELECT name AS Employee
FROM Employee e1
WHERE SALARY > (SELECT SALARY FROM Employee e2 WHERE e1.ManagerId = e2.ID);