USE LIS;

/*
Create a View which contains the information – subject name,
title, member name, category, issue date, due date and return
date. If the books have not been returned, NULL should be
displayed instead of return date.
*/

CREATE VIEW BooksIssueDetails AS (
SELECT s.subject_nm AS Subject,t.title_nm AS Title,m.member_nm AS Member_name,m.category AS Category,bi.issue_dt AS Issue_Date,bi.due_dt AS Due_Dt 
FROM members m,book_issue bi,books b,titles t,subjects s
WHERE m.member_id=bi.member_id && bi.accession_no=b.accession_no && b.title_id=t.title_id && t.subject_id=s.subject_id
);