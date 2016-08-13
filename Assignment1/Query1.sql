USE LIS;

/*
1. Write a SELECT command to display name of those members
who belong to the category as to which member
“Jon Snow” belongs.
Note: Solve the problem using subquery.
*/

SELECT member_nm FROM members WHERE category IN ( SELECT DISTINCT category FROM members WHERE member_nm="Jon Snow");