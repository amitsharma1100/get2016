USE LIS;

/*
Create a View which contains three columns, member name,
member id and full description of category, i.e., Faculty, Students
and Others instead of F,S and O
*/
CREATE VIEW membersView AS
(
SELECT member_id,member_nm,CASE 
WHEN category="F" THEN 'Faculty'
WHEN category="S" THEN 'Student'
ELSE "Others" END AS Full_Description FROM members
);