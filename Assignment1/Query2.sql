USE LIS;

/*
Write a SELECT command to display information on the books
that have not been returned till date. The information should
include book issue date, title, member name and due date.
Note: Use Correlated Subquery.
*/

SELECT t.title_nm AS Title, m.member_nm AS Member,bi.issue_dt AS Issue_Date,bi.due_dt AS Due_Date FROM book_issue bi
INNER JOIN members m ON bi.member_id = m.member_id
INNER JOIN books b ON bi.accession_no = b.accession_no
INNER JOIN titles t ON b.title_id = t.title_id
WHERE (
bi.issue_dt, bi.accession_no, bi.member_id) NOT IN
(
SELECT br.issue_dt, br.accession_no, br.member_id FROM book_return br
);