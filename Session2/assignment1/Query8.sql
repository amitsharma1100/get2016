USE LIS;

SELECT m1.member_nm FROM members m1 
INNER JOIN members m2 ON m1.category IN (
SELECT m2.category FROM members WHERE m2.member_nm="Keshav Sharma");