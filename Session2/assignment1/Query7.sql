USE LIS;

SELECT category,COUNT(member_nm) AS Number FROM members GROUP BY category;