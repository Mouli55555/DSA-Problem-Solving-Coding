# Write your MySQL query statement below
SELECT firstname,lastname,city,state FROM Person LEFT OUTER JOIN Address ON Person.PersonId = Address.PersonId;