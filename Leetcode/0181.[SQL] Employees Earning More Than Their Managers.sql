# Write your MySQL query statement below
SELECT B.name as Employee
FROM employee A JOIN employee B
WHERE A.Id = B.ManagerId AND A.salary < B.salary 

# In other words:
# Write your MySQL query statement below
SELECT A.name as Employee
FROM employee A JOIN employee B
WHERE A.ManagerId = B.Id AND A.salary > B.salary