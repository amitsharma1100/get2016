USE LIS;

SELECT GROUP_CONCAT( distinct m.category),GROUP_CONCAT(m.membercount) 
FROM (SELECT category,count(category) as membercount from members group by category) as m;