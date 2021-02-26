# Write your MySQL query statement below
SELECT A.id  
FROM weather A JOIN weather B
ON A.id = B.id + 1 
WHERE A.temperature > B.temperature 